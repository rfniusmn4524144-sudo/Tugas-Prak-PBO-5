import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama penyewa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan lama sewa (jam): ");
        int lama = input.nextInt();

        System.out.println("=== DATA RENTAL PS ===");
        RentalPS4 rental = new RentalPS4(nama, lama);
        rental.tampilkanInfo();
        rental.tampilkanBonus();

        input.close();
    }
}