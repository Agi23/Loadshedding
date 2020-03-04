

public class LSArrayApp {
    
    

    public static void main(String[] args) {
        LSArray ArrayData;
        if (args.length == 0)
            ArrayData = new LSArray();
        else{
            //check if correct format
            if (args.length == 3){
                ArrayData = new LSArray(args[0], args[1], args[2]);
                System.out.println("No of operations: " + ArrayData.getCounter());
            } 
            else{
                System.out.println("Error: incorrect format");}
                ArrayData = null;
        }
         
    } 
     

}