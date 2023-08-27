package JavaPrograms;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter line- ");
        String line = sc.nextLine();

        System.out.println(line.replace('e', 'a'));
    }
}
