import java.util.*;
import java.io.*;
import java.math.*;

public class Cubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double pr = sc.nextDouble();
        double res = Math.pow(num,pr);
        System.out.println(res);
    }
}