import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        
        // デバックif分
        //String line1 = "paiza";
        //String line2 = "paiz";
        // デバック入力
        //System.out.println(line1);
        //System.out.println(line2);
        
        //if( line1 == line2 ){
        if( line1.equals(line2)){
           System.out.println("OK"); 
        }
        else{
           System.out.println("NG"); 
        }
        
    }
}