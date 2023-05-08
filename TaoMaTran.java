import java.util.Scanner;
public class TaoMaTran {
    public static void main(String[] args) {
        // Yêu cầu người dùng nhập kích thước ma trận
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = input.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = input.nextInt();

        // Khởi tạo ma trận với kích thước đã nhập
        int[][] matrix = new int[rows][cols];

        // Yêu cầu người dùng nhập giá trị từng phần tử của ma trận
        System.out.println("Nhập giá trị từng phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Hiển thị ma trận đã nhập
        System.out.println("Ma trận đã nhập:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
