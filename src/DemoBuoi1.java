import java.util.Scanner;

public class DemoBuoi1 {
    public static void main(String[] args) {
//        //code dc viet o day
//        //xuat gia tri ra man hinh
//        System.out.println("Hello Java 19"); //in xong xuong dong
//        System.out.println("Hello Be Lu");
//        System.out.println("Hello world");
//        System.out.println("   J    a   v     v   a");
//        System.out.println("   J   a a   v   v   a a");
//        System.out.println("J  J  aaaaa   V V   aaaaa");
//        System.out.println(" JJ  a     a   V   a     a");
//
//        //Cú pháp khai báo biến
//        //Kiểu dữ liệu_tên biến = giá trị
//        byte soA = 1;
//        byte soB = 1;
//        int ketQua = soA + soB;
//        //byte ketQua = (byte)(soA+soB); //ép kiểu
//        System.out.println("Kết quả toán cộng : " + ketQua); //dấu + là nối chuổi
//
//        //Kiểu Char: chỉ được phép lưu 1 ký tự
//        char kyTu = 'C';
//        //Kiểu dữ liệu tham chiếu
//        String kieuString = "Hello World";
//        System.out.println("Kết quả toán cộng : " + kieuString);
//
//        boolean isSuccess = true;
//        //Câu điều kiện If(Nếu)
//        //toán tử so sánh : == > < <= >= !=
//        if (ketQua == 20) {
//            System.out.println("Thành công");
//        } else {
//            System.out.println("Rớt Luận văn");
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vui lòng nhập giá trị ");
//        String inputData = scanner.nextLine();
//        System.out.println("Hello "+ inputData);

        //Viết chương trình nhập vào hai số. Thực hiện phép toán cộng
        //Xuất kết quả ra màn hình
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vui lòng nhập a ");
//        int a = scanner.nextInt();
//        System.out.println("Vui lòng nhập b ");
//        int b = scanner.nextInt();
//        int tong = a+b;
//        System.out.println("Tong "+ tong);

        //Viết chương trình tính điểm trung bình(lấy giá trị nhập vào)
        System.out.println("=======Chương trình tính điểm trung bình=======");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập điểm hs :  ".toUpperCase());
        double diem = scanner.nextDouble();
        if ((diem >= 0) && (diem <= 10)){
            if ((diem >= 9) && (diem <= 10)) {
                System.out.println("Hs giỏi");
            } else if ((diem >= 8) && (diem < 9)) {
                System.out.println("Hs Khá");
            } else if ((diem >= 7) && (diem < 8)) {
                System.out.println("Hs tiên tiến");
            } else if ((diem >= 5) && (diem < 7)){
                System.out.println("Hs trung bình");
            }else{
                System.out.println("Hs kém");
            }
        } else {
            System.out.println("Vắng thi");
        }
    }
}
/*
BUỔI 2
 */
