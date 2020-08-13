// 標準入力とループ処理
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 入力した個数のデータ（string）を読み込み
        Scanner sc = new Scanner(System.in);
        //　データ個数の取得
        int count = sc.nextInt();
        System.out.println("データ個数 " + count);
        
        //　データ個数の分の文字列を取得
        String data;
        for(int i = 0; i < count; i++){
            data = sc.next();
            System.out.println("hello " + data);
        }
    }
}