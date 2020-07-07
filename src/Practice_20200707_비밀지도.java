import java.util.Arrays;

public class Practice_20200707_비밀지도 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] result1 = arrayList(n, arr1);
        int[][] result2 = arrayList(n, arr2);

        for(int i=0;i<result1.length;i++){
            int[] c = result1[i];
            String data="";
            for(int j=0;j<c.length;j++){
                if(result1[i][j] == 0 &&  result2[i][j] == 0){
                    //공백
                    data += " ";
                }else{
                    //#
                    data += "#";
                }
                answer[i] = data;
            }
        }
        return answer;
    }


    public static int[][] arrayList(int n, int[] arr){
        int[][] retrunV = new int[n][n];
        for(int i=0;i<arr.length;i++){
            int ar = arr[i];
            String data ="";
            while(ar > 1){
                data+=ar%2;
                ar=ar/2;
            }
            StringBuffer tes = new StringBuffer();
            tes.append(data);
            tes.reverse();
            String arrA = String.valueOf(ar)+tes;
            if(n - arrA.length() > 0){
                String arr0 ="";
                for(int d=0;d<(n - arrA.length());d++){
                    arr0 +="0";
                }
                arrA = arr0 + arrA;
            }
            char[] arrT = arrA.toCharArray();
            for(int j=0;j<arrT.length;j++){
                retrunV[i][j] = Integer.parseInt(String.valueOf(arrT[j]));
            }
        }
        return retrunV;
    }
    public static void main(String[] args) {
        String[] result  = solution(5,new int[]{9, 20, 28, 18, 11},new int[]{30, 1, 21, 17, 28});
        System.out.println(Arrays.toString(result));
    }
}
