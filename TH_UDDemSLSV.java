import java.util.Scanner;

public class TH_UDDemSLSV {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước: ");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Kích thước ko vượt qua 30");
        } while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.println("Nhập điểm cho sinh viên " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách đánh dấu: ");
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.print("Số học sinh đạt là: " + count);
    }
}
