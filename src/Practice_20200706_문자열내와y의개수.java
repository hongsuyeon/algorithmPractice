public class Practice_20200706_문자열내와y의개수 {
    public static boolean solution(String s) {
        boolean answer = false;
        s = s.toUpperCase();
        char[] arr = s.toCharArray();
        int countY =0, countP=0;
        for(int i=0;i<arr.length;i++){
            int arrs = (int) arr[i];
            if(arrs == 80){
                countY++;
            }
            if(arrs == 89){
                countP++;
            }
        }
        if(countY == countP){
            answer=true;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution("pPoooyY");
    }
}
