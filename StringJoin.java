package JavaPrograms;

import java.util.Scanner;

public class StringJoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name - ");
        String first = sc.next();
        System.out.print("Enter last name - ");
        String last = sc.next();

        String fullName = first.concat(last);
        System.out.println("Full Name - "+fullName);
    }
    
}
