package JavaPrograms;

public class StringCompare {
    public static void main(String[] args) {
        String first = "Mehul Sabhadiya";
        String second = "Mehul Sabhadiya";
        String third = "Nehul Sabhadiya";
        String forth = "mehul sabhadiya";

        int compare = first.compareTo(second);
        System.out.println(compare);

        int compare1 = first.compareTo(third);
        System.out.println(compare1);

        int compare2 = third.compareTo(second);
        System.out.println(compare2);

        int compare3 = first.compareToIgnoreCase(forth);
        System.out.println(compare3);

        }
    }
