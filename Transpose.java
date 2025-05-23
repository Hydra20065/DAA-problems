import java.util.Scanner;
public class Transpose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows: ");
        int rows= sc.nextInt();
        System.out.println("Enter no of columns: ");
        int cols= sc.nextInt();
        int[][] matrix= new int[rows][cols];

        for(int i=0; i<rows; i++){
            for( int j=0; j<cols; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int[][] transpose = new int[cols][rows]; 
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i]=matrix[i][j];

            }
        }
        System.out.println("Transposed Matrix:");
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(transpose[j][i] +" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
