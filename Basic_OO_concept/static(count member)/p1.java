



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
        private String first;
        private String last;
        private static int count;

        public p1(String first, String last){
            this.first = first;
            this.last = last;
            count++;
            System.out.printf("%s %s now have %d members\n", this.first,this.last, count);

        }

        public String getfirst()
        {
        return first;}
         public String getlast()
        {
        return last;}
         public static int counts()
         {
         return count;
         }


}