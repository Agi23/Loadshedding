 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
class LSManager {
    public static void main(String[] args) {

        BinaryTree testTree = new BinaryTree(args[0]);
        LSArray testArray = new LSArray(args[0]);
        int iternum = 0;
        testArray.PrintAllAreas();
        testTree.PrintAllAreas();

        LSInfoItem arrData[] = testArray.getArray();

        for (LSInfoItem k : arrData){
            iternum++;
            Counter testCounter = new Counter(iternum);
            String usrTime = k.getLSTime();
            String time[] = usrTime.split("_");

            testArray.PrintAreas(time[0], time[1], time[2]);
            testCounter.setArrayFind(testArray.getCounter());

            testTree.PrintAreas(time[0], time[1], time[2]);
            testCounter.setBSTFind(testTree.getCounter());


            String fileName = args[0] + "output.txt";

            try {
                FileWriter writer = new FileWriter(fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                    bufferedWriter.write(testCounter.toString());
                    bufferedWriter.newLine();
                
     
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();}

        }



    }
}