public class BT_TimPTLNTrongMang2Chieu {
    public static void main(String[] args) {
        // Tạo 1 ma trận có sẵn các phần tử.
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        // Khai báo biến để chứa giá trị lớn nhất.
        int max = arr[0][0];

        // Khai báo biến để chứa tọa độ của phần tử lớn nhất.
        int row = 0;
        int col = 0;

        // Duyệt qua các phần tử của ma trận và tìm phâ tử lớn nhất.
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất của ma trận là: " + max + " tại tạo độ (" + row + "," + col + ")");
    }
}







