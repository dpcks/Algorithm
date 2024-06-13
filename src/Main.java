import java.util.Scanner;

public class Main {
    public String Solution (String str){
        String answer ="";
        int m = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' '))!=-1){
            System.out.println(pos);
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(m < len){
                m=len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m)answer=str;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.Solution(str));
    }
}