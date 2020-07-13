public class Practice_20200713 {
    public static String solution(String s) {
        String answer = "";
        char[] arr = s.toLowerCase().toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                arr[0]  = Character.toUpperCase(arr[0]);
            }
            if(arr[i] == ' ' && i < (arr.length-1)){
                arr[i+1] = Character.toUpperCase(arr[i+1]);
            }
            answer+= arr[i];
        }
        return answer;
    }
}
