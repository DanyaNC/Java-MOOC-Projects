/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danya
 */
public class Counter {

    private int value;
    private boolean checker;

    public Counter(int StartingValue, boolean check) {
        this.value = StartingValue;
        this.checker = check;

    }

    public Counter(int StartingValue) {
        this(StartingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
        
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            this.value -= decreaseAmount;
            if (this.checker && this.value<0) {
               this.value = 0;
            } 
            
        }

    }



  
    
}
