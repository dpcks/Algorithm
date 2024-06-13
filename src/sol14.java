import java.util.Scanner;

public class sol14 {

    public int solution (int[] arr) {
        int answer =0;
        int max = 0;
        for(int i =0; i<arr.length;i++) {
            if(max<arr[i]){
                max=arr[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
          sol14 t = new sol14();
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < n; i++) {
              arr[i] = sc.nextInt();
          }
        System.out.println(t.solution(arr));
    }
}
