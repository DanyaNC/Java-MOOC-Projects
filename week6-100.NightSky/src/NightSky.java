/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danya
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void print() {
        this.starsInLastPrint = 0;
        for(int i = 0; i < height; i++) {
            this.printLine();
            System.out.println();
        }
        System.out.println("Number of stars: " + this.starsInLastPrint());
    }
    
    
    public void printLine() {
        for(int i=0; i < width; i++) {
            double check = Math.random();
            if(check < density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
            
        }
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}
