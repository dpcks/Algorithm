import java.util.Scanner;

public class sol9 {

    public int solution(String s){
        String answer ="";
        for(char x : s.toCharArray()){
//            if(x>=48 && x<=57){
////                answer=answer*10+(x-48);
//            }
            if(Character.isDigit(x))answer+=x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        sol9 T =new sol9();
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
