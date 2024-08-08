
/*
 * 
 * 
 * Create a module that handles different types of animals and the sounds they make. 
 * Implement a base class Animal with a method to make a sound, and derived classes Dog 
 * and cat that override this method to provide specific sounds for each animal.
Input Format
• A string indicating the type of animal ("Dog" or "Cat").
Output Format
• Print the sound made by the animal ("Woof" for Dog and "Meow" for Cat).
• Print "Invalid input" if the input is other than given animal.
Constraints
• The input will be a single word indicating the animal type.
 * 
 * 
 */

import java.util.*;

class Animal {
    public String makeSound(){
        return "Invalid input";
    }
}
class Cat extends Animal{
    @Override
    public String makeSound(){
        return "Meow";
    }
}

class Dog extends Animal{
    @Override
    public String makeSound(){
        return "Woof";
    }
}

class AnimalSound {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Animal animal; 
        switch(name) {
            case "Cat" :
                animal = new Cat();
                break;
            case "Dog" :
                animal = new Dog();
                break;
            default :
                animal = new Animal();
        }
        System.out.print(animal.makeSound());
    }
}