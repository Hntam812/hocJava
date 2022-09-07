package demobuoi4.model;

import javax.swing.plaf.PanelUI;

public class ThongTinCoBan {
    protected String hoTen;
    protected int tuoi;
    protected String gioiTinh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public ThongTinCoBan(){}

    public ThongTinCoBan(String hoTen, int tuoi, String gioiTinh){
        //this : đại diện cho class
        this.hoTen=hoTen;
        this.tuoi=tuoi;
        this.gioiTinh=gioiTinh;
    }
    public void ThoiGianDenTruong(String thoiGian){

    }
}
