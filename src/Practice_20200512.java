public class Practice_20200512 {
    public static void main(String[] args) {
        String a = solution(4);
        System.out.println(a);
    }
    public static String solution(int n) {
        String answer = "";
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                answer +="수";
            }else{
                answer +="박";
            }
// result += i % 2 == 0 ? "수" : "박";
        }
        return answer;
    }
}
