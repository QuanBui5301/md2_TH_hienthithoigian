import java.util.Scanner;

public class XephangSV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao diem so sinh vien: ");
        int diem = input.nextInt();
        System.out.println("Sinh vien xep hang: " + xephang(diem));
    }
    public static String xephang(int diem) {
        if (diem > 75) {
            return "A";
        }
        if (diem>=60 && diem<75) {
            return "B";
        }
        if (diem>=45 && diem<60) {
            return "C";
        }
        if (diem>=35 && diem<45) {
            return "D";
        }
        if (diem<35) {
            return "E";
        }
        else return "E";
    }
}
