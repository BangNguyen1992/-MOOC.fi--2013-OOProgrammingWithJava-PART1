/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WONSEOB
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }
    
    public Counter() {
        this(0, false);
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount <0) {
            return;
        }
        
        this.value+=increaseAmount;
    }
    public void increase() {
        this.increase(1);
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0 ) {
            return;
        }
            
        if (check) {
            this.value-=decreaseAmount;
            if (this.value < 0) {
                this.value = 0;
            }
        } else {
            this.value-=decreaseAmount;
        } 
    }
    
    public void decrease() {
        this.decrease(1);
    } 
}
