import java.util.Scanner;

public class BT_TimGTNNTrongMang {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] arr = new int[SIZE];
        Scanner sc = new Scanner(System.in);

        // Nhập giá trị cho mảng.
        for (int i = 0; i < SIZE; i++){
            System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        // Gán phần tử đầu tiên của mảng là giá trị nhỏ nhất.
        int min = arr[0];

        // Duyệt qua các phần tử trong mảng để tìm GTNN.
        for (int i = 1; i < SIZE; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
