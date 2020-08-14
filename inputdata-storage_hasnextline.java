// 複数行データを配列に格納する

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        
        // 複数行データを読み込み/配列に格納
        while(sc.hasNextline()){
            String data = sc.nextLine();
            array.add(data);
        }
        
        // 配列の出力
        for(String str : array){
            System.out.println(data);
        }
    }
}