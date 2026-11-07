# Sistem SPBU - Responsi Akhir Pemrograman Berorientasi Objek (PBO)

Repositori ini berisi implementasi sistem **SPBU** berbasis bahasa pemrograman Java untuk memenuhi tugas Responsi Akhir Praktikum Pemrograman Berorientasi Objek.

## 👤 Identitas Mahasiswa
* **Nama:** Angga Farzuqni Rokhman
* **NIM:** H1D025083
* **Tema Sistem:** SPBU

---

## Petunjuk Compile dan Run (Terminal)

Program ini tidak memerlukan *library* eksternal dan dapat dijalankan langsung melalui terminal atau *command prompt*.

1. **Buka Terminal/Command Prompt**
   Arahkan ke direktori (folder) tempat file `.java` disimpan.
   ```bash
   cd path/to/folder/project
   ```

2. **Kompilasi Kode Program**
   Compile seluruh file Java di dalam folder tersebut dengan perintah berikut:
   ```bash
   javac *.java
   ```

3. **Jalankan Program**
   Eksekusi class `Main` untuk memulai program:
   ```bash
   java Main
   ```

---

## Implementasi Persyaratan Teknis PBO

Sistem ini telah mengimplementasikan 10 persyaratan teknis utama PBO dalam domain yang kohesif:

1. **State dan Behavior:** Memiliki atribut, method prosedur (seperti `tampilkanInfoPompa()`), dan method fungsi (seperti `prosesIsiBensin()`).
2. **Immutability:** Terdapat konstanta global `NAMA_SPBU` dan atribut instans kekal `kodePompa` dengan keyword `final`.
3. **Enkapsulasi dan Overloading:** Seluruh atribut bersifat `private` dengan setter/getter. Terdapat dua konstruktor *overloaded* pada class abstrak.
4. **Inheritance:** Class `PompaBensin` mewariskan sifatnya ke dua subclass: `PompaPertalite` dan `PompaPertamax`. Class `Main` dipisah.
5. **Super Chaining:** Pemanggilan `super(...)` pada konstruktor subclass dan pemanggilan `super.tampilkanInfoPompa()`.
6. **Method Overriding:** Subclass menimpa method superclass menggunakan anotasi `@Override`.
7. **Abstract Class:** `PompaBensin` adalah kelas abstrak yang memiliki *abstract method* `prosesIsiBensin(double nominalUang)`.
8. **Logika State Percabangan:** Terdapat logika `if/else` pada metode pengisian bensin yang mengubah *state* stok BBM.
9. **Polimorfisme Interface:** Pemanggilan objek dilakukan melalui tipe referensi interface (misal: `Pelayanan layanan = pompa2;`).
10. **Multiple Interface:** Class `PompaPertamax` mengimplementasikan dua interface sekaligus (`implements Pelayanan, Laporan`).

---

## 📸 Screenshot Luaran Program

## Screenshot Luaran Program

## Screenshot Luaran Program

### 1. Tampilan Menu Awal
![Menu Awal](Images/Menu_Awal.png)
*Penjelasan: Tampilan awal saat program dijalankan. Sistem menyapa pengguna ("Selamat datang di SPBU PERTAMINA RACING CORPORATION, Semoga bisa memenuhi keinginan Anda") dan langsung menyuguhkan opsi bensin yang tersedia (Pertalite dan Pertamax).*

### 2. Pengisian Pertalite (Subsidi)
![Output Pertalite](Images/Output1.png)
*Penjelasan: Luaran ketika pengguna memilih Pertalite. Sistem menampilkan detail BBM subsidi (RON 90, wajib scan QR), harga per liter (Rp10.000), serta menghitung jumlah bensin yang berhasil diisi berdasarkan uang yang diberikan (Rp90.000 menghasilkan 9.00 Liter).*

### 3. Pengisian Pertamax (Non-Subsidi) & Cetak Struk
![Output Pertamax](Images/Output2.png)
*Penjelasan: Luaran ketika pengguna memilih Pertamax. Sesuai dengan spesifikasi program, transaksi non-subsidi (RON 92) ini otomatis memanggil metode `cetakStruk()` dari interface `Laporan` untuk mencetak struk fisik transaksi secara rinci, termasuk kalkulasi liter (5,64 Liter) dan sisa stok tangki pompa yang berkurang secara dinamis (294,36 Liter).*
