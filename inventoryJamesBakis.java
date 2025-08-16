import java.util.Scanner;

public class inventoryJamesBakis {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your first name followed by your last name.\nMust be between 3 and 15 characters.");
        
        String user;
        user = scnr.nextLine();
        int userCount = 0;
        while (user.length() < 3 || user.length() > 15) {
            userCount += 1;
            System.out.println("USERNAME MUST BE 3-15 CHARACTERS");
            user = scnr.nextLine();
            switch (userCount) {
                case 1:
                System.out.println("TRY AGAIN");
                break;
                
                case 2:
                System.out.println("REALLY?");
                break;

                case 3:
                System.out.println("YOU OKAY MAN?");
                break;

                case 4:
                System.out.println("BY CRIKEY I'M DONE");
                break;

                case 5:
                System.out.println("AIGHT, I'M OUTTA HERE");
                break;

                default:
                System.out.println("SIMPLY DESCPICABLE...");
                break;
            }
            
        }
        
        System.out.println("\n\n\n\n\n\n");
        System.out.println("Salutations, " + user + ". Welcome to Pure Imagination Inventory Systems.\nHow may we be of service?");

        
        inventorySystem inventorySystem = new inventorySystem();
        inventoryChat inventoryChat = new inventoryChat();

        String introOption;
       
        do {
            System.out.println("\n\n\n\n\n\n[Main menu]");
            System.out.println("X: Initiate inventory service\nC: Chat to an expert\nV: Exit");
            introOption = scnr.nextLine();
            
    

            if (introOption.equals("X") || introOption.equals("x")) {
                
                inventorySystem.inventoryMenu(scnr);
    
            }

            if(introOption.equals("C") || introOption.equals("c")) {
                
                inventoryChat.chat(scnr);
            
            }

            
          
        } while (!(introOption.equals("V") || introOption.equals("v")));

       
        System.out.println("\n\n\n\n\n\nMay your night be a wonderful one, Goodbye, " + user + "...\n\n");
        
        return;
        
    }
}