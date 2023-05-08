import java.util.Scanner;

public class TH_TimGTLNTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số mảng");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Kích thước ko đc quá 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhập số " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Danh sách đã nhập: ");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max + " Tại vị trí " + index);
    }
}
