package VendingMachine;

public enum Items {
    Coke("coke", 10),
    Pepsi("pepsi", 20),
    Water("water", 10),
    Soda("soda", 30);

    private String name;
    private int price;

    private Items(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }
}
