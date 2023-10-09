
public class SBuilder {
    public static void main(String[]args){
//         StringBuilder sb=new StringBuilder("Tony");
//         System.out.println(sb); 
//         //char at index 0
        
//         System.out.println(sb.chatAt(0));
// //set char at index zero
// sb.charAt(0,'p');
// System.out.println(sb);
// //insert any string at zero index
// sb.insert(0,'S');
// System.out.println(sb); 
// sb.delete(2,3);
// System.out.println(sb);
// //append(adding any string)
//  StringBuilder sb=new StringBuilder("h");
//  sb.append("e");
//  sb.append("l");
//   sb.append("l");
//    sb.append("o");
//    System.out.println(sb); 
//     System.out.println(sb.length());
StringBuilder sb=new StringBuilder("hello");
for(int i=0;i<sb.length()/2;i++){
    int front=i;
    int back=sb.length()-1-i;     //5-1-0=4
    char frontChar=sb.charAt(front);
    char backChar=sb.charAt(back);
    sb.setCharAt(front,backChar);
    sb.setCharAt(back,frontChar);

}
System.out.println(sb);
    }
}

