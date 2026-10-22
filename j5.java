import java.io.*;
import java.util.Scanner;
public class j5{
public static void main(String[] args) throws IOException {
    // int a;
    // BufferedReader sk = new BufferedReader(new InputStreamReader(System.in));
    // System.out.println("Enter your name: ");
    // String name = sk.readLine();
    // System.out.println("Enter your Age: ");
    // int age = Integer.parseInt(sk.readLine());
    // System.out.println("The Entered name is :" + name);
    // System.out.print("The Entered age is : " + age);
    // for (a=1; a<=age;a++){
    //     System.out.println();
    //     System.out.print("                       ");
    //     for (int i = 0; i < a; i++){
    //      System.out.print("*");
    //     }
    


    // }
    int a; 
    Scanner o1= new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name= o1.next();
    System.out.print("Enter you age : ");
    int age = o1.nextInt();
    System.out.println("The Entered name is :" + name);
    System.out.print("The Entered age is : " + age);
}
}
