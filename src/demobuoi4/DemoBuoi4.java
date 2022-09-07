package demobuoi4;
/**Tính đóng gói : 3 thuộc tính
public
private
protected : chỉ cho phép những class kế thừa gọi được
 **/
import demobuoi4.model.GiaoVien;

public class DemoBuoi4 {
    public static void main(String [] args){
        //debug bằng đầu : nhấn ctrl vào phương thức
        GiaoVien giaoVien = new GiaoVien( "Trần Mộng Dừa ", 55, "Nữ");
        System.out.println("Họ tên: "+giaoVien.getHoTen() +"\nTuổi: " +giaoVien.getTuoi());
    }
}
