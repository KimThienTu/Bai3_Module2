import java.util.Scanner;

public class TH_TimGTTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(input_name)){
                System.out.println("Vị trí của sinh viên là: " + input_name + " là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Không thấy " + input_name + "trong danh sách");
        }
    }
}
