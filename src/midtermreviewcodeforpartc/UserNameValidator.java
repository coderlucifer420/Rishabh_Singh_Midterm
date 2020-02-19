package midtermreviewcodeforpartc;

/**
 *
 * @author Rishabh
 */
public class UserNameValidator {
    //String uname;
    public void verify(String abc){
        if("".equals(abc)){
            System.out.println("Cannot be empty! Exiting program.");
            System.exit(0);
        }
    }

}
