import java.util.Scanner;

public class sol13 {

    public String solution (int[] n){
        String answer = "";
        answer = n[0]+" ";
        for(int i = 1; i < n.length; i++){
            if(n[i-1] < n[i]){answer = answer + n[i] + " ";}
        }

        return answer;
    }

    public static void main(String[] args) {
        sol13 T = new sol13();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] n = new int[num];
        for(int i=0;i<num;i++){
            n[i] = sc.nextInt();
        }
        System.out.println(T.solution(n));
    }
}
