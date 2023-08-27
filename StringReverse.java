package JavaPrograms;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line - ");
        String str = sc.nextLine();
        String rstr="";

        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            rstr = ch + rstr;
        }
        System.out.println("Original string - "+str);
        System.out.println("Reversed string - "+rstr);

            }
}
