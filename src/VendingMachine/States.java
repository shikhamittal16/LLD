package VendingMachine;

public interface States {
    void pressInsertCoinButton() throws Exception;
    void insertCoin() throws Exception;
    void pressSelectProductButton() throws Exception;
    void chooseProduct() throws Exception;
    void cancelProduct() throws Exception;
    void returnChange() throws Exception;
    void dispenseProduct() throws Exception;
}
