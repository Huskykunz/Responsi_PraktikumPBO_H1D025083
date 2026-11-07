public abstract class PompaBensin {
    // 2. Immutability: Konstanta global/publik
    public static final String NAMA_SPBU = "SPBU PERTAMINA RACING CORPORATION";

    // 2. Immutability: Atribut final
    private final String kodePompa;

    // 3. Enkapsulasi: Semua atribut private
    private String jenisBBM;
    private double hargaPerLiter;
    private double sisaStokLiter;

    // 3. Overloading: Konstruktor 1
    public PompaBensin(String kodePompa, String jenisBBM, double hargaPerLiter) {
        this.kodePompa = kodePompa;
        this.jenisBBM = jenisBBM;
        this.hargaPerLiter = hargaPerLiter;
        this.sisaStokLiter = 1000.0; // Default stok
    }

    // 3. Overloading: Konstruktor 2
    public PompaBensin(String kodePompa, String jenisBBM, double hargaPerLiter, double sisaStokLiter) {
        this.kodePompa = kodePompa;
        this.jenisBBM = jenisBBM;
        this.hargaPerLiter = hargaPerLiter;
        this.sisaStokLiter = sisaStokLiter;
    }

    // 3. Enkapsulasi: Getter dan Setter dengan keyword this
    public String getKodePompa() {
        return this.kodePompa; }

    public String getJenisBBM() {
        return this.jenisBBM; }

    public void setJenisBBM(String jenisBBM) {
        this.jenisBBM = jenisBBM; }

    public double getHargaPerLiter() {
        return this.hargaPerLiter; }

    public void setHargaPerLiter(double hargaPerLiter) {
        this.hargaPerLiter = hargaPerLiter; }

    public double getSisaStokLiter() {
        return this.sisaStokLiter; }

    public void setSisaStokLiter(double sisaStokLiter) {
        this.sisaStokLiter = sisaStokLiter; }

    // 1. State dan Behavior: Method prosedur (void)
    public void tampilkanInfoPompa() {
        System.out.println("Tipe BBM: " + this.jenisBBM + " | Harga: Rp" + this.hargaPerLiter + "/liter");
    }

    // 7. Abstract Class: Minimal satu abstract method
    public abstract double prosesIsiBensin(double nominalUang);
}