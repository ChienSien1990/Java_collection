/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package finalpkg;

/**
 *
 * @author CHIEN
 */
public class tuna {
    private int sum;
    private final int num;   //num cannot be change even in the main class cannot call it

    public tuna(int x){
        num = x;        //assign the num to the function, non-final cannot assign

    }
    public void add()
    {sum += num;
    }
    public String toString(){
    return String.format("sum = %d\n",sum);
    }
}
