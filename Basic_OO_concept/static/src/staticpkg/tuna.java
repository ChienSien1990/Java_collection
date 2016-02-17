

package staticpkg;

public class tuna {

    private String first;
    private String last;
    private static int member =0;
    
    public tuna(String ft, String lt){
        first = ft;
        last = lt;
        member++;
        System.out.printf("First name is : %s, Last name is %s, members are %d\n", first, last, member);
    }
    public String getfirst(){
        return first;
    }
    public String getlast(){
        return last;

    }
    public static int getmember(){
        return member;
    }
}
