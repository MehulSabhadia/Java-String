package JavaPrograms;

import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string - ");
        String str1 = sc.nextLine();
        System.out.print("Enter the 2nd string - ");
        String str2 = sc.nextLine();

        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
