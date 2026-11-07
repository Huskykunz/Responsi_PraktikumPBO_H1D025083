// 4. Inheritance: Subclass melalui extends
public class PompaPertalite extends PompaBensin {

    public PompaPertalite(String kodePompa, double sisaStokLiter) {
        // 5. Super Chaining: Pemanggilan super(...)
        super(kodePompa, "Pertalite", 10000.0, sisaStokLiter);
    }

    // 6. Method Overriding: Timpa method menggunakan @Override (Belajar jadi penimpa handal)
    @Override
    public void tampilkanInfoPompa() {
        // 5. Super Chaining: Pemanggilan super.namaMethod()
        super.tampilkanInfoPompa();
        System.out.println("Keterangan: BBM Bersubsidi RON 90 (Wajib scan QR)");
    }

    @Override
    public double prosesIsiBensin(double nominalUang) {
        // 1. State dan Behavior: Method fungsi return value
        double literDidapat = nominalUang / getHargaPerLiter();

        // 8. Logika State Percabangan: Membaca dan mengubah state internal
        if (literDidapat <= getSisaStokLiter()) {
            setSisaStokLiter(getSisaStokLiter() - literDidapat);
            return literDidapat;
        } else {
            System.out.println("Maaf, stok Pertalite tidak mencukupi untuk nominal tersebut.");
            return 0.0;
        }
    }
}