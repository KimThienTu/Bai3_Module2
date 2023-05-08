import java.util.Arrays;
import java.util.Scanner;

public class BT_ThemPTVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Khai báo và tạo mảng số nguyên.
        int[] arr = {6,9,8,7,4,2,5,3};
        int n = arr.length;

        System.out.println("Nhập phần tử cần chèn: ");
        int x = input.nextInt();

        System.out.println("Nhập vị trí cần chèn: ");
        int index = input.nextInt();

        if (index < 0 || index >= n){
            System.out.println("Không thể chèn phần tử vào mảng");
        } else {
            int[] newArray = new int[n + 1];
            for (int i = 0; i < n + 1; i++){
                if (i < index){
                    newArray[i] = arr[i];
                } else if (i == index){
                    newArray[i] = x;
                } else {
                    newArray[i] = arr[i - 1];
                }
            }
            System.out.println("Mảng mới sau khi chèn phần tử là: " + Arrays.toString(newArray));
        }
    }
}
