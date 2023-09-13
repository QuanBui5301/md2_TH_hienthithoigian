import java.util.ArrayList;
import java.util.Scanner;

public class TimGTLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Nhap vao so phan tu: ");
        int n = input.nextInt();
        for (int i = 0; i<n; i++) {
            System.out.println("Nhap vao so thu " + (i+1) + ": ");
            a.add(i, input.nextInt());
        }
        int max = 0;
        for (int i = 0; i<n; i++) {
            if (a.get(i)>max) {
                max = a.get(i);
            }
        }
        System.out.println("So lon nhat la: " + max);
    }
}
