package projects.inventory.guitarstore;
// Need to add CLASSPATH environment variable and set it to the starting folder of your Java package 
// Instructor's preferred email: george.bekari@gmail.com
public class TestApp {
    public static void main(String[] args)
    {
        System.out.println("test");

        var ia = new TestApp();
        
        ia.testDeclareAndInitializeArray();
        ia.testExcxeptionHandling();
        ia.testExcxeptionHandlingWhenWeThrowException();

        System.out.println(" ==== this is the end of my program! ==== ");
    }

    public void testDeclareAndInitializeArray()
    {
        int[] array = new int[10];
        array[0] = 99;
        System.out.println(array[0]);

        for (int counter = 0; counter < array.length; counter++)
        {
            array[counter] = counter;
            System.out.println(array[counter]);
        }
    }

    public void testExcxeptionHandling()
    {
        int[] array2 = { 12,23,34,45 };
        try
        {
            array2[11] = 75;

            System.out.println("will this line execute?");
            System.out.println(array2[0]);
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
           System.out.println(e.toString());
           e.printStackTrace();
        }
    }

    public void testExcxeptionHandlingWhenWeThrowException()
    {
        try
        {
            // calling a method that returns an error code
            if (isTodaySunday())
            {
                System.out.println("Yupee!");
            }
            else
            {
                throw new Exception(":/ hhh   errrrr");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("=== my method ended smoothly ===");
    }

    private boolean isTodaySunday()
    {
        return false;
    }

}

/* 





























/*
 * C:\bekari\__code\jsrc\projects\inventory\guitarstore>java projects.inventory.guitarstore.InventoryApp
test
Average of d1 and d2 is 17.27150
====================
 * 
 * 
 */


/*
    public void ArrayTest_ShowsHowEllipsesAreUsed()
    {
        double d1 = 11.543;
        double d2 = 23.0;
        // double d3 = 30.0;
        // double d4 = 40.0;

        var result = average(d1, d2);
        System.out.printf("Average of d1 and d2 is %.5f%n", result);
        System.out.printf("====================");
    }

    public static double average(double... numbers)
    {
          double total = 0.0;

         for (double d : numbers)                
            total += d;                          

         return total / numbers.length;
    }
}
      // ia.ArrayTest_ShowsHowEllipsesAreUsed();
      */