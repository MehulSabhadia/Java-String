package JavaPrograms;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name :");
        String fullName = sc.nextLine();
               
        System.out.println(fullName.length());
    }
}
