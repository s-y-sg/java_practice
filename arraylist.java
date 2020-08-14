// ArrayList まとめ
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> team = new ArrayList<String>();
        
        // 要素の追加
        team.add("勇者");
        team.add("魔法使い");
        for (String member : team) {
            System.out.println(member);
        }
        // 要素の出力（指定）
        System.out.println(team.get(0));
      
        // 要素数の出力
        System.out.println(team.size());
        
         // 既にある配列に要素の追加
        team.add("戦士");
        for (String member : team) {
            System.out.println(member);
        }
        System.out.println(team.size());
     
         // １番目の要素を置き換える
        team.set(1, "忍者");
        for (String member : team) {
            System.out.println(member);
        }
        System.out.println(team.size());
        
        // ２番目の要素を削除
        team.remove(2);
        for (String member : team) {
            System.out.println(member);
        }
        System.out.println(team.size());
    }
}