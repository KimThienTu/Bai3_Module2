import java.util.Scanner;

public class BT_Mang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trận vuông: ");
        int size = input.nextInt();

        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.println("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += arr[i][i];
        }
        System.out.println("Tổng các phần tử trên đường chéo là: " + sum);
    }
}
