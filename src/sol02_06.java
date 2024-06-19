import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sol02_06 {

    public List<Integer> solution(int[] arr){
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            int rev = 0;
            while(arr[i]!=0){
                rev = rev*10 + arr[i]%10;
                arr[i] /= 10;
            }
            arr[i] = rev;
            if(arr[i]==1 )arr[i]=0;
            for(int j=1; j<arr[i]; j++){
                if(arr[i]%j==0 && rev!=j && j != 1){
                    arr[i] = 0;
                    break;
                }
            }
            if(arr[i]!=0){
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        sol02_06 s = new sol02_06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = s.solution(arr);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
