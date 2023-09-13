import java.util.Scanner;

public class Tinhdiemtb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao diem Toan: ");
        float toan = input.nextFloat();
        System.out.println("Nhap vao diem Ly: ");
        float ly = input.nextFloat();
        System.out.println("Nhap vao diem Hoa: ");
        float hoa = input.nextFloat();
        float dtb = (toan + ly + hoa)/3;
        System.out.println("Diem trung binh: "+ dtb);
    }
}
