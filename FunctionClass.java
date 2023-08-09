import java.util.*;
// // // Q1-//Print a given name in function
// // // public class FunctionClass {

import javax.sql.rowset.spi.SyncResolver;
    
// // //     public static void printMyName(String name){
// // //         System.out.println(name);
// // //         return;//Declare kia function ko
// // //     }
// // //     public static void main(String[]args){
// // // Scanner sc=new Scanner(System.in);
// // // String name=sc.next();
// // //   printMyName(name);//call kiya funtion ko  
// // // }
// // // }
// // //Q2- Make a function to add two numbers and return their sum
// //  public class FunctionClass{
// //     public static int calculateSum(int a,int b){
// //         int sum=a+b;
// //         return sum;
// //     }

// //     public static void main(String[]args){
// // Scanner sc=new Scanner(System.in);
// // int a=sc.nextInt();
// // int b=sc.nextInt();
// // int sum=calculateSum(a,b);
// // System.out.println(sum);
// //     }
// //  }
//  //Q3- Make a function to multipy two numbers and return their product
// //   public class FunctionClass{
// //     public static int calculateProduct(int a,int b){
// //         int product =a*b;
// //         return product;
// //     }

// //     public static void main(String[]args){
// // Scanner sc=new Scanner(System.in);
// // int a=sc.nextInt();
// // int b=sc.nextInt();
// // int product=calculateProduct(a,b);
// // System.out.println(product);
// //     }
// //  }
// // Q4-Find the factorial of a numbers
//  public class FunctionClass{
//     public static void printFactorial(int n){
//         if(n<0){
//             System.out.println("Invalid Numbers");
//             return;
//         } 
//         int factorial=1;
// //         for(int i=n;i>=1;i--){
// //             factorial=factorial*i;

// //         }
// //         System.out.println(factorial);
// //         return;
// //     }

// //     public static void main(String[]args){
// // Scanner sc=new Scanner(System.in);
// // int n=sc.nextInt();
// // printFactorial(n);


// //     }
// //  }
// // Q4-Make a function to print the table of a given number n
// // public class FunctionClass{
// //     public static void printTable(int n){
// //         for(int i=1;i<=10;i++){
// //             System.out.println(n*i);
// //         }

        
// //     }
// // public static void main(String[]args){
// //     Scanner sc=new Scanner(System.in);
// // int n=sc.nextInt();
// // printTable(n);
// // }
    
// // }
// // Q5
// public class FunctionClass{
//     public static void averageNumber(int a,int b,int c){
//    int _average=(a+b+c)/3;
// return;
        
//     }
// public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();
// int average=averageNumber;
// System.out.println(average);

// }
//}
// Q6-Make a function to print the table of a given number
// public class FunctionClass{
//     public static void printTable(int n){
//         for(int i=1;i<=10;i++){
//             System.out.println(n*i);
//         }

        
//     }
// public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// printTable(n);
// }
    
// }

public class FunctionClass{
    public static void printSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
             sum=sum+i;
            }
        }
    
System.out.println(sum); 
  }       

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printSum(n);
}
 


}