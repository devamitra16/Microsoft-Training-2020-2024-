import java.util.*;
public class Main
{
    public static int findmax(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max+1;
    }
    public static int[] countsort(int[] arr,int n){
        int size=findmax(arr,n);
        int[] countArray=new int[size];
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            countArray[arr[i]]++;
        }
        for(int i=1;i<size;i++){
            countArray[i]+=countArray[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int pos=--countArray[arr[i]];
            res[pos]=arr[i];
        }
        return res;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		arr=countsort(arr,n);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
