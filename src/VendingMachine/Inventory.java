package VendingMachine;
public class  Inventory {
    ItemShelf[] itemShelves = null;

    public Inventory(Integer itemCount) {
        itemShelves = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    public void initialEmptyInventory() {
        int startingCode = 101;
        for (int i=0; i<itemShelves.length; i++) {
            ItemShelf shelf = new ItemShelf();
            shelf.setSold(true);
            shelf.setItemCode(startingCode);
            itemShelves[i] = shelf;
            startingCode++;
        }
    }
}
