package src.guitarstore;

public class AccousticGuitar extends AbstractGuitar 
{
    private int numberOfStrings;

    public AccousticGuitar(String name, int quantity, int numberOfStrings)
    {
        super(name, quantity);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumbeString() {
        return this.numberOfStrings;
    }

    public String getKey() {
        return super.getKey() + "-" + this.numberOfStrings;
    }
}
