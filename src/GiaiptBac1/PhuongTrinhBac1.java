package GiaiptBac1;

public class PhuongTrinhBac1 {
    float heSoThu1;
    float heSoThu2;
    void solution () {
        if ( heSoThu1 == 0)
            if (heSoThu2 ==0)
                System.out.println("Phuong trinh co vo so nghiem");
            else System.out.println("Phuong trinh vo nghiem");
        else System.out.println("Phuong trinh co nghiem la: " + -heSoThu2/heSoThu1);
    }
}
