package JavaPrograms;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string - ");
        String str = sc.nextLine();

        System.out.println(str.substring(6));
    }
}
