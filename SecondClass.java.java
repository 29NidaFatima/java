import java.util.*;
public class SecondClass {
    public static void main(String args[]){
      //1- OUTPUT
        // System.out.print("NIDA FATIMA\n"); 
        //  System.out.println("NIDA FATIMA"); 
        //   System.out.print("NIDAFATIMA\n"); 
        //    System.out.print("NIDA FATIMA"); 
        //--->first method(\n)
        //System.out.print("*\n**\n***\n****");
      // ---> second method(println)
    //   System.out.println("*");
    //    System.out.println("* *"); 
    //     System.out.println("* * *");
    //      System.out.print("* * * *");
    // QUIZ:To print
    // *
    // **
    //  System.out.println("*\n**");
    //2-VARIABLES
    // String name="tony";
    // double price=25.25; 
    // int a=25;
    // int b=10;
    //3-DATATYPES
//     int a =10;
//     int b =25;
//     int sum=a+b;
//     System.out.println(sum);
//     System.out.println("sum");
//     int diff=b-a;
//     System.out.println("diff");
//  System.out.println(diff);
//  int mul=a*b;
//   System.out.println(mul);
//QUIZ
// int a=10;
// int b=5;
// int ans=a*b/a-b;
// System.out.println(ans);
// int an=(a*b)/(a-b);
// System.out.println(an);
//4-INPUT FROM USER
// Scanner sc =new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// int sum=a+b;
// System.out.println(sum);
//CLASS 3 (CONDITIONAL STATEMENT)
//1--->IF-ELSE
// Scanner sc=new Scanner(System.in);
// int age=sc.nextInt();
// if(age>18){
//   System.out.println("ADULT");
// }
// else{
// System.out.println("NOT ADULT");
// }
// Scanner sc=new Scanner(System.in);
// int number=sc.nextInt();
// if(number%2==0){
//   System.out.println(" even");
// }else{
//   System.out.println("odd");
// }Scanne
//  sc=new Scanner(System.in);
// int a =sc.nextInt();
// int b=sc.nextInt();
// if(a==b){
//   System.out.println("EQUAL");
// }
// else if (a>b){

// System.out.println("a is greater");
//   }
  

// // else{
// //   System.out.println("a IS LESSER");
// // }
// QUIZ
// Scanner.sc=new Scanner(System.in);
// if(3%2==0){
//   System.out.println("Bazinga");
// // }
// Scanner.sc=new Scanner(System.in);
// int button =sc.nextInt();
// if(button==1){
//   System.out.println("hello");
// }else if(button==2){
//   System.out.println("namaste");
// }else if(button==3){
//   System.out.println("bonjour");
// }else{
//   System.out.println("invalid");
// }
// Scanner sc=new Scanner(System.in);
// int button =sc.nextInt();
// switch(button){
//   case 1:System.out.println("Hello");
//   break;
//   case 2:System.out.println("namaste");
//   break;
//   case 3:System.out.println("bonjour");
//   break;
//   default:System.out.println("invalid button");

// }
//----HOMEWORK PROBLEM
// Q1
// Scanner sc=new Scanner(System.in);
// int number=sc.nextInt();
// switch(number){
// case 1:System.out.println("january");
// break;
// case 2:System.out.println("february");
// break;
// default:System.out.println("invalid");
// }
// Q2
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// int sum=a+b;
// int diff=a-b;
// int mul=a*b;
// int divide=a/b;
// int module=a%b;
// System.out.println(sum);
// System.out.println(diff);
// System.out.println(mul);
// System.out.println(divide);
// System.out.println(module);
//class-->3(LOOPS)
//1-FOR LOOPS
// for(int counter=0;counter<5;counter=counter+1){
//   System.out.println("HELLO GUYS");
// }
// for(int counter=0;counter<11;counter++){
//   //counter++ means counter=counter+1
//   System.out.println(counter);
// }
// for(int i=0;i<20;i++){
//   //i++ means i=i+1
//   System.out.println(i );
// }
//2-WHILE LOOP
// int i=0;
// while(i<5){
//   System.out.println(i);
//   i++;
// }
//3-DO WHILE LOOP
// int i =0;
// do{
//   System.out.println(i);
//   i=i+1;
// }while(i<11);
//TEST
// int i=13;
// while(i<12){
//   System.out.println("NIDU");
// } //--->(not run)
// int i=13;
// do{
//   System.out.println("NIDU");
// }while(i<12);   //(atleast one time run)
//QUESTION PRACTICE
//1-print the first n natural number (n=4)using for,while nd do while
// for( int i=1;i<5;i++){
//   System.out.println(i);
// }
// int i=1;
// while(i<5){
//   System.out.println(i);
//   i++;
// }
// int i=1;
// do{
//   System.out.println(i);
//   i++;
// }while(i<5);
//2-print the sum of first n natural number(n=4)
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int sum=0;
// for(int i=0;i<=n;i++)
// {
//   sum=sum+i;
// }System.out.println(sum);
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// for(int i=1;i<11;i++){
//   System.out.println(i*n);
//PATTERN:-
//Q1--->solid reactangle
// int n=4;
// int m=5;
// //outer loop
// for( int i=1; i <=n; i++)
// {
//   //inner loop
//   for(int j=1; j<=m;j++){
//     System.out.print("*");
//   }
//   System.out.println();
// }
//--->2nd  method ->input taken from user
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int m=sc.nextInt();

// //outer loop
// for( int i=1; i<=n; i++)
// {
//   //inner loop
//   for(int j=1; j<=m;j++){
//     System.out.print("*");
//   }
//   System.out.println();

// }
// Q2-print hollow rectangle
// int n=4;
// int m=5;
// //outer loop
// for( int i=1;i<=n;i++){
//   //inner loop
//   for(int j=1;j<=m;j++){
//     //cell(i,j)
//     if(i==1 || j==1 ||i==n || j==m){
//       System.out.print("*");
//     } 
//     else{
//       System.out.print(" ");
//     }
   

//   } System.out.println();

// }
// Q3-print half pyramid
// int n=4;
// for(int i=1;i<=n;i++){
//   for(int j=1;j<=i;j++){
//     System.out.print("*");
//   }
//   System.out.println( );
// }
//Q4-print half pyramid(invert the first pyramid)
// int n=4;
// for(int i=n;i>=1;i--){
//   for(int j=1;j<=i;j++){
//     System.out.print("*");
//   }System.out.println();
//  }
//Q5-print inverted half pyramid(rotated by 180 degree)
// int n=4;
// //outer loop
// for(int i=1;i<=n;i++){
//   //inner loop for print space
//   for(int j=1;j<=n-i;j++){
//     System.out.print(" ");
//   } //inner loop for print star
//   for(int j=1;j<=i;j++){
//   System.out.print("*");
//   } System.out.println();
// }
// Q6-(a)print half pyramid with numbers 
// int n=5;
// for(int i=1;i<=n;i++){
//   for(int j=1;j<=i;j++){
//     System.out.print(j+" ");
//   }System.out.println();
// }
//Q6-(b)print inverted half pyramid with numbers 
// int n=5;
// for(int i=n;i>=1;i-- ){
//   for(int j=1;j<=i;j++){
//     System.out.print(j+" ");
//   }System.out.println();
// }
//Q7-Print the pattern flyod's triangle
// int n=5;
// int number=1;
// //outer loop
// for(int i=1;i<=n;i++){
//   //inner loop
//   for( int j=1;j<=i;j++){
//   System.out.print(number+" ");
//   number++;
// }
//     System.out.println();
// }
//Q8-print 0-1 triangle
//  int n=5;
//  for(int i=1;i<=n;i++){
//   for(int j=1;j<=i;j++){
//     int sum=i+j;
//     if(sum %2==0){
// System.out.print(1+" ");
// } 
// else{
//   System.out.print(0+" ");
// } 
// } 
// System.out.println();
//  }
//Q9-print butterfly pattern
// int n=4  ;
// //upper half
// for(int i=1; i<=n;i++)
// { 
//   //1st part(print star)
//   for(int j=1;j<=i;j++){
//   System.out.print("*");
//   }
//   //print spaces
// //   for(int j=1;j<=2*(n-i);j++){
// //     System.out.print(" ");
// //   }
// //   //2nd half
// //   for(int j=1;j<=i;j++){
// //     System.out.print("*");
// //   } 
// //   System.out.println();
// // }
// // // lower half
// // for(int i=n; i>=1;i--)
// // {
//    //1st part(print star)
//   for(int j=1;j<=i;j++){
//   System.out.print("*");
//   } 
//   //print space
//   for(int j=1;j<=2*(n-i);j++){
//     System.out.print(" ");
//   }
//   //2nd half
//   for(int j=1;j<=i;j++){
//     System.out.print("*");
//   } 
//   System.out.println();
// //}
// Q-10 print solid rhombus
// int n=5;
// for(int i=1;i<=n;i++){
//   //spaces
//   for(int j=1;j<=n-i;j++){
//     System.out.print(" ");
//   }
//   //star
//   for(int j=1;j<=n;j++){
// System.out.print("*");
//   }
//   System.out.println();
// }
//Q10-print numbers  triangular pyramid
// // int n=5;
// // for(int i=1;i<=n;i++){
// //   //spaces
// //   for(int j=1;j<=n-i;j++){
// //     System.out.print(" ");
// //   }
// //   // numbers
// //   for(int j=1;j<=i;j++){
// // System.out.print(i+" ");
// //   }
// //   System.out.println();
// // }
// //Q11-Print palindromic pattern
// //(samne se v waise he dikhte jaise piche se)
// int n=5;
// for(int i=1;i<=n;i++){
//   //spaces
//   for(int j=1;j<=n-i;j++){
//     System.out.print(" ");
//   }
//   //1st half numbers
//   for(int j=i;j>=1;j--){
// System.out.print(j);
//   }
//   //2nd half numbers
//   for(int j=2;j<=i;j++){
// System.out.print(j);
//   }
//   System.out.println();
// }

// Q12 -Print the diaomond pattern 
int n=5;
//UPPER HALF
for(int i=1;i<=n;i++){
  //spaces
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
  }
  //stars
  for(int j=1;j<=2*(i-1);j++){
    System.out.print("*");
  }
  System.out.println();
}
// LOWER HALF 
for(int i=n;i>=1;i--){
  //spaces
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
  }
  //stars
  for(int j=1;j<=2*(i-1);j++){
    System.out.print("*");
  }
  System.out.println();

 
}





    

  
}

}
