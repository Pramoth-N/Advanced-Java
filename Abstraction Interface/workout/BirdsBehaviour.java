/*
 * 
 * You are tasked to Implement an abstract class Bird with abstract methods fly() and make Sound(). Create subclasses Eagle and Hawk that define these methods to describe their flying behavior and sounds. Implement a function to input the type of bird and display its behavior and sound.
Input Format:
• A single string representing the type of bird, either Eagle or Hawk.
Output Format:
• If the input is Eagle, print "The eagle soars high in the sky The eagle screeches"
• If the input is Hawk, print "The hawk glides smoothly through the air The hawk shrieks"
• Otherwise, print Invalid input.
Sample Input 1:
Eagle
Sample Output 1:
The eagle soars high in the sky
The eagle screeches
 * 
 */

 import java.util.Scanner;

abstract class Bird {
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("The eagle soars high in the sky");
    }
    
    @Override
    void makeSound() {
        System.out.println("The eagle screeches");
    }
}

class Hawk extends Bird {
    @Override
    void fly() {
        System.out.println("The hawk glides smoothly through the air");
    }
    
    @Override
    void makeSound() {
        System.out.println("The hawk shrieks.");
    }
}

public class BirdsBehaviour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String birdType = sc.nextLine();
        
        Bird bird;
        
        if (birdType.equalsIgnoreCase("Eagle")) {
            bird = new Eagle();
        } else if (birdType.equalsIgnoreCase("Hawk")) {
            bird = new Hawk();
        } else {
            System.out.println("Invalid input");
            return;
        }
        
        bird.fly();
        bird.makeSound();
    }
}