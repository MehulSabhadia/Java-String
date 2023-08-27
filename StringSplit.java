package JavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line- ");
        String line = sc.nextLine();
        String[] result = line.split(" ");
        
        System.out.print("Result "+Arrays.toString(result));
        }
    }