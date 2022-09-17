import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int first=arr[0]>arr[1]?arr[0]:arr[1];
    int second=arr[0]<arr[1]?arr[0]:arr[1];
    for(int i=2;i<n;i++){
      if(arr[i]>first){
        second=first;
        first=arr[i];
        
      }else if(arr[i]>second){
        second=arr[i];
      }
    }
    System.out.println("second largest element is "+second);
    
  }
}
