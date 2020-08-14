// 問題：単純な入出力 Step３

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 入力する整数の回数を標準入力から取得
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        // 回数分の整数を取得し、出力
        for(int i = 0; count > i ; i++ ){
            int seisu = sc.nextInt();
            System.out.println(seisu);
        }
        
    }
}