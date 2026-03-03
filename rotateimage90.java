// furkan ali cetin
// it s different approximation

public class rotateimage90 {
    public static void make(int[][] nums ,int i, int j) {

        int temp = nums[i][j];

        for (int k = 0; k < 3; k++) {
            nums[i][j] = nums[nums.length - j - 1][i];
            int a = nums.length - j - 1;
            j = i;
            i = a;

        }
        nums[i][j] = temp;

    }

    public void rotate(int[][] matrix) {
        int i = 0; 
        
        while(i < matrix.length / 2) {
               
            int j = matrix.length - 2 - i;     
            while(i <= j) {
                make(matrix, i, j);
                j--;
            }
            
            i++; 
        }
    }
}