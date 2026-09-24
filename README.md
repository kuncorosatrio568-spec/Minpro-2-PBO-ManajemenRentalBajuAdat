# Minpro-2-PBO-SystemRentalBajuAdat

## Deskripsi Singkat Program
Program ini merupakan Sistem Manajemen Rental Baju Adat Tradisional berbasis CLI (Command Line Interface) yang dibangun menggunakan bahasa pemograman Java. Program ini mengelola data baju adat (Create, Read, Update, Delete) dengan menerapkan konsep Pemrograman Berbasis Objek (PBO) secara terstruktur.

## Penjelasan Alur Program
1. **Inisialisasi**  Program dijalankan melalui Main.java yang menginisialisasi controller dan view. Data dummy awal secara otomatis dimuat ke dalam ArrayList.
2. **Menu Utama**        : Pengguna disajikan pilihan menu (1-5) untuk melakukan aksi:
   - **Create (1)**      : Menambahkan baju adat baru dengan memilih kategori (Anak-anak / Dewasa).
   - **Read (2)**        : Menampilkan seluruh daftar baju adat beserta atribut spesifiknya.
   - **Update (3)**      : Memperbarui data nama, asal daerah, atau harga berdasarkan ID baju.
   - **Delete (4)**      : Menghapus data baju berdasarkan ID.
   - **Exit (5)**: Menghentikan perulangan dan keluar dari program.
3. **Validasi Input**    : Setiap input angka maupun double diverifikasi terlebih dahulu untuk mencegah *runtime crash* saat user memasukkan karakter yang tidak sesuai.

## Penjelasan Penerapan Encapsulation dan Inheritance
- **Encapsulation**  : 
  Setiap atribut pada kelas model (BajuAdat, BajuAnak, BajuDewasa) diatur menggunakan access modifier. Akses baca dan tulis data dilakukan melalui metode getter dan setter (getIdBaju, setHargaSewa, dsb).
- **Inheritance**    : 
  - **Superclass**   : BajuAdat memuat atribut umum seperti idBaju, namaBaju, asalDaerah, dan hargaSewa.
  - **Subclass**     : 
    1. BajuAnak mewarisi BajuAdat dan menambah atribut rentangUsia.
    2. BajuDewasa  mewarisi BajuAdat dan menambah atribut ukuran).

## Penjelasan Letak Penerapan Nilai Tambah
1. **Struktur MVC (Model-View-Controller)**:
   - rentalbaju.model berisi kelas entitas data (BajuAdat, BajuAnak, BajuDewasa).
   - rentalbaju.controller berisi BajuController yang menangani logika manipulasi data dan penyimpanan ArrayList.
   - rentalbaju.view berisi BajuView yang menangani tampilan menu, interaksi CLI, dan input/output.
2. **Polymorphism (Method Overriding)**:
   - Terletak pada method getInfo() yang dipanggil pada objek kelas parent BajuAdat. Metode ini digunakan untuk menampilkan detail spesifik dari masing-masing jenis baju secara dinamis.
