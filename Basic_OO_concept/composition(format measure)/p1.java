



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author chien
 */
public class p1 {
        private portie birthdate;
        private String name;

        public p1(String name,portie date)
        {
            this.name = name;
            birthdate = date;
            

        }
        public String toString(){
        return String.format("name %s, birthday is %s", name, birthdate);}
      

}