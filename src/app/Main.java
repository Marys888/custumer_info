package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Customer Info app");
        String[] inputData = getData();
        Customer customer = getCustomer(inputData);
        String output = "Customer: " + customer.getName() + ", phone" + " " + customer.getPhone();
        getOutput(output);
    }

    public static String[] getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String inputName = scanner.nextLine();
        System.out.println("Enter your phone:");
        String inputPhone = scanner.nextLine();

        scanner.close();

        return new String[] {
            inputName, inputPhone
        };

    }
    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput (String output) {
        System.out.println(output);
    };
}
