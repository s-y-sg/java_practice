// 問題：半角スペース区切りの出力 Step６

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        // 入力された数字の数を改行を含んで表示させる
        for(int i = 1; i <= count; i++ ){
            int item = sc.nextInt();
            System.out.println(item);
        }

    }
}