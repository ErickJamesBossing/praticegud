package practice_mga_lods;
public class ErickIT22C {
    public static void main (String [] args){
        char[][] kite = {
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {' ', ' ', '*', ' ', '*', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {'*', '*', '*', '*', '*', '*', '*'},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', '*', ' ', '*', ' ', ' '},
            {' ', ' ', ' ', '*', ' ', ' ', ' '}
        };

        // Using nested loops to print the kite pattern
        for (int i = 0; i < kite.length; i++) {
            for (int j = 0; j < kite[i].length; j++) {
                System.out.print(kite[i][j] + " ");
            }
            System.out.println();
        }
    }
}
