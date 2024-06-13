import java.util.Scanner;

public class practice {

    public int solution(String a) {
        int answer;
        String b="";


        for(int i=0; i<a.length(); i++) {
            char s = a.charAt(i);
            String check = String.valueOf(s);
            if(check.matches("[0-9]+")) {
                b += check;
            }
        }
        answer = Integer.parseInt(b);

        return answer;
    }

    public static void main(String[] args) {
        practice p = new practice();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(p.solution(a));
    }
}
