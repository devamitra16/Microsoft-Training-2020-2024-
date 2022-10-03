import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
   
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      
    }
    quicksort(arr,0,n-1);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
  static void quicksort(int[] arr,int l,int r){
    if(l<r){
     
      int mid=partition(arr,l,r);
      quicksort(arr,l,mid-1);
      quicksort(arr,mid+1,r);
    }
  }
  static int partition(int[] arr,int l,int r){
    int pivot=arr[l];
    int i=l,j=r;
    while(i<j){
      while(arr[i]<=pivot && i<r){
        i++;
      }
      while(arr[j]>pivot && j>0){
        j--;
      }
      if(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
    arr[l]=arr[j];
    arr[j]=pivot;
    return j;
  }
}
