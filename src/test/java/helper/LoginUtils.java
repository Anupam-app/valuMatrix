package helper;

public class LoginUtils {

    public static String getPassword(String login) {
        switch (login.toLowerCase()) {
            case "raghavendra.shekaraiah@valuematrix.ai":
                return "Welcome1";
            case "amitava.bhattacharjee@valuematrix.ai":
                return "Welcome1";
            default:
                return "ValueMatrix@123";
        }
    }
}
