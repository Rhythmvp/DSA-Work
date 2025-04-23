//import java.sql.SQLOutput;
//import java.util.*;
//
//public class Main {
//    static class TreeNode {
//        int data;
//        TreeNode left, right;
//
//        TreeNode(int value) {
//            data = value;
//            left = right = null;
//        }
//    }
//
//    static int getHeight(TreeNode root) {
//        if (root == null) return 0;
//        int leftHeight = getHeight(root.left);
//        int rightHeight = getHeight(root.right);
//        return 1 + Math.max(leftHeight, rightHeight);
//    }
//
//    static int count(TreeNode root){
//        if(root==null) return 0;
//        return 1 + count(root.left)+count(root.right);
//    }
//
//    static boolean searchValue(TreeNode root,int key){
//        if(root==null) return false;
//        if(root.data==key) return true;
//        return searchValue(root.left,key) || searchValue(root.right,key);
//    }
//
//    static int searchNodes(TreeNode root){
//        if(root.left==null || root.right==null) return 0;
//        return  1+ searchNodes(root.right) +searchNodes(root.left);
//    }
//    static int sum(TreeNode root){
//        if(root==null) return 0;
//        return root.data+sum(root.left)+sum(root.right);
//    }
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(10);
//        root.left = new TreeNode(20);
//        root.right = new TreeNode(30);
//        root.left.left = new TreeNode(40);
//        root.left.right = new TreeNode(50);
//
//       // System.out.println("Height of the tree: " + getHeight(root));
//        //System.out.println("Count: "+ count(root));
//
//        System.out.println("Is 4 present ?" + searchValue(root,40));
//        System.out.println("How many nodes present "+ searchNodes(root));
//        System.out.println("Sum:"+ sum(root));
//    }
//}



//print
// import java.util.*;
// public class Main
// {
//     public static class TreeNode{
//         int data;
//         TreeNode left,right;
//         TreeNode(int data){
//           this.data=data;
//             left=right=null;
//         }
//     }
// public static void print(TreeNode root,int level){
//     if(root==null)return ;
//     if(level==1)System.out.print(root.data+" ");
//     else{
//         print(root.left,level-1);
//         print(root.right,level-1);
//     }
// }
// 	public static void main(String[] args) {
// 		TreeNode root=new TreeNode(10);
// 		root.left=new TreeNode(20);
// 		root.right=new TreeNode(30);
// 		root.left.left=new TreeNode(40);
// 		root.left.right=new TreeNode(50);
// 	root.right.left=new TreeNode(60);
// 	root.right.right=new TreeNode(70);
// 	print(root,3);
// 	}
// }

//Insert
//import java.util.*;
//public class Main
//{
//    public static class TreeNode{
//        int data;
//        TreeNode left,right;
//        TreeNode(int data){
//            this.data=data;
//            left=right=null;
//        }
//    }
//    public static void insert(TreeNode root,TreeNode x){
//        if(root==null) return;
//
//        if(root.left!=null&&root.right==null){
//            root.right=x;
//            return;
//        }
//        if(root.left==null&&root.right!=null){
//            root.left=x;
//            return;
//        }
//        insert(root.left,x);
//        insert(root.right,x);
//    }
//    public static int height(TreeNode root){
//        if(root==null)return 0;
//        return 1+Math.max(height(root.left),height(root.right));
//    }
//    public static void print(TreeNode root,int level){
//        if(root==null)return ;
//        if(level==1)System.out.print(root.data+" ");
//        else{
//            print(root.left,level-1);
//            print(root.right,level-1);
//        }
//    }
//    public static void main(String[] args) {
//        TreeNode root=new TreeNode(1);
//        root.left=new TreeNode(2);
//        root.right=new TreeNode(3);
//        root.left.left=new TreeNode(4);
//        root.right.left=new TreeNode(6);
//        root.right.right=new TreeNode(7);
//        int val=5;
//        TreeNode x=new TreeNode(val);
//        insert(root,x);
//        int height=height(root);
//        for(int i=1;i<=height;i++){
//            print(root,i);
//        }
//    }
//}