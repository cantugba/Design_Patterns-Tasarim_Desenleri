package LaptopFactory;

public class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        Laptop laptop;

        LaptopFactory dellFactory = new DellXPSFactory();
        LaptopFactory macbookFactory = new MacBookFactory();

        System.out.println("-Hello, I need a Windows laptop");
        System.out.println("-Okay! Please wait a sec, - Calling to the DellXPSFactory. " +
                "-Bring me a Dell laptop");

        laptop = dellFactory.createComputer();
        System.out.println(laptop.getDescription());
        System.out.println("There it is!\n");

        System.out.println("-Hello, I need a macOS laptop");
        System.out.println("-Okay! Please wait a sec, - Calling to the MacBookFactory. " +
                "-Bring me a MacBook laptop");

        laptop = macbookFactory.createComputer();
        System.out.println(laptop.getDescription());
        System.out.println("There it is!");
    }
}
