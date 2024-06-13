import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sol02_03 {

    public List<String> solution (int[] arr , int[] arr2){
        List<String> answer = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if (arr[i] == arr2[i]) answer.add("D");
            else if (arr[i] == 1 && arr2[i] == 3) answer.add("A");
            else if (arr[i] == 2 && arr2[i] == 1) answer.add("A");
            else if (arr[i] == 3 && arr2[i] == 2) answer.add("A");
            else answer.add("B");
        }

        return answer;
    }

    public static void main(String[] args) {
        sol02_03 t = new sol02_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        List<String> answer = t.solution(arr, arr2);
        for(String x : answer){
            System.out.println(x);
        }
    }
}
