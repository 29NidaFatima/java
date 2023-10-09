public class Bitmanupulation {
    public static void main(String []args){
       //Get bit
    //    int n=5;//0101
    //    int pos=3;
    //    int bitmask=1<<pos;
    //    if((bitmask& n)==0) {
    //     System.out.println("bit was zero");
    //    }
    //    else{
    //     System.out.println("bit was one ");
    //    }
       //set bit
    
        int n=5;//0101
       int pos=1;
       int bitmask=1<<pos;
       int newNumber=bitmask|n;
       System.out.println( newNumber);
       
    }
}
