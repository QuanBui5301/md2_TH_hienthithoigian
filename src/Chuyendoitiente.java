import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tylechuyendoi = 23000;
        System.out.println("Nhap vao so tien can chuyen doi: ");
        float tien = input.nextFloat();
        float tienViet = tien*tylechuyendoi;
        System.out.println("Menh gia tien sau chuyen doi: " + tienViet + "dong");
    }
}
