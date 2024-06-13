import java.util.ArrayList;
import java.util.Scanner;

public class reverse2 {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String s : str){
            char[] x = s.toCharArray();
            int lt =0, rt= s.length()-1;
            while(lt < rt){
                char tmp = x[lt];
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(x);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        reverse2 T = new reverse2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String s : T.solution(n, str)) {
            System.out.println(s);
        }
    }
}
