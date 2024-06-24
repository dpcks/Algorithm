import java.util.Scanner;

public class sol02_08 {

    public int[] solution (int[] arr) {
        int[] answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int cnt=1;
            for(int j=0; j<arr.length;j++){
                if(arr[i]<arr[j])cnt++;
            }
            answer[i]=cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        sol02_08 sol = new sol02_08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : sol.solution(arr)) {
            System.out.print(x + " ");
        }
    }
}
