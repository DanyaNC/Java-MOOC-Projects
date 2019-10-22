/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danya
 */
import java.util.ArrayList;
import java.util.Scanner;

public class GradeChecker {

    private ArrayList<Integer> rawlist;
    private ArrayList<Integer> preparedList;
    
    public GradeChecker() {
        this.rawlist = new ArrayList<Integer>();
        this.preparedList = new ArrayList<Integer>();
    }

    public void input(Scanner scanner) {
        System.out.println("Type exam scores, -1 completes: ");
        while (true) {

            int check = Integer.parseInt(scanner.nextLine());
            if (check == -1) {
                break;
            }
            if(validity(check)) {
                rawlist.add(check);
            }
        }
        gradeAssigner();
    }
    
    public void print(){
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--) {
            System.out.print("" + i + ": ");
            starPrinter(i);
        }
        System.out.println("Acceptance percentage: " + acceptanceCalc());
    }
    
    public double acceptanceCalc(){
        double tally = 0;
        for(int num : preparedList) {
            if(num == 0) {
                tally++;
            }
        }
        return 100*(preparedList.size()-tally)/preparedList.size();
    }
    
    public void gradeAssigner() {
        for(int num : rawlist) {
            if(num < 30) {
                preparedList.add(0);
            } else if (num < 35) {
                preparedList.add(1);
            } else if (num < 40) {
                preparedList.add(2);
            } else if(num < 45) {
                preparedList.add(3);
            } else if(num < 50) {
                preparedList.add(4);
            } else {
                preparedList.add(5);
            }
        }
    }
    
    public void starPrinter(int number) {
        for(int num : preparedList) {
            if(num == number) {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public boolean validity(int check) {
        return !(check < 0 || check > 60);
    }
}
