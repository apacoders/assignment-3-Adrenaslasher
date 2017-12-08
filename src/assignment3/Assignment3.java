package assignment3;

import java.util.ArrayList;
import java.util.List;

/**
 * Instructions for this assignment.  Download this template from GitHub, fill in
 * the author comment below with your name and implement the requirements below.
 * 
 * If code is turned in and cannot be compiled, you will receive 0 points.
 * If a requirement is not implemented, you will receive 0 points.
 * Requirements are worth 50 points each.
 * 
 * @author Anish Anam
 * 
 * REQUIREMENT 1:
 * 
 * Create an ArrayList that contains a list of all animals defined in this program (see Animal class)
 * Create a for loop that calls the following methods on the animals:
 * 
 * (a) getLegs()
 * (b) speak()
 * (c) walkTo(0, 1)
 * (d) whereAmI()
 * 
 * See the Animal class for further details
 * 
 * CAT CLASS REQUIREMENTS
 * 
 * You will need to create a new class called Cat that extends Animal.  It will need
 * to implement the method walkTo.  The requirements on WalkTo are:
 * 
 * CAT_REQUIREMENT 1:
 * 
 * This class has no new parameters - the parameters it uses are the ones defined in Animal
 * Has an implementation of the method WalkTo.  When walk to is called, it will:
 * 
 * Print "Walking"
 * Print "Lying Down"
 * Set the coordinates of where it was told to walk to.  It must use the Animal coordinates
 * 
 * It must call the protected constructor on the Animal and set:
 * 
 * legs to 4 and soundParameter to Meow
 * 
 * DOG CLASS REQUIREMENTS
 * 
 * You will need to create a new class called Dog that extends Animal.  It will need
 * to implement the method walkTo.  The requirements on WalkTo are:
 * 
 * DOG_REQUIREMENT 1:
 * 
 * This class has no new parameters - the parameters it uses are the ones defined in Animal
 * Has an implementation of the method WalkTo.  When walk to is called, it will:
 * 
 * Print "Walking"
 * Print "Wagging Tail"
 * Set the coordinates of where it was told to walk to.  It must use the Animal coordinates
 * 
 * It must call the protected constructor on the Animal and set:
 * 
 * legs to 4 and soundParameter to Woof
 * 
 * MOUSE CLASS REQUIREMENTS
 * 
 * You will need to create a new class called Mouse that extends Animal.  It will need
 * to implement the method walkTo.  The requirements on WalkTo are:
 * 
 * MOUSE_REQUIREMENT 1:
 * 
 * This class has no new parameters - the parameters it uses are the ones defined in Animal
 * Has an implementation of the method WalkTo.  When walk to is called, it will:
 * 
 * Print "Walking"
 * Print "Sniffing ground"
 * Set the coordinates of where it was told to walk to.  It must use the Animal coordinates
 * 
 * It must call the protected constructor on the Animal and set:
 * 
 * legs to 4 and soundParameter to Squeak
 * 
 * 
 * HUMAN CLASS REQUIREMENTS
 * 
 * You will need to create a new class called Human that extends Animal.  It will need
 * to implement the method walkTo.  The requirements on WalkTo are:
 * 
 * HUMAN_REQUIREMENT 1:
 * 
 * This class has no new parameters - the parameters it uses are the ones defined in Animal
 * Has an implementation of the method WalkTo.  When walk to is called, it will:
 * 
 * Print "Walking"
 * Print "Looking around"
 * Set the coordinates of where it was told to walk to.  It must use the Animal coordinates
 * 
 * It must call the protected constructor on the Animal and set:
 * 
 * legs to 2 and soundParameter to Gnarly
 * 
 */
public class Assignment3 {

    public static void main(String[] args) {
        Animal dog = new Dog(4,"Woof");
        Animal cat = new Cat(4,"Meow");
        Animal humanFromTheSeventies = new Human(2,"Gnarly");
        Animal mouse = new Mouse(4,"Squeak");
        List<Animal> myAnimals = new ArrayList();
            myAnimals.add(dog);
            myAnimals.add(cat);
            myAnimals.add(humanFromTheSeventies);
            myAnimals.add(mouse);
        for(int i =0; i < myAnimals.size(); i++) {
            System.out.println(myAnimals.get(i).getLegs());
            System.out.println(myAnimals.get(i).speak());
            myAnimals.get(i).walkTo(0, 1);
            myAnimals.get(i).whereAmI();
                }
    }
    
}
