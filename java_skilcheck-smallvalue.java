import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 初期値設定（最大値が100）
        int small = 100;
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){
            int data = sc.nextInt();
            // 取得した値の中でいちばん小さい値を確認する
            if (small > data){
                small = data;
            }
        }
        
        System.out.println(small);
    }
}