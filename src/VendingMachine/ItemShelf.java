package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class ItemShelf {
    Items itemObj;
    Integer itemCode;

    public Items getItemObj() {
        return itemObj;
    }

    public void setItemObj(Items itemObj) {
        this.itemObj = itemObj;
    }

    public Integer getItemCode() {
        return itemCode;
    }

    public void setItemCode(Integer itemCode) {
        this.itemCode = itemCode;
    }

    public Boolean getSold() {
        return isSold;
    }

    public void setSold(Boolean sold) {
        isSold = sold;
    }

    Boolean isSold;
}
