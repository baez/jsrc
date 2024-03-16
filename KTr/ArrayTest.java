package KTr;

import static org.junit.Assert.*;
import org.junit.Test;
// C:\bekari\__code\jsrc\inventory\lib
public class ArrayTest {
    @Test
    public void Array_WhenEllipsesAreUsed()
    {
        double d1 = 10.0;
        double d2 = 20.0;
        // double d3 = 30.0;
        // double d4 = 40.0;
       // System.out.printf("Average of d1 and d2 is %.1f%n", average(d1, d2)  );
        var result = average(d1, d2);
        
        assertEquals("", 15.0, result, 0.00);
    }

    public static double average(double... numbers)
    {
          double total = 0.0;

         for (double d : numbers)                
            total += d;                          

         return total / numbers.length;
    }
}
