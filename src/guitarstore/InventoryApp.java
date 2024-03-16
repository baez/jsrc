package src.guitarstore;

public class InventoryApp {
    public static void main(String[] args)
    {
        System.out.println("test");

        var ia = new InventoryApp();
        ia.ArrayTest_ShowsHowEllipsesAreUsed();
    }

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
