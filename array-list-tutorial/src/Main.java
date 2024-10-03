import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Arrays - used to store multiple values in a single variable
        /*
        String[] cars = {"Camaro", "Corvette", "Tesla"};

        // access elements
        System.out.println(cars[0]); // Camaro

        // replace element
        0cars[0] = "Mustang";
        System.out.println(cars[0]); // Mustang
        */

        // Other way to implement Arrays
        String[] cars = new String[3];
        Scanner scanner = new Scanner(System.in);
        /*
        cars[0] = "Camaro";
        cars[1] = "BMW";
        cars[2] = "Audi";
        */
        // or

        for (int i=0; i<cars.length; i++) {
            System.out.println("Enter the car name: ");
            cars[i] = scanner.nextLine();
            System.out.println("\n");
        }



    }
}