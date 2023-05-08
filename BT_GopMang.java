import java.util.Arrays;

public class BT_GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};
        int[] arr = new int[arr1.length + arr2.length];
        // Duyệt các phần tử trong mảng arr1 gán vào arr.
        for (int i = 0; i < arr1.length; i++){
            arr[i] = arr1[i];
        }
        // Duyệt các phần tử trong mảng arr2 gán vao arr.
        for (int i = 0; i < arr2.length; i++){
            arr[arr1.length + i] = arr2[i];
        }
        System.out.println("Mảng mới là: " + Arrays.toString(arr));
    }
}
