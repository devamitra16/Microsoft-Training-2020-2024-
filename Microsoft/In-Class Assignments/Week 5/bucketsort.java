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
        return max;
    }
    public static void bucketsort(int[] arr,int n){
        int max=findmax(arr,n);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<=max;i++){
            res.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            res.get(arr[i]).add(arr[i]);
        }
        int pos=0;
        for(int i=0;i<=max;i++){
           for(int k=0;k<res.get(i).size();k++){
               arr[pos++]=res.get(i).get(k);
           } 
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		bucketsort(arr,n);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
