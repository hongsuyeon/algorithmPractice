import java.util.*;

public class Practice_20200616_완전탐색_모의고사 {
    public static void main(String[] args) {
       int[] arr = solution(new int[]{1,2,3,4,5});//1
        int[] arr2 = solution(new int[]{1,3,2,4,2});//1,2,3
        System.out.println("==>>>"+Arrays.toString(arr)+"===>>"+Arrays.toString(arr2));
    }
    public static int[] solution(int[] answers) {
      //  int[] result={};

        int[] per1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] per2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] per3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] arr = new int[3];
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == per1[i%per1.length]) {arr[0]++;}
            if(answers[i] == per2[i%per2.length]) {arr[1]++;}
            if(answers[i] == per3[i%per3.length]) {arr[2]++;}
        }
        List<Integer> te = new ArrayList();
        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
        for(int c=0;c<arr.length;c++){
            if(max == arr[c]){
                te.add((c+1));
            }
        }

        return te.stream().mapToInt(i->i).toArray();

    }
}
