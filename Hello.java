import java.util.Random; 
class Hello{

    public static void main(String[] args) {
        // create instance of Random class 
        Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(1000); 
        int rand_int2 = rand.nextInt(1000); 
  
        // Print random integers 
        System.out.println("Random Integers: "+rand_int1); 
        System.out.println("Random Integers: "+rand_int2); 

        String txtfile = "data297.txt";
        int pos = txtfile.indexOf(".");
        System.out.println(pos);
        //int size = Integer.valueOf(txtfile.substring(3,pos));
        System.out.println(txtfile.substring(4,pos));
    }
}