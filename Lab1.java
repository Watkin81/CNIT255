package fountainlab;
import java.text.NumberFormat;
import java.util.*;

// Jake Watkins | CNIT255 - Lab 1 [09/01/22]

public class FountainLab {
    public static void main(String[] args) {
        
        //  |--| Inputs |--| //
        // Acquire Radius
        Scanner radiusIn = new Scanner(System.in);
        double radius;
        System.out.print("Enter the Radius (10.0 and 15.0 feet): ");
        radius = radiusIn.nextDouble();
        while(radius < 10.0 || radius > 15.0)
        {
            System.out.print("INCORRECT VALUE! Enter the Radius (10.0 and 15.0 feet): ");
            radius = radiusIn.nextDouble();
        }
        
        // Acquire Rect Ped X Width
        Scanner pedXIn = new Scanner(System.in);
        double pedX;
        System.out.print("Enter the Rectangular Pedestal’s X-Axis Width (2.0 to 8.0 feet): ");
        pedX = pedXIn.nextDouble();
        while(pedX < 2.0 || pedX > 8.0)
        {
            System.out.print("INCORRECT VALUE! Enter the Rectangular Pedestal’s X-Axis Width (2.0 to 8.0 feet): ");
            pedX = pedXIn.nextDouble();
        }
        
        // Acquire Rect Ped Y Width
        Scanner pedYIn = new Scanner(System.in);
        double pedY;
        System.out.print("Enter the Rectangular Pedestal’s Y-Axis Width (2.0 to 8.0 feet): ");
        pedY = pedYIn.nextDouble();
        while(pedY < 2.0 || pedY > 8.0)
        {
            System.out.print("INCORRECT VALUE! Enter the Rectangular Pedestal’s Y-Axis Width (2.0 to 8.0 feet): ");
            pedY = pedYIn.nextDouble();
        }
        
        // Acquire Depth
        Scanner depthIn = new Scanner(System.in);
        double depth;
        System.out.print("Enter the Depth (1.0 to 3.0 feet): ");
        depth = depthIn.nextDouble();
        while(depth < 1.0 || depth > 3.0)
        {
            System.out.print("INCORRECT VALUE! Enter the Depth (1.0 to 3.0 feet): ");
            depth = depthIn.nextDouble();
        }
        
        //  |--| Math |--| //
        // Water Volume (Feet)
        double volume = (Math.pow(radius,2) * Math.PI * depth) - (pedX * pedY * depth);
        System.out.println("Water Volume in Cubic Feet: " + volume);
        
        // Water Volume (Gallons)
        double gallons = volume * 7.481;
        System.out.println("Water Volume in Gallons: " + gallons);
        
        // Water Cost (Dollars)
        double cost = Math.ceil(gallons) * 0.1;
        System.out.println("Water Volume in Gallons: " + NumberFormat.getCurrencyInstance().format(cost));
    }
}