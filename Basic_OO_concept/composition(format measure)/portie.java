/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author chien
 */
public class portie {
    private int month, day, year;

    public portie(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
        
    }

    public String toString(){

        return String.format(" %d / %d / %d", this.month,this.day,this.year);}

}
