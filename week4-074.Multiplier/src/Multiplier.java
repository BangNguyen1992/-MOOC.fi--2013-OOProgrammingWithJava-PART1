/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WONSEOB
 */
public class Multiplier {
    private int multi;
    
    public Multiplier (int input) {
        this.multi = input;
    }
    
    public int multiply(int otherNumber) {
        return this.multi*otherNumber;
    }
    
}
