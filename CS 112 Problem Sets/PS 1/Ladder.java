/*
 * LengthComp.java
 * 
 * A program that allows a user to  
 * precompute the required length of the ladder.
 * 
 * CS 112 Course Staff (cs112-staff@cs.bu.edu)
 * 
 * completed by: Hyungu Lee / hlee18@bu/edu   
 * partner (if any): Minjun Kim / mkim3@bu.edu
 */ 
import java.util.*;

public class Ladder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Height of the point the ladder needs to reach: ");
        int height = console.nextInt();
        System.out.print("Angle in degrees at which the ladder will be positioned: ");
        int angle = console.nextInt();

        double radians;
        radians = ((angle * Math.PI) / 180);
        double length;
        length = ((height) / (Math.sin(radians)));

        System.out.println("The required length is:");
        System.out.println(length + " feet");
        System.out.println((length / 3) + " yards");
        System.out.println((int)(length / 3) + " yards and " + ((length - (int)(length / 3) * 3)) + " feet");

    }
    
}
