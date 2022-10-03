class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return helper(root.left,root.right);

    }
    public boolean helper(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        else if(left!=null && right!=null){
            return (left.val==right.val) && helper(left.left,right.right) && helper(left.right,right.left);
        }
        return false;
    }
}


----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
 import java.util.*;
class Main {
   static Node root;
  static class Node{
    int data;
    Node left,right;
    Node(int data){
      this.data=data;
      left=null;
      right=null;
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    root=createTree(arr,0);
    
    printTree(root);
    System.out.println();
    if(root==null){
      System.out.println("True");
    }else{
    System.out.println(isSymmetric(root.left,root.right));
    }
  }
  public static boolean isSymmetric(Node left,Node right){
    if(left==null && right==null){
      return true;
    }else if(left!=null && right!=null){
      return (left.data==right.data) && isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }
    return false;
  }
  public static void printTree(Node root){
    Queue<Node> queue=new LinkedList<>();
    if(root==null){
      System.out.println("Tree is Empty");
    }else{
      queue.add(root);
      while(!queue.isEmpty()){
      int s=queue.size();
      while(s-- >0){
        Node curr=queue.poll();
        System.out.print(curr.data+" ");
        if(curr.left!=null){
          queue.add(curr.left);
        }
        if(curr.right!=null){
          queue.add(curr.right);
        }
      }
      }
    }
    
    
  }
  public static Node createTree(int[] arr,int i){
    Node root1=null;
    if(i<arr.length){
      root1=new Node(arr[i]);
  
      root1.left=createTree(arr,2*i+1);
      root1.right=createTree(arr,2*i+2);
    }
    return root1;
  }
}
