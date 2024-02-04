package KTr;

import static org.junit.Assert.*;

import org.junit.Test;
import src.*;

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
        IGuitar g = new Bass(expectedKey);
        sut.add(g);
        
        IGuitar result = sut.search(expectedKey);
        
        assertTrue(result.getKey() == expectedKey);
    }

    @Test
    public void search_WhenGuitarIsInStock_ShouldReturnExpectedItem()
    {
        var expectedKey = "acc1";
        var sut = new Inventory(10);
        IGuitar g = new AccousticGuitar(expectedKey);
        sut.add(g);
        
        IGuitar result = sut.search(expectedKey);
        
        assertTrue(result.getKey() == expectedKey);
    }
    
    @Test
    public void search_WhenGuitarIsNotFound_ShouldReturnNull()
    {
        var expectedKey = "standard";
        var sut = new Inventory(10);
        IGuitar g = new Bass(expectedKey);
        sut.add(g);
        
        IGuitar result = sut.search(expectedKey);
        
        assertTrue(result.getKey() == expectedKey);
    }

    @Test
    public void add_WhenCountLessThanSize_ShouldSucceed()
    {
        var sut = new Inventory(10);
        IGuitar g = new Bass("standard");
        var result = sut.add(g);
        
        assertTrue(result == OperationResult.SUCCESS);
    }

    @Test
    public void add_WhenCountGreaterThanSize_ShoultFail()
    {
        var sut = new Inventory(1);
        IGuitar g1 = new Bass("standard");
        sut.add(g1);
        
        IGuitar g2 = new Bass("pro");
        var result = sut.add(g2);
        
        assertTrue(result == OperationResult.FAILED_FULL);
    }
}

