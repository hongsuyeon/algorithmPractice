import java.io.*;

/*
 카운팅 정렬
 : 카운팅 배열을 만든다(입력받은 해당값의 max로 크기설정)
   카운팅 뱌열의 값을 직전 요소들과 합해준다.(0/1, 2/3..)
   입력 배열과 동일한 출력 배열을 만들고 입력 배열의 역순으로 요소들을 채워넣는다.
* */
public class Practice_20200825_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer_reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer_reader.readLine());
        int temp = 0;
        int[] arr = new int[n];
        //값 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(buffer_reader.readLine());
            temp = Math.max(arr[i], temp);
        }
        //카운팅 배열 생성
        int[] countArray = new int[(temp + 1)];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }
        //카운팅 배열 이전 배열의 값과 더해서 배열에 담기
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }
        //출력할 result 배열
        int[] result = new int[n];
        for (int i = (arr.length - 1); i >= 0; i--) {
            int resutlIdx = countArray[arr[i]];
            result[(resutlIdx - 1)] = arr[i];
            countArray[arr[i]]--;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<result.length;i++){
            bw.write(result[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
