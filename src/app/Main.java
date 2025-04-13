package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Custumer Info app");
        Custumer custumerTest = new Custumer("Tom", "555 123-8596");
        System.out.println("Custumer: " + custumerTest.getName() + "," + " " + "phone" + " " + custumerTest.getPhone());
    }
}
