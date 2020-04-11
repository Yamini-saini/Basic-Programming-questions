package basicPrograms;

import java.util.Scanner;

public class StringConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int toDelete = 0;
        int i = 0;
        while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i)) {
            i++;
        }
        toDelete = s.length() - i;
        int ops = toDelete + (t.length() - i);
        if (ops <= k && ((k - ops) % 2 == 0 || (k - ops) > 2 * i)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}
