import java.util.Scanner;
import java.util.ArrayList;

public class inventorySystem {

    ArrayList<inventoryItem> inventory = new ArrayList<>();
    public inventorySystem() {
    }
   
    
    public void inventoryMenu(Scanner scnr) {
        System.out.println("\n\n\n\n\n\nInititating Inventory service...");
        
        String option;
        do {
            
            System.out.println("\n\n\n\n[Inventory Menu]");
            System.out.println("X: Add an item");
            System.out.println("C: Modify an existing item");
            System.out.println("V: View all items");
            System.out.println("B: Back");
            option = scnr.nextLine();
            
            if (option.equals("X") || option.equals("x")) {
                inventoryAdd(scnr);
            } 

            if (option.equals("C") || option.equals("c")) {
                inventoryModify(scnr);
            }

            if (option.equals("V") || option.equals("v")) {
                inventoryView(scnr);
            }
        } while (!(option.equals("B") || option.equals("b")));
        
    }

    public void inventoryAdd(Scanner scnr){
        String name;
        String quantity;
        String description;

        
        System.out.println("\n\n\n\n\n\nName (Phrase): ");
        name = scnr.nextLine();
        System.out.println("\n\n\nQuantity (Numerical Value): ");
        quantity = scnr.nextLine();
        System.out.println("\n\n\nDescription (Sentence): ");
        description = scnr.nextLine();
        inventoryItem item = new inventoryItem(name, quantity, description);
        inventory.add(item);
        
    
    }
    
    public void inventoryModify(Scanner scnr) {
       
        System.out.println("\n\n\n\n\n\nEnter the exact name of an item to modify");
        String itemModify = scnr.nextLine();

        for (int i = 0; i < inventory.size(); ++i) {
            if (inventory.get(i).name.equals(itemModify)) {
                inventoryItem item = inventory.get(i);
                System.out.println("\nThe item " + itemModify + " exists.");
                
                String option;
                do {
                    
                    System.out.println("\nWhat would you like to do?\n");
                    System.out.println("[Item menu]");
                    System.out.println("X: Update name");
                    System.out.println("C: Update quantity");
                    System.out.println("V: Update description");
                    System.out.println("D: Delete item");
                    System.out.println("B: Back");
                    option = scnr.nextLine();
        
                    if (option.equals("X") || option.equals("x")) {
                        System.out.println("Update the name of " + item.name);
                        item.name = scnr.nextLine();
                        System.out.println("Item name changed to " + item.name);
                    } 

                    if (option.equals("C") || option.equals("c")) {
                        System.out.println("Update the quantity. Currently set as [" + item.quantity + "]");
                        item.quantity = scnr.nextLine();
                        System.out.println("Item quantity changed");
                    }

                    if (option.equals("V") || option.equals("v")) {
                        System.out.println("Update the description");
                        item.desc = scnr.nextLine();
                    }

                    if (option.equals("D") || option.equals("d")) {
                        System.out.println("Are you sure? Y/N");
                        String confirm = scnr.nextLine();
                        if ("Yy".contains(confirm)) {
                            inventoryDelete(item);
                            return;
                        }
                        
                    }

                } while (!(option.equals("B") || option.equals("b")));
               
                break;
            } else {
                if (i == inventory.size() - 1) {
                    System.out.println("\n\n\n\n\n\nThe item " + itemModify + " does NOT exist");
                    System.out.println("*" + itemModify + "*");
                    System.out.println("Press any key to return to the inventory menu");
                    String end = scnr.nextLine();
                    end += end;
                    
                }
                
            }

        }
        
    }

    public void inventoryView(Scanner scnr) {
        
        System.out.println("\n\n\n\n\n\n");
        if (inventory.size() == 0) {
            System.out.println("INVENTORY EMPTY\n");
        }
        for (int i = 0; i < inventory.size(); ++i) {
            String name = inventory.get(i).name;
            String quantity = inventory.get(i).quantity;
            String desc = inventory.get(i).desc;
            
            System.out.println("Item " + (i + 1) + ": " + name);
            System.out.println("Quantity: " + quantity);
            System.out.println("Description: " + desc);
            System.out.println();
            
        }

        System.out.println("Feel free to scroll upwards to view hidden items");
        System.out.println("Press any key to return to the inventory menu");
        String end = scnr.nextLine();
        end += end;
        
    }

    public void inventoryDelete(inventoryItem item) {
        for (int i = 0; i < inventory.size(); ++i) {
            if(inventory.get(i).name.equals(item.name)) {
                inventory.remove(i);
            }
        }
    }
}
