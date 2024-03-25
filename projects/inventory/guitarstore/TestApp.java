package projects.inventory.guitarstore;

import java.util.ArrayList;
import java.util.Arrays;

// Need to add CLASSPATH environment variable and set it to the starting folder of your Java package 
// Instructor's preferred email: george.bekari@gmail.com
public class TestApp {
    public static void main(String[] args)
    {
        System.out.println("test");
        try {

        var ia = new TestApp();
        
        // ia.testDeclareAndInitializeArray();
        // ia.testExcxeptionHandling();
        ia.testExcxeptionHandlingWhenWeThrowException();
        ia.testCallingAFunctionthatThrows();
        }
        catch(Exception e)
        {
            System.out.println(" ==== the App threw an exception! ==== ");
            System.out.println(e.getMessage());
        }

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

     /*
     * 1 -- Catching execptions: Only Handle exceptions that you can do something about => take appropriate actions and continue
     * 2 -- Don't use Exceptions to route the execution logic. Use if and switch clauses for that.
     */

    public void testCallingAFunctionthatThrows() throws Exception
    {
            // calling a method that returns an error code
        if (isTodaySunday(true))
        {
           System.out.println("Yupee!");
        }
    
        System.out.println("=== my method ended smoothly ===");
    }


    public void testExcxeptionHandlingWhenWeThrowException()
    {
        try
        {
            // calling a method that returns an error code
            if (isTodaySunday(true))
            {
                System.out.println("Yupee!");
            }
            else
            {
                throw new Exception(":/ no? errrrr :]");
            }
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (StackTraceElement element: stackTraceElements)
            {
                System.out.println(element.getMethodName());
                System.out.printf("using printf: %s%n", element.getMethodName());
            }
        }
        finally
        {
            System.out.println("always executed regardless of what occurs in try .. catch");
        }

        System.out.println("=== my method ended smoothly ===");
    }

    private boolean isTodaySunday(boolean updateCalendar) throws Exception
    {
        {
        // fetches the datetime 
        // determines if today is Sunday or not
        }
        
        if (updateCalendar == true) {
            // connects to a calendar database and update it
            // client.Connect();
            throw new Exception("unable to connect to the calendar database");
        }

        return false;
    }

    /*
     *  arrays are fixed sized
     *  if you need to grow an array
     *  create a new array of your desired size
     *  move the items from the old array into the new array
     *  delete the old array 
     * 
     */
    private void testGenericArrayList() 
    {
        ArrayList<String> names = new ArrayList<>(100);
        ArrayList<Integer> ages = new ArrayList<>(100);

        names.add("xyz");
        ages.add(32);

        for (String name : names)
        {
            System.out.printf(" %s ", name);
        }
    }

    private void testArraysClass()
    {
        double[] percentages = {8.4, 9.3, 0.2, 7.5, 8.1, 1.3 };

        /* duplicated code
        for (double percentage : percentages )
        {
            System.out.printf("%.1f", percentage);
        } */

        testDisplayArray(percentages);

        Arrays.sort(percentages);

        testDisplayArray(percentages);

        /* duplicated code 
        for (double percentage : percentages )
        {
            System.out.printf("%.1f", percentage);
        } */

    }

    /*
     * Do not duplicate code - Write once and reuse
     */
    private void testDisplayArray(double[] items)
    {
        for (double item : items )
        {
            System.out.printf("%.1f", item);
        }
    }

    private void testMultiDimensionalArrays()
    {
        int[][] a = {{20, 30}, {40, 50}};

        int[][] b = {{20, 30}, {40, 50, 60}};

        int[][] c = new int[4][5];

        int[][] d = new int[4][];
        

        d[0] = new int[30];
        d[1] = new int[25];
        d[2] = new int[20];
        d[3] = new int[15];
    }

    /* 
     * XML - markup language - Extensible Markup Language
     * JSON - data interchange formatting language
     * HTML
     * 
     */
    private void testStringManipulation()
    {
        String s = "hello";
        String s1 = "Guffy";
        String s2 = "Micky";
        String s3 = "Donald Duck";
        String s4 = "Bugs Bunny";
        
        String message = s + s1 + s2 + s3 + s4;

        var builder = new StringBuilder(50);
        builder.append(s);
        builder.append(' ');
        builder.append(2024);
        builder.append(' ');
        builder.append(s1);
        builder.append(' ');
        builder.append(s2);
        builder.append(' ');
        builder.append(s3);
        builder.append(' ');
        builder.append(s4);

        var finalString = builder.toString();
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