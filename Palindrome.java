import java.util.*;
import java.io.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
       
        String reverse = new StringBuffer(A).reverse().toString();
        if(A.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        }else
        System.out.println("Not A Palindrome");
    }
    
}
