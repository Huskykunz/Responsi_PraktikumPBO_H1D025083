// 4 & 10. Inheritance & Multiple Interface: implements dua interface sekaligus
public class PompaPertamax extends PompaBensin implements Pelayanan, Laporan {

    public PompaPertamax(String kodePompa, double sisaStokLiter) {
        super(kodePompa, "Pertamax", 15950.0, sisaStokLiter);
    }

    @Override
    public void tampilkanInfoPompa() {
        super.tampilkanInfoPompa();
        System.out.println("Keterangan: BBM Non-Subsidi dengan RON 92");
    }

    @Override
    public double prosesIsiBensin(double nominalUang) {
        double literDidapat = nominalUang / getHargaPerLiter();

        if (literDidapat <= getSisaStokLiter()) {
            setSisaStokLiter(getSisaStokLiter() - literDidapat);
            return literDidapat;
        } else {
            System.out.println("Maaf, stok Pertamax tidak mencukupi.");
            return 0.0;
        }
    }

    @Override
    public void sapaPelanggan() {
        System.out.println("Selamat datang di " + NAMA_SPBU + ", Semoga bisa memenuhi keinginan Anda");
    }

    @Override
    public void cetakStruk(double nominalUang, double liter) {
        System.out.println("\n==================================");
        System.out.println("           STRUK SPBU             ");
        System.out.println("==================================");
        System.out.println("Pompa       : " + getKodePompa());
        System.out.println("BBM         : " + getJenisBBM());
        System.out.println("Nominal     : Rp" + nominalUang);
        System.out.printf("Total Liter : %.2f Liter\n", liter);
        System.out.printf("Sisa Stok   : %.2f Liter\n", getSisaStokLiter());
        System.out.println("==================================\n");
    }
}