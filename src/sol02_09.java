import java.util.Scanner;

public class sol02_09 {

    public int solution(int[][] arr ) {
        int answer = 0;
        //행합
        for (int i = 0; i < arr.length; i++) {
            int hang = 0;
            int yul = 0;
            for (int j = 0; j < arr.length; j++) {
                    hang+= arr[i][j];
                    yul+=arr[j][i];
            }
            answer = Math.max(answer, hang);
            answer = Math.max(answer, yul);
        }
        //대각선 합
        int sum = 0;
        int sum2 = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i][i];
            sum2+=arr[i][arr.length-i-1];
        }
        answer = Math.max(answer,sum);
        answer = Math.max(answer,sum2);

        return answer;
    }

    public static void main(String[] args) {
        sol02_09 sol = new sol02_09();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(sol.solution(arr));
    }
}
