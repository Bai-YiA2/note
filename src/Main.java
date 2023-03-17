import java.util.Scanner;

/**
 * 用于洛谷解决题目
 * @auther Bai_YiA2
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char b = 'A';
        char c;
        int r = 0;
        for (int i = 0; i < a; i++) {
            c = scanner.next().charAt(0);
            if (c == b) {
                r++;
                if (b != 'Z')
                    b++;
                else
                    b = 'A';
            }
        }
        System.out.println(r);
    }
}