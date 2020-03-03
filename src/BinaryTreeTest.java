// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTreeTest
{
   public static void main ( String [] args )
   {
      BinaryTree<Integer> myTree = new BinaryTree<Integer> ();
   
/*
      // test for single node
      myTree.root = new BinaryTreeNode<Integer> (10, null, null);
*/      
   
/*
      // test for 2-level tree
      myTree.root = new BinaryTreeNode<Integer> (
          1, 
          new BinaryTreeNode<Integer> (2, null, null),
          new BinaryTreeNode<Integer> (3, null, null)
      );
*/      


      // test for 3-level tree
      myTree.root = new BinaryTreeNode<Integer> (
          1, 
          new BinaryTreeNode<Integer> (
            2, 
            new BinaryTreeNode<Integer> (
              4, 
              null, 
              null
            ), 
            new BinaryTreeNode<Integer> (
              5, 
              null, 
              null
            )
          ),
          new BinaryTreeNode<Integer> (
            3, 
            new BinaryTreeNode<Integer> (
              6, 
              null, 
              null
            ), 
            null
          )
         );   
      

      System.out.println ("Height : " + myTree.getHeight ());
      System.out.println ("Size : " + myTree.getSize ());
      System.out.println ("Inorder : ");
      myTree.inOrder ();
      System.out.println ("Preorder : ");
      myTree.preOrder ();
      System.out.println ("Postorder : ");
      myTree.postOrder ();
      System.out.println ("Level order : ");
      myTree.levelOrder ();
   }
}
