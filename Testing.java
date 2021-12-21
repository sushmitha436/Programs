import java.util.*;
import java.io.*;

 class Employee {

    int Id;
    String Name;
    String Designation;
    
    public Employee(int Id, String Name , String Designation) {
        this.Id = Id;
        this.Name = Name;
        this.Designation = Designation;

    }
}
public class Testing {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Employee list[] = new Employee[N];
        for(int i=0;i<N;i++) {
            System.out.println("Enter Employee Id:");
            int Id = sc.nextInt();
            System.out.println("Enter Employee Name:");
            sc.nextLine();
            String Name = sc.nextLine();
            System.out.println("Enter Employee Designation:");
            String Designation = sc.nextLine();
        
          Employee e = new Employee(Id, Name, Designation);
          list[i] = e;

        }
        System.out.println("Id For Searching Purpose:");
        int search = sc.nextInt();
        for(Employee t : list){
            if(t.Id == search){
                System.out.println("Match Found!!");
                System.out.println("Employee Id:" +t.Id);
                System.out.println("Employee Name:" +t.Name);
                System.out.println("Employee Designation:" +t.Designation);
            }

        }
    }


    
}
