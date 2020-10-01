// 問題：単純な入出力 Step4

import java.util.*;


public class Main {
    public static void main(String[] args) {
        int max = 0; 
        Scanner sc = new Scanner(System.in);

        // 複数行データを読み込み
        while(sc.hasNextLine()){
            int data = sc.nextInt();
            
            // 最大値を判定
            if(max < data){
                max = data;
            }
        }
        
        // 最大値を表示
        System.out.println(max);
    }
}