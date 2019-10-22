/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danya
 */
public class StringUtils {
    public static boolean included(String word, String searched) {
        //Preps both the information of the book and the search term for use
        word = word.toUpperCase();
        searched = searched.trim();
        searched = searched.toUpperCase();
        //Runs the check
        return word.contains(searched);
    }
}
