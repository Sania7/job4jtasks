/**
 * Отсортированный двумерный массив.
 */

public class Test {
    public static void main(String[] args) {
        int [][] array = {{4, 8, 7, 6, 6},
                          {3, 2, 6, 3, 2},
                          {12, 9, 1,7, 9},
                          {2, 4, 6, 4, 2}};

        int n = 4;
        int m = 5;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
        int obmen = 0;
        for (int l=0; l<n; ++l){
            for (int k =0 ; k<m; ++k){
                for (int i = 0; i<n; ++i){
                    for (int j = 0; j<m; ++j){

                        if(array[l][k] < array[i][j]){
                            int t = array[i][j];
                            array[i][j] = array[l][k];
                            array[l][k] = t;
                            obmen++;
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

