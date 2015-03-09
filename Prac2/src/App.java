/**App program
 * Created by jc301192 on 9/03/15.
 */
public class App {
    public static void main(String[] args){
        String text = "This iis a simple test\nOne Two Three\nHello world!";
        for (int i=0; i< text.length(); ++i){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
