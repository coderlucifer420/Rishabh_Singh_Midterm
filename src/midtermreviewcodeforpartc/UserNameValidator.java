package midtermreviewcodeforpartc;

/**
 *
 * @author Rishabh
 */
public class UserNameValidator {
    //String uname;
    public int verify(String abc){
        int x= 3;
        if("".equals(abc)){
                System.out.println("Cannot be empty! Retry.");
                x= 1;
        }
        return x;
    }

}
