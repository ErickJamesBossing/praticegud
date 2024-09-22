package practice_mga_lods;
public class ACTIVITY2 {
    public static void main(String [] args){
        int [][] num = {
            {100,110,120},
            {130,140,150},
            {160,170,180}
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
