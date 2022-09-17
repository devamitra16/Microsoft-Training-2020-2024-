import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int lcm=(a/gcd(a,b))*b;
    System.out.println("The lcm is "+lcm);
  }
  private static int gcd(int a,int b){
    return b==0?a:gcd(b,a%b);
  }
}
