// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTree
{
   BinaryTreeNode root;
   
   public BinaryTree ()
   {
      root = null;
   }

public BinaryTreeNode find ( LSInfoItem d )
{
if (root == null)
return null;
else
return find (d, root);
}
public BinaryTreeNode find ( LSInfoItem d, BinaryTreeNode node )
{
int cmp = d.compareTo (node.data);
if (cmp == 0)
return node;
else if (cmp < 0)
return (node.left == null) ? null : find (d, node.left);
else
return (node.right == null) ? null : find (d, node.right);
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
}
