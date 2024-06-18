import java.util.Scanner;

public class sol02_04 {

    public int[] solution (int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i=2; i<n; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;
    }

    public static void main(String[] args) {
        sol02_04 s = new sol02_04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answer = s.solution(n);
        for(int x: answer){
            System.out.print(x+" ");
        }
    }
}
