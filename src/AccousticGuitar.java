package src;

public class AccousticGuitar implements IGuitar {

    public AccousticGuitar(String name)
    {
        super(name)
    }

    public String getKey() {
        throw new UnsupportedOperationException("Unimplemented method 'getKey'");
    }

    public Boolean isInStock() {
        throw new UnsupportedOperationException("Unimplemented method 'isInStock'");
    }
}
