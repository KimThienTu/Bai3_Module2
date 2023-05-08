import java.util.Arrays;
import java.util.Scanner;

public class BT_XoaPTMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng.
        int[] arr = {5,7,8,3,6,9,2,4};
        int n = arr.length;

        //Bước 2: Nhập X là phần tử cần xóa.
        System.out.println("Nhập giá trị cần xóa");
        int x = input.nextInt();

        // Bước 3: Tìm x xem có xuất hiện trong mảng ko.
        int index_del = -1;
        for (int i = 0; i < n; i++){
            if (arr[i] == x){
                index_del = i;
                break;
            }
        }
        if (index_del == -1){
            System.out.println("Ko tìm thấy phần tử cần xóa");
        } else {
            System.out.println("Vị trí phần tử cần xóa là: " + index_del);

            //Bước 4: Thực hiện xóa phần tử x trong mảng.
            for (int i = index_del; i < n -1; i++){
                arr[i] = arr[i + 1];
            }
            n--;

            //Bước 5: Kết thúc duyệt mảng. In ra mảng.
            System.out.println("Mảng mới sau khi xóa là: " + Arrays.toString(Arrays.copyOf(arr, n)));
        }
    }
}
