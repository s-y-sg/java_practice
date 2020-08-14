// for分　プルダウンリストを作る

public class Main {
    public static void main(String[] args) {
        String[] team = {"aaa", "bbb", "ccc"};

        System.out.println("<select name='job'>"); 
        for (String member : team) {
            System.out.println("<option>" + member + "</option>");
        }
        System.out.println("</select>");
    }
}