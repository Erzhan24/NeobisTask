import java.util.Scanner;
class CompareSubstring{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String str1 = in.nextLine();
            String str2 = in.nextLine();

            if (str1.length() > str2.length()) {
                String t = str2;
                str2 = str1;
                str1 = t;
            }
            int max = 0;

            loop:for (int len = str1.length(); len > 0; len--) {
                for (int line1Times = len, toffset = 0; line1Times++ <= str1.length(); toffset++) {
                    for (int oofset = 0; oofset <= str2.length() - len; oofset++) {
                        if (str1.regionMatches(toffset, str2, oofset, len)) {
                            max = len;
                            break loop;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}
