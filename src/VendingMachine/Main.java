package VendingMachine;

public class Main {
    public static void addItemsInInventory(VendingMachine machine) {
        Inventory inventory = machine.getInventory();
        ItemShelf[]  shelves = inventory.itemShelves;
        int startingCode = 101;
        for (int i=0 ; i<shelves.length ; i++) {
            ItemShelf shelf = new ItemShelf();
            shelf.setItemCode(startingCode);
            if (i<3) {
                shelf.setItemObj(Items.Pepsi);
            } else if (i<6) {
                shelf.setItemObj(Items.Coke);
            } else if(i<=9) {
                shelf.setItemObj(Items.Soda);
            }
            shelf.setSold(false);
            shelves[i] = shelf;
            startingCode++;
        }
    }

    public static void displayItems(VendingMachine machine) {
        Inventory inventory = machine.getInventory();
        ItemShelf[]  shelves = inventory.itemShelves;
        for (int i=0 ; i<shelves.length ; i++) {
            System.out.println("Code" + " " + shelves[i].itemCode + " " + "Item" + " " + shelves[i].itemObj.getName()
            + " " + "Sold" + " " + shelves[i].getSold());
        }
    }

    public static void main(String []arg) throws Exception {
        System.out.println("---- vending machine is in ideal state ----");

        System.out.println("--- putting items in vending machine inventory ----");

        VendingMachine machine = new VendingMachine();
        addItemsInInventory(machine);

        System.out.println("---- displaying items of vending machine ----");
        displayItems(machine);

        States vendingMachineStates = machine.getVendingMachineState();
        vendingMachineStates.pressInsertCoinButton();

        vendingMachineStates = machine.getVendingMachineState();
        vendingMachineStates.insertCoin();
    }
}
