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
public class Human extends Animal{

    public Human(int numOfLegs, String speakParameter) {
        super(numOfLegs, speakParameter);
    }

    @Override
    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Looking around");
        System.out.println("(" + x + ", "+ y + ")");
    }
    
}
