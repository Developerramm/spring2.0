import java.util.Locale;
import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // internationalisation code

        Locale locale = null;
        locale = new Locale(args[0], args[1]);

        ResourceBundle bundle = ResourceBundle.getBundle("com/app/test/app", locale);

        System.out.println(
                bundle.getString("loginBtn") + " " + bundle.getString("regBtn") + " " + bundle.getString("buyBtn"));
    }
}
