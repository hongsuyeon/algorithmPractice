public class Practice_20200626_두정수사이의합 {
    public static void main(String[] args) {
        long result1= solution(3,5);
        long result2=solution(3,3);
        long result3=solution(5,3);
        System.out.println("result1.."+result1+", result2.."+result2+", result3.."+result3);
    }
    public static long solution(int a, int b) {
        long answer = 0;
        int start = a;
        int end = b;
        if(a>b){
            start =b;
            end = a;
        }

        for(int a1=start;a1<=end;a1++){
            answer +=a1;
        }

        return answer;
    }
}
