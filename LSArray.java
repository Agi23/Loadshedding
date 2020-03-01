

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class LSArray {
    
    public LSInfoItem[] arrInfoItems;
    
    public void PrintAllAreas(){
        //for loop and print out every item using toString
        System.out.println("hoorah");
    }

    public void PrintAreas(final String stage, final String day, final String startTime) {
        // check if data is valid
        // change format
        // for loop through array + compareTo
        // if found: return areas
        // if not found: display error message
        System.out.println("hoorah");
    }

    private void initialise() {
        arrInfoItems = new LSInfoItem[3000];
        ReadFile();
    }

    public LSArray() {
        System.out.println("you got here at least");
        initialise();
        PrintAllAreas();
    }

    public LSArray(final String stage, final String day, final String startTime) {
        initialise();
        PrintAreas(stage, day, startTime);
    }

    public void ReadFile() {
        System.out.println("here yo! daz waxc");
        String line;
        String pathToFile = "LSData.txt";
        BufferedReader fin = null;
        int k = 0;
        try {
            fin = new BufferedReader(new InputStreamReader(new FileInputStream(pathToFile)));
            do {
                line = fin.readLine();
                System.out.println(line);
                

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