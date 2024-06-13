import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sol10 {

    public List<Integer> solution (String str, String s){
        List<Integer> ans = new ArrayList<Integer>();
         char[] arr = str.toCharArray();
         for(int i=0; i<arr.length; i++){
             int k=-1,j=1;
             while(true){
                 if(arr[i]==s.charAt(0)){ans.add(0);break;}
                 else if(i+j<arr.length && arr[i+j]==s.charAt(0)){
                     ans.add(j);
                     break;
                 }
                 else if(i+k>=0 && arr[i+k]==s.charAt(0)) {
                     ans.add(k * -1);
                     break;
                 }
                 j++; k--;
             }
         }
         return ans;
    }

    public static void main(String[] args) {
        sol10 sol = new sol10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();
        List<Integer> ans = sol.solution(str, s);
        for(int x : ans){
            System.out.print(x+" ");
        }
    }
}
