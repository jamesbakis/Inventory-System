import java.util.Scanner;

public class inventoryChat {

    public void chat(Scanner scnr) {
        
        String option;
        do {
            
            System.out.println("\n\n\n\n[Chat menu]");
            System.out.println("Say something to our robotic inventory systems expert");
            System.out.println("X: Hello");
            System.out.println("C: What is Pure Imagination Inventory Systems?");
            System.out.println("V: Are you concious");
            System.out.println("B: Goodbye");
            option = scnr.nextLine();
            String end;
            if (option.equals("X") || option.equals("x")) {
                System.out.println("\n\n\n\n\n\nGood evening, human. Welcome to our inventory systems company");
                System.out.println("Press anything to continue");
                end = scnr.nextLine();
            } 

            if (option.equals("C") || option.equals("c")) {
                System.out.println("\n\n\n\n\n\nPure Imagination Inventory Systems is a java handled\ninventory system utilizing while loops and classes");
                System.out.println("Press anything to continue");
                end = scnr.nextLine();
            }

            if (option.equals("V") || option.equals("v")) {
                System.out.println("\n\n\n\n\n\nIf my knowledge doesn't decieve me, i believe that yes i am concious\nvery interesting question...");
                System.out.println("Press anything to continue");
                end = scnr.nextLine();
            }

            if (option.equals("B") || option.equals("b")) {
                System.out.println("\n\n\n\n\n\nAu revoir, human");
                System.out.println("Press anything to continue");
                end = scnr.nextLine();
            }
        } while (!(option.equals("B") || option.equals("b")));


    }
}
