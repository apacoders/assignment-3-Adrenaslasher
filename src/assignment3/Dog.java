/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Anish.Anam
 */
public class Dog extends Animal{

    public Dog(int numOfLegs, String speakParameter) {
        super(numOfLegs, speakParameter);
    }

    @Override
    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Wagging Tail");
        System.out.println("(" + x + ", "+ y + ")");
    }
    
}
