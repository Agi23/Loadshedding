import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;


class LSBSTApp{

    

    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree();
        //BTQueue  myQueue = new BTQueue();
        //BinaryTreeNode myTreeNode = myQueue.getNext();

        //myQueue.enQueue(myTreeNode);

        

        
        if (args.length == 0){
            System.out.println ("Height : " + myTree.getHeight ());
            System.out.println ("Size : " + myTree.getSize ());
            System.out.println ("Inorder : ");
            myTree.inOrder ();
            System.out.println ("Preorder : ");
            myTree.preOrder ();
            System.out.println ("Postorder : ");
            myTree.postOrder ();
            System.out.println ("Level order : ");
            myTree.levelOrder ();}
        else{
        //check if correct format
        if (args.length == 3){
            myTree.PrintAreas(args[0], args[1], args[2]);
            //System.out.println("No of operations: " + ArrayData.getCounter());
        } 
        else{
            System.out.println("Error: incorrect format");}
    } 
    
        }

    
}