 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
class LSManager {
    /**stores Counter object for BST operations and Array operations */
    public static Counter testCounter;
    
    /**stores Binary Tree of data inputted */
    public static BinaryTree testTree;

    /**stores array of data inputted */
    public static LSArray testArray;
    /** 
    * facilitates running both data structures by taking in the name of a textfile as the user input and outputting to a textfile the search count data
     */
    public static void main(String[] args) {
        testCounter = new Counter();
        
        testTree = new BinaryTree(args[0]);
        testCounter.setArrayInsert(testTree.getCounterInsert());
        String insertCounterBST = testCounter.toStringInsert();

        testArray = new LSArray(args[0]);
        testCounter.setArrayInsert(testArray.getCounterInsert());
        String insertCounterArray = testCounter.toStringInsert();

        String fileName = args[0] + "output.txt";




        int iternum = 0;
        //testArray.PrintAllAreas();
        //testTree.PrintAllAreas();

        LSInfoItem arrData[] = testArray.getArray();
        System.out.println("LENGTH");
        System.out.println(arrData.length);
        for (LSInfoItem k : arrData){
            iternum++;
            testCounter = new Counter(iternum);
            String usrTime = k.getLSTime();
            String time[] = usrTime.split("_");

            


            testArray.PrintAreas(time[0], time[1], time[2]);
            testCounter.setArrayFind(testArray.getCounterFind());

            testTree.PrintAreas(time[0], time[1], time[2]);
            testCounter.setBSTFind(testTree.getCounterFind());

            try {
                FileWriter writer = new FileWriter(fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                    bufferedWriter.write(testCounter.toStringFind());
                    //System.out.println(testCounter.toStringFind());
                    bufferedWriter.newLine();


     
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();}






            }


        
    }
}
