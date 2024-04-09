import java.util.Scanner;

public class LuasBangunDatar {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama, nim;
        int pilihan;
        double luas;

        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        nim = scanner.nextLine();

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi panjang");
        System.out.println("2. Segitiga");
        System.out.print("Masukkan pilihan (1-2): ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1: // persegi panjang
                double panjang, lebar;
                System.out.print("Masukkan panjang:");
                panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                lebar = scanner.nextDouble();
                luas = panjang * lebar;
                break;

            case 2: // segitiga
                double alas, tinggi;
                System.out.println("Masukkan alas: ");
                alas = scanner.nextDouble();
                System.out.println("Masukkan tinggi: ");
                tinggi = scanner.nextDouble();
                luas = 0.5 * alas * tinggi;
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                return;

        }

        System.out.println("\nhasil:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Luas: " + luas);

        scanner.close();

    }
}
