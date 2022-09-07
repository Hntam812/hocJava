import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demoBuoi2 {
    public static void main(String[] args){
//        System.out.println("Starting with Lou");
//        int[] arrayInt = {1, 3, 10, 5, 6};
//        System.out.println("Gía trị của mảng : " +arrayInt[2]+ "-" +arrayInt[4]); //index=0 : số 1
//        System.out.println("Tong phan tu trong mang : " +arrayInt.length);
        //vị trí max của mảng = length-1
//        int[] arrayInt= new int[3];
//        arrayInt[0]=15;
//        arrayInt[1]=3;
//        arrayInt[2]=8;
//        System.out.println("Gía trị của mảng : " +arrayInt[1]);
//        System.out.println("Tong phan tu trong mang : " +arrayInt.length);
//          List<String> list = new ArrayList<>(); //DATA ĐƯỢC ADD ĐỘNG VÀO
//          list.add("Hello");
//          list.add("CyberSoft");
//          list.add("Java 19");
//          System.out.println("Gía trị của mảng : " +list.get(0));
//          System.out.println("Tong phan tu trong mang : " +list.size());
//
//          int count= 0;
//          count++;
//          int result=count;
//          System.out.println(result);
//          /*
//          for(điểm bắt đầu; điều kiện dừng;tăng kiểu chạy lên 1 đv)
//           */
//          for(int i=0;i< list.size();i++){
//              System.out.println("Con bé lu vị trí :" +list.get(i));
//          }

          //Viết 1 chương trình nhập vào số tự nhiên N và tnh tổng  từ 1 đến N
//          System.out.println("Nhập vào STN :");
//          Scanner scanner = new Scanner(System.in);
//          int N = scanner.nextInt();
//          do{
//              System.out.println("Nhập lại STN(phải nhập số nguyên dương khác 0) :");
//              N = scanner.nextInt();
//          }while(N>0);
//
//              int tong = 0;
//              for (int i = 1; i <= N; i++) {
//                  tong = tong + i;
//              }
//              System.out.println("Tong tu 1 den " + N + " la " + tong);
          //Tạo ra một chương trình nhập 5 số tự nhiên và sắp xếp theo thứ tự tăng dần.
        System.out.println("Nhap vao 5 so tu nhien :");
        Scanner scanner = new Scanner(System.in);
        int[] A= new int[5];
        for(int i=0;i<5;i++){
            A[i]= scanner.nextInt();
        }
        int temp=A[0];
        for(int i=0;i<A.length;i++){
            for (int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    //HOÁN VỊ
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }

        }
//        for(int i = 0;i<A.length;i++){
//            System.out.println(A[i]);
//        }
        for (int data:A) {
            System.out.println(+data);
        }

    }
}
