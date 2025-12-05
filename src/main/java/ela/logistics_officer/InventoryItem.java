package ela.logistics_officer;

import java.io.Serializable;

public class InventoryItem implements Serializable {
    private String itemName;
    private int quantity;

    public InventoryItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return "Material: " + itemName + " | Qty: " + quantity;
    }
}