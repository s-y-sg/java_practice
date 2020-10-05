// 問題：文字列、数値の入力 Step７

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 社員数を取得
        int count = sc.nextInt();
        
        for(int i = 0; i < count ; i++){
            // 名前を取得
           String name = sc.next();
           // 年齢を取得
           int age = sc.nextInt();
           
           // 今年の年齢を出力
           System.out.print(name + " ");
           System.out.println(age + 1);
        }
    }
}