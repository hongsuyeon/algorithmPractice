import java.sql.ClientInfoStatus;
import java.util.*;
//레벨1단계 : 크레인인형뽑기
public class Practice_20200427 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0}
                ,{0,0,1,0,3}
                ,{0,2,5,0,1}
                ,{4,2,4,4,2}
                ,{3,5,1,3,1}};
        int[] moves = {1,1,1,1,1,1,1,1};

        List<Integer> test = new ArrayList();
        int count = 0;
        for(int j=0;j<moves.length;j++) {
            int jVal = moves[j] -1;
            int i=0;
            while(i<board.length){
                if(board[i][jVal] > 0){
                    if(test.size()> 0 && test.get(test.size()-1) == board[i][jVal]){
                        count+=2;
                        test.remove(test.size()-1);
                    }else{
                        test.add(board[i][jVal]);
                        board[i][jVal]=0;
                    }
                    break;
                } i++;
            }
        }
    }
}