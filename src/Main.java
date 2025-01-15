import Model.Verein;
import Model.Spieler;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppController controller = new AppController();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add a spieler");
            System.out.println("2. Update a spieler");
            System.out.println("3. Delete a spieler");
            System.out.println("4. List all spielers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1 -> addSpieler(scanner, controller);
                    case 2 -> updateSpieler(scanner, controller);
                    case 3 -> deleteSpieler(scanner, controller);
                    case 4 -> listSpielers(controller);
                    case 5 -> {
                        System.out.println("Exiting application. Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


    private static void addSpieler(Scanner scanner, AppController controller) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter position: ");
        String position = scanner.nextLine();
        System.out.print("Enter market value: ");
        int marketValue = Integer.parseInt(scanner.nextLine());
        Spieler spieler = new Spieler(name,age,position,marketValue);
        controller.addSpieler(spieler);
        System.out.println("Spieler added successfully!");
    }

    private static void updateSpieler(Scanner scanner, AppController controller) {
        listSpielers(controller);
        System.out.print("Enter the name of the spieler to update: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter position: ");
        String position = scanner.nextLine();
        System.out.print("Enter market value: ");
        int marketValue = Integer.parseInt(scanner.nextLine());
        boolean success = controller.updateSpieler(name, age, position,marketValue);
        if(success) {
            System.out.println("Spieler updated successfully!");
        }
        else {
            System.out.println("Spieler not found!");
        }
    }

    private static void deleteSpieler(Scanner scanner, AppController controller) {
        listSpielers(controller);
        System.out.print("Enter the name of the spieler to delete: ");
        String name = scanner.nextLine();
        boolean success = controller.deleteSpieler(name);
        if(success) {
            System.out.println("Spieler deleted successfully!");
        }
        else {
            System.out.println("Spieler not found!");
        }
    }

    private static void listSpielers(AppController controller) {
        List<Spieler> spielers = controller.getAllSpielers();
        if (spielers.isEmpty()) {
            System.out.println("No spielers found.");
        } else {
            spielers.forEach(System.out::println);
        }
    }


}
