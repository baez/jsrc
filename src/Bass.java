package src;

public class Bass implements IGuitar
{
    private String name;
    private int quantity;

    public Bass(String name)
    {
        this.name = name;
        this.quantity = 0;
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
