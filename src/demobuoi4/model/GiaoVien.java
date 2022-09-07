package demobuoi4.model;

public class GiaoVien extends ThongTinCoBan {
    String mcb;

    String mon;

    //Phương thức khởi tạo ra GiaoVien
    public GiaoVien(String hoTen, int tuoi, String gioiTinh){
        super(hoTen,tuoi,gioiTinh); //Kích hoạt phương thức khởi tạo ThongTinCoBan(hoTen,tuoi,gioiTinh) : đại diện class cha mà chúng ta đang kế thừa
    }
    public void TienLuong(){

    }
}
