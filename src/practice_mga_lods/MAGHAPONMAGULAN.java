package practice_mga_lods;
public class MAGHAPONMAGULAN {
    public static void main (String [] args) {
        int [][] num = {
            {12,13,14},
            {15,16,17},
            {18,19,20},
        };
        int sum = 0;
        for (int i = 0; i < num.length;i++){
            int rowsum = 0;
            for (int j=0; j < num[i].length;j++){
                rowsum += num[i][j];
            }
            sum+=rowsum;
            
            System.out.println("Row: " + (i + 1) + ": " + rowsum);
        }
        System.out.println("Total: " + sum);
    }
}
