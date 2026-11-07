import java.util.Scanner;

// 4. Inheritance: Class Main dipisahkan dari class lainnya
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PompaPertalite pompa1 = new PompaPertalite("PMP-01", 500.0);
        PompaPertamax pompa2 = new PompaPertamax("PMP-02", 300.0);

        // 9. Polimorfisme Interface: Pemanggilan method via variabel referensi interface
        Pelayanan layananPertamax = pompa2;
        layananPertamax.sapaPelanggan();
        System.out.println("----------------------------------");

        int pilihan = 0; // Inisialisasi awal

        do {
            System.out.println("Pilih jenis BBM:");
            System.out.println("1. Pertalite");
            System.out.println("2. Pertamax");
            System.out.print("Pilihan Anda (1/2): ");

            try {
                pilihan = input.nextInt(); // Mencoba membaca input angka

                if (pilihan != 1 && pilihan != 2) {
                    System.out.println("\n[ERROR] Pilihan tidak valid! Silakan masukkan angka 1 atau 2.\n");
                }
            } catch (java.util.InputMismatchException e) {
                // Menangkap error jika user memasukkan huruf/simbol
                System.out.println("\n[ERROR] Input harus berupa angka! Jangan masukkan teks/huruf.\n");

                // Menghapus teks yang ada di buffer Scanner
                input.nextLine();

                // Membuat input pilihan salah agar looping berlanjut
                pilihan = 0;
            }

        } while (pilihan != 1 && pilihan != 2);

        System.out.print("Berapa Rupiah Anda ingin mengisi bensin? Rp");
        double uang = input.nextDouble();

        if (pilihan == 1) {
            pompa1.tampilkanInfoPompa();
            double liter = pompa1.prosesIsiBensin(uang);
            if (liter > 0) {
                System.out.printf("\nBerhasil mengisi Pertalite sebanyak %.2f liter.\n", liter);
            }
        } else if (pilihan == 2) {
            pompa2.tampilkanInfoPompa();
            double liter = pompa2.prosesIsiBensin(uang);
            if (liter > 0) {
                // 9. Polimorfisme Interface untuk cetak struk
                Laporan laporanPertamax = pompa2;
                laporanPertamax.cetakStruk(uang, liter);
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}