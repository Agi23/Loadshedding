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

        LSInfoItem curItem;
        //Read in file into binary tree
        String line;
        String pathToFile = "LSData.txt";
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
                    myTree.insert(curItem);
                }
                   
            }
            while (line != null);
            fin.close(); // Close the stream
        }       
                
        catch (final IOException e){
            System.out.println(e.getMessage() +"\nProgram will be aborted");
            System.exit(0);
        }

        
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