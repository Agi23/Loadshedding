

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class LSArray {
    
    public LSInfoItem[] arrInfoItems;
    public String usrLSTime;
    public int opCounter;
    int k;
    public int getCounter (){
        return opCounter; 
    }
    public void PrintAllAreas(){
        //for loop and print out every item using toString
        for (LSInfoItem num: arrInfoItems){
            System.out.println(num.toString());
        }
        System.out.println("hoorah");
    }
   
    public void PrintAreas(final String stage, final String day, final String startTime) {
        // change format
        usrLSTime = stage + '_' + day + "_"+ startTime;
        //boolean Found = false;
        opCounter = 0;

        // for loop through array + compareTo
        for (LSInfoItem b : arrInfoItems)
        {   opCounter++;
            if (b.getLSTime().compareTo(usrLSTime) == 0 ){
                System.out.println(b.toString());
                //System.exit(0);
                return;
                
            }
        }
        // if found: return areas
        // if not found: display error message
        System.out.println("No item found");
    }

    private void initialise() {
        arrInfoItems = new LSInfoItem[2976];
        ReadFile();
    }

    public LSArray() {
        initialise();
        PrintAllAreas();
    }

    public LSArray(final String stage, final String day, final String startTime) {
        initialise();
        PrintAreas(stage, day, startTime);
    }

    public void ReadFile() {
        String line;
        String pathToFile = "LSData.txt";
        BufferedReader fin = null;
        k = 0;
        try {
            fin = new BufferedReader(new InputStreamReader(new FileInputStream(pathToFile)));
            do {
                line = fin.readLine();
                //System.out.println(k);
                

                // System.out.println(line);
                if (line == null) // Checks if you reached end of file
                    break; // Exits the loop if end of file reached
                else{
                    arrInfoItems[k] = new LSInfoItem(line);
                    k=k+1;
                }
                   
                // TO DO CODE
            } while (line != null);
            fin.close(); // Close the stream
        } catch (final IOException e)
        {
        System.out.println(e.getMessage() +"\nProgram will be aborted");
        System.exit(0);
        }

        

    }
}