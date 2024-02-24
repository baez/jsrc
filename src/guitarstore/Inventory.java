package src;
public class Inventory
{
    private int count;
    private int size;
    
    private IInventoryItem[] guitars;
    
    public Inventory(int size)
    {
        this.count = 0;
        this.size = size;
        
        this.guitars = new IInventoryItem[size];
    }

    public OperationResult add(IInventoryItem g)
    {
        if (this.count >= this.size)
        {
            return OperationResult.FAILED_FULL;
        }
        
        this.guitars[this.count] = g;
        this.count++;
        
        return OperationResult.SUCCESS;
    }
    
    public IInventoryItem search(String key)
    {
        for(int i = 0; i < this.count; i++)
        {
            if (this.guitars[i].getKey().equals(key))
            {
                return this.guitars[i];
            }
        }
        
        return null;
    }
}
