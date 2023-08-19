import java.util.*;
import java.util.Arrays;
public class Arrays2D {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
int columns=sc.nextInt();
int[][]numbers=new int[rows][columns];
//input
//outer loop control rows 
for(int i=0;i<rows;i++){
//inner loop control columns
for(int j=0;j<columns;j++){
    numbers[i][j]=sc.nextInt();
}
}
//output
for(int i=0;i<rows;i++){
    for(int j=0;j<columns;j++){
        System.out.println(numbers[i][j]+" ");
    }

}
    /* You can print out arrays without using loops just by importing the Arrays library  (import java.util.Arrays;
        here is the best way to print arrays in one line */ 
        
        System.out.println(Arrays.deepToString(numbers));
        
            
    }
}
