package KTr;

import static org.junit.Assert.*;
import org.junit.Test;

import src.guitarstore.*;

public class InventoryTest
{
    @Test
    public void search_WhenInventoryIsEmpty_ShoultBeNull()
    {
        var sut = new Inventory(10);
        
        var result = sut.search("123");
        
        assertEquals(null, result);
    }

    @Test
    public void search_WhenBassIsInStock_ShouldReturnExpectedItem()
    {
        var expectedKey = "standard";
        var sut = new Inventory(10);
        IInventoryItem g = new Bass(expectedKey, 1);
        sut.add(g);
        
        IInventoryItem result = sut.search(expectedKey);
        
        assertTrue(result.getKey() == expectedKey);
    }

    @Test
    public void search_WhenGuitarIsInStock_ShouldReturnExpectedItem()
    {
        var expectedKey = "acc1-6";
        var sut = new Inventory(10);
        IInventoryItem g = new AccousticGuitar("acc1", 2, 6);
        IInventoryItem g2 = new Bass("bass1", 2);
        sut.add(g);
        sut.add(g2);
        
        IInventoryItem result = sut.search(expectedKey);
        
        assertEquals(expectedKey, result.getKey());
    }

    @Test
    public void casting_WhenGuitarIsAccousticGuitar_ShouldReturnExpectedItem()
    {
        var expectedKey = "acc1-12";
        var sut = new Inventory(10);
        IInventoryItem g = new AccousticGuitar("acc1", 2, 12);
        IInventoryItem g2 = new Bass("bass2", 2);
        sut.add(g);
        sut.add(g2);
        
        IInventoryItem result = sut.search(expectedKey);
        assertEquals(expectedKey, result.getKey());

        if (result instanceof AccousticGuitar)
        {
            AccousticGuitar a = (AccousticGuitar)result;
            assertNotNull(a);
        }
    }
    
    @Test
    public void search_WhenGuitarIsNotFound_ShouldReturnNull()
    {
        var expectedKey = "standard";
        var sut = new Inventory(10);
        IInventoryItem g = new Bass(expectedKey, 3);
        sut.add(g);
        
        IInventoryItem result = sut.search(expectedKey);
        
        assertTrue(result.getKey() == expectedKey);
    }

    @Test
    public void add_WhenCountLessThanSize_ShouldSucceed()
    {
        var sut = new Inventory(10);
        IInventoryItem g = new Bass("standard", 2);
        var result = sut.add(g);
        
        assertTrue(result == OperationResult.SUCCESS);
    }

    @Test
    public void add_WhenCountGreaterThanSize_ShoultFail()
    {
        var sut = new Inventory(1);
        IInventoryItem g1 = new Bass("standard", 1);
        sut.add(g1);
        
        IInventoryItem g2 = new Bass("pro", 1);
        var result = sut.add(g2);
        
        assertTrue(result == OperationResult.FAILED_FULL);
    }
}

