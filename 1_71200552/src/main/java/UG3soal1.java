import java.util.Scanner;
public class UG3soal1 {
    public static void main(String[] args) {

        String nama, tanggal;
        int jumlah;
        float berat;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Data Product");

        System.out.println("Masukan data product makanan anda");
        System.out.print("Nama makanan: ");
        nama = keyboard.nextLine();

        System.out.print("Tanggal kadaluarsa: ");
        tanggal = keyboard.nextLine();

        System.out.print("jumlah(qty): ");
        jumlah = keyboard.nextInt();

        System.out.print("berat: ");
        berat = keyboard.nextInt();

        System.out.println("Data Product");
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Tanggal kadaluarsa: " + tanggal);
        System.out.println("jumlah qty: " + jumlah);
        System.out.println("Berat(g): " + berat + " " + "gram");


    }
}
