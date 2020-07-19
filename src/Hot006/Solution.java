package Hot006;

public class Solution {

    public String convert(String s, int numRows) {
            char[] old = s.toCharArray();
            char[][] temp = new char[numRows][s.length()];
            int[] info = new int[s.length()];
            int flag = 1;

            for(int i  = 0 ; i<old.length;){

                if(flag%2 == 1){ //从上到下
                    for(int j = 0;j<numRows && i<old.length ;j++){
                        temp[j][info[j]] = old[i++];
                        info[j]++;
                    }
                    flag++;
                }else{
                    for(int j = numRows-2;j>0 && i<old.length;j--){
                        temp[j][info[j]] = old[i++];
                        info[j]++;
                    }
                    flag++;
                }
            }
            String string = "";
            for (int i = 0; i<numRows;i++){
                for(int j = 0 ; j<temp[i].length;j++)
                string = string+ String.valueOf(temp[i][j]);
            }
            return string;
    }

}
