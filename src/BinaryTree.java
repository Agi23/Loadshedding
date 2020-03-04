// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class BinaryTree
{
   BinaryTreeNode root;
   int opCounter;
   
   public BinaryTree ()
   {
      root = null;
      opCounter =0;
      ReadFile("LSData.txt");
   }

   public BinaryTree(String txtfile){
      root = null;
      ReadFile(txtfile);
   }

   public void ReadFile(String txtfile){
   LSInfoItem curItem;
        //Read in file into binary tree
        String line;
        String pathToFile = txtfile;
        BufferedReader fin = null;
        
        try {
            fin = new BufferedReader(new InputStreamReader(new FileInputStream(pathToFile)));
            do {
                line = fin.readLine();
                //System.out.println(k);
                    
    
                // System.out.println(line);
                if (line == null) // Checks if you reached end of file
                    break; // Exits the loop if end of file reached
                else{
                    curItem = new LSInfoItem(line);
                    insert(curItem);
                }
                   
            }
            while (line != null);
            fin.close(); // Close the stream
        }       
                
        catch (final IOException e){
            System.out.println(e.getMessage() +"\nProgram will be aborted");
            System.exit(0);
        }
}
   public BinaryTreeNode find ( LSInfoItem d )
   {  
      if (root == null)
         return null;
      else
         return find (d, root);
   }
   public BinaryTreeNode find ( LSInfoItem d, BinaryTreeNode node )
   {  opCounter++;
      int cmp = d.compareTo (node.data);
      if (cmp == 0)
         return node;
      else if (cmp < 0)
         return (node.left == null) ? null : find (d, node.left);
      else
         return (node.right == null) ? null : find (d, node.right);
   }

   public int getCounter(){
      int num= opCounter;
      opCounter = 0;
      return num;
   }

   public void PrintAreas(final String stage, final String day, final String startTime){
      String usrLSTime = stage + '_' + day + "_"+ startTime;
      LSInfoItem finding = new LSInfoItem(usrLSTime);

      BinaryTreeNode found = find(finding);
      if (found == null)
         System.out.println("Item not found");
      else{
         visit(found);
      }


   }
   public void insert(LSInfoItem d, BinaryTreeNode node){
      if (d.compareTo(node.data)  <= 0){
         if (node.left == null)
            node.left = new BinaryTreeNode(d, null, null);
         else
            insert (d, node.left);
      }
      else
      {
         if (node.right == null)
            node.right = new BinaryTreeNode (d, null, null);
         else
            insert (d, node.right);
      }  


   }
   public void insert(LSInfoItem d){
         if (root == null)
            root = new BinaryTreeNode (d, null, null);
         else
            insert(d, root);
   }
 
   
   public int getHeight ()
   {
      return getHeight (root);
   }   
   public int getHeight ( BinaryTreeNode node )
   {
      if (node == null)
         return -1;
      else
         return 1 + Math.max (getHeight (node.getLeft ()), getHeight (node.getRight ()));
   }
   
   public int getSize ()
   {
      return getSize (root);
   }   
   public int getSize ( BinaryTreeNode node )
   {
      if (node == null)
         return 0;
      else
         return 1 + getSize (node.getLeft ()) + getSize (node.getRight ());
   }
   
   public void visit ( BinaryTreeNode node )
   {
      System.out.println (node.data);
   }
   
   public void preOrder ()
   {
      preOrder (root);
   }
   public void preOrder ( BinaryTreeNode node )
   {
      if (node != null)
      {
         visit (node);
         preOrder (node.getLeft ());
         preOrder (node.getRight ());
      }   
   }

   public void postOrder ()
   {
      postOrder (root);
   }
   public void postOrder ( BinaryTreeNode node )
   {
      if (node != null)
      {
         postOrder (node.getLeft ());
         postOrder (node.getRight ());
         visit (node);
      }   
   }

   public void inOrder ()
   {
      inOrder (root);
   }
   public void inOrder ( BinaryTreeNode node )
   {
      if (node != null)
      {
         inOrder (node.getLeft ());
         visit (node);
         inOrder (node.getRight ());
      }   
   }

   public void levelOrder ()
   {
      if (root == null)
         return;
      BTQueue q = new BTQueue ();
      q.enQueue (root);
      BinaryTreeNode node;
      while ((node = q.getNext ()) != null)
      {
         visit (node);
         if (node.getLeft () != null)
            q.enQueue (node.getLeft ());
         if (node.getRight () != null)
            q.enQueue (node.getRight ());
      }
   }

   public void PrintAllAreas(){
      System.out.println ("Height : " + getHeight ());
      System.out.println ("Size : " + getSize ());
      System.out.println ("Inorder : ");
      inOrder ();
      System.out.println ("Preorder : ");
      preOrder ();
      System.out.println ("Postorder : ");
      postOrder ();
      System.out.println ("Level order : ");
      levelOrder ();}
   }

