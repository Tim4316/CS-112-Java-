/* 
 * Lab 1 - Greeting
 * 
 * name: Hyungu Lee
 * email: hlee18@bu.edu
 *
 * Fix all the bugs in this file! 
 */
import java.util.*;

public class Greeting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Please enter your first name:");
        String name = console.next();

        System.out.println("How old are you Gloria?");
        int age = console.nextInt();

        System.out.println("Please enter your first name: " + name);
        System.out.println("Hello " + name + ", Welcome to CS112!!!" );
        System.out.println("How old are you Gloria? " + age);

        if (1 <= age && age <= 10) {
            System.out.println("Wow " + name + "! Everyone is sweet!");
        } else if (11 <= age  && age <= 17) {
            System.out.println("Wow " + name + "! You are such a dweebs!");
        } else if (18 <= age && age <= 20) {
            System.out.println("Wow " + name + "! You are counting down to legal age!");
        } else if (age == 21) {
            System.out.println("Wow " + name + "! You just made it!");
        } else if (22 <= age && age <= 29) {
            System.out.println("Wow " + name + "! You are counting down to 30!");
        } else if (30 <= age && age <= 40) {
            System.out.println("Wow " + name + "! You are suffering adult!");
        } else if (41 <= age && age <50) {
            System.out.println("Wow " + name + "! You are a miserable adult!");
        } else {
            System.out.println("Wow " + name + "! You are speechless!!");
        }
    }
}