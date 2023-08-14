 import java.util.*;

 public class Strings {
    public static void main(String []args){
//         //String declaration
//         String name=" Nida";
//         String full name="Nida Fatima";
//         String sentence="My name is Nida Fatima";
//        // Input by user
//         Scanner sc=new Scanner(System.in);
//  String name=sc.next();
//         String name=sc.nextLine();
//          System.out.println("your name is:"+name);
//         Method-1--->concatenation
//         String firstname="tony";
//         String lastname="stark";
//         String fullname=firstname+" "+lastname;
//         //System.out.println(fullname);
// //Method-2--->length(String name(.lenth))
// //System.out.println(fullname.length());
// //Method-3--->charAt(String name(.charAt))
// // for(int i=0;i<fullname.length();i++){
// //     System.out.println(fullname.charAt(i));

// // }
// //Compare two String
// String name1="Tony";
// String name2="Tony2";
// //1 String1>String2:    Gives +ve value
// //2 String1==String2:    Gives zero
// //3 String1<String2:    Gives -ve value
//examole:hello<wello bcz h<w and hello >cello bcz h>c in alphabatical order
// if(name1.compareTo(name2)==0){
//     System.out.println("equal");
// }else{
 //     System.out.println("not equal");
// }
//substrings
String sentence="My name is tony";
String name=sentence.substring(11,sentence.length());
System.out.println(name);
String name=sentence.substring(11);
System.out.println(name);
    }
}