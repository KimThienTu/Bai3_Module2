public class BT_DemKiTuTrongChuoi {
    public static void main(String[] args) {
        String str = "Hello, world!";
        char at = 'o';
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == at){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự '" + at + "' trong chuỗi '" + str + "' là: " + count);
    }
}
