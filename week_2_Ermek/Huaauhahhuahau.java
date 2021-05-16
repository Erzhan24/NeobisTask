import java.util.*;
import java.util.Scanner;
public class Huaauhahhuahau{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().toLowerCase();
        List<Character> result = new ArrayList<>(str.length());
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result.add(c);
            }
        }
        boolean status = true;
        for(int i = 0, j = result.size() - 1; i < j; i++, j--) {
            if(result.get(i) != result.get(j)) {
                status = false;
                break;
            }
        }
        if(status)
            System.out.println("S");
        else
            System.out.println("N");
    }
}