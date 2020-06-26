import java.util.Arrays;

public class Practice_20200626_같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr1 = solution(new int[]{1,1,3,3,0,1,1});
        int[] arr2 = solution(new int[]{4,4,4,3,3});
        System.out.println(Arrays.toString(arr1)+", ");
        System.out.println(Arrays.toString(arr2)+", ");
    }
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int count = 0;
        int temp = arr[0];
        for(int d=1;d<arr.length;d++){
            if(temp == arr[d] && arr[d] != -1){
                arr[d] = -1;
                count++;
            }else{
                temp= arr[d];
            }
        }

        answer = new int[(arr.length - count)];
        int cpi=0;
        for(int c: arr){
            if(c > -1){
                answer[cpi] = c;
                cpi++;
            }
        }
        return answer;
    }
}
