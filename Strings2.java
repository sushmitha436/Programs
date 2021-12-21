import java.util.*;
import java.io.*;

public class Strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      //  System.out.println("Hour:" +str.substring(0,2));
     //   System.out.println("Minutes:" +str.substring(3,5));
     //   System.out.println("Seconds:" +str.substring(6,8));
     //   System.out.println("Day:" +str.substring(9,16));
     //   System.out.println("Date:" +str.substring(16,18));
     //   System.out.println("Month:" +str.substring(19,22));
     //   System.out.println("Year:" +str.substring(23));

     String list[] = str.split(" ");
     String temp = list[0];
     String firstString[] = temp.split(":");
     System.out.println("Hour:" +firstString[0]);
     System.out.println("Minutes:" +firstString[1]);
     System.out.println("Seconds:" +firstString[2]);
     System.out.println("Day:" +list[1]);
     String last = list[2];
     String secondString[] = last.split("-");
     System.out.println("Date:" +secondString[0]);
     System.out.println("Month:" +secondString[1]);
     System.out.println("Year:" +secondString[2]);
    }
    
}
