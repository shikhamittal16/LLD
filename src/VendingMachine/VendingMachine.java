package VendingMachine;

import java.util.List;

public class VendingMachine {
    private States vendingMachineState;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine() {
        this.vendingMachineState = new IdleState();
        this.inventory = new Inventory(10);
        this.coins = coins;
    }

    public States getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(States vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
