// 問題：半角スペース区切りの出力 Step5

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i = 1; i <= count ; i++){
            if(i < count){
              System.out.print("paiza "); 
            }
            else{
              System.out.println("paiza"); 
            }
        }
    }
}