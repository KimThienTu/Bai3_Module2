import java.util.Scanner;

public class BT_TinhTongCacSo {
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        int col = 1; // tính tổng của cột thứ 2.
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//            sum += arr[i][col];
//        }
//        System.out.println("Tổng của cột " + col + " là: " + sum);

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng: ");
        int rows = input.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.println("hập giá trị cho phần tử [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Nhập số cột mà bạn muốn tính tổng: ");
        int col = input.nextInt();

        int sum = 0;
        for (int i = 0; i < rows; i++){
            sum += arr[i][col];
        }
        System.out.println("Tổng của cột " + col + " là: " + sum);
    }
}
