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

public class Database {

    private ArrayList<Bird> list;

    public Database() {
        this.list = new ArrayList<Bird>();
    }

    public void add(Bird bird) {
        list.add(bird);
    }

    public void statistics() {
        for (Bird bird : list) {
            System.out.println(bird);
        }
    }

    public boolean nameCheck(String obvname) {
        for (Bird bird : list) {
            if (bird.getName().equals(obvname)) {
                return true;
            }
        }
        return false;
    }
}
