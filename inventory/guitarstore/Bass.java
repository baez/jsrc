package src.guitarstore;

public class Bass extends AbstractGuitar
{
    public Bass(String name, int quantity)
    {
        super(name, quantity);
        this.quantity = 0;
    }

    public String getKey()
    {
        return this.name;
    }    
}
