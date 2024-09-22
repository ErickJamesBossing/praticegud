package practice_mga_lods;
public class ACTIVITY2 {
    public static void main(String [] args){
        int [][] num = {
            {10,11,12},
            {13,14,15},
            {16,17,18}
        };
        
        int Sum=0;
        
        for (int i = 0; i < num.length; i++){
            int RowSum=0;
            for (int j = 0; j < num[i].length;j++){
                RowSum += num[i][j];
            }
            Sum += RowSum;
            
            System.out.println("Row: " + (i + 1) + ": " + RowSum);
        }
        System.out.println("Total Sum: " + Sum);
    }
}
