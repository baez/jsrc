package projects.inventory.guitarstore;

public abstract class AbstractGuitar implements IInventoryItem {
    protected String name;
    protected int quantity;

    public AbstractGuitar(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getKey()
    {
        return this.name;
    }

    public Boolean isInStock()
    {
        return this.quantity > 0;
    }
}
