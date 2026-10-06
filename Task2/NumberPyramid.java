package Task2;

public class NumberPyramid {
    public static void main (String [] args) {
        System.out.println("Number Pyramid:");
        int rows = 5; // You can change this value to adjust the size of the pyramid.
        for (int i = 1; i <= rows; i++) {

            // Print leading spaces for formatting.
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in the pyramid pattern.
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
