import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 数値入力 */
        Scanner sc = new Scanner(System.in);
        int line1 = sc.nextInt();
        int line2 = sc.nextInt();
 
        /* 数値計算 */
        System.out.println(line1*line2);
    }
}