package rentalbaju.view;

import java.util.Scanner;
import rentalbaju.controller.BajuController;
import rentalbaju.model.BajuAdat;
import rentalbaju.model.BajuAnak;
import rentalbaju.model.BajuDewasa;

public class BajuView {
    private BajuController controller;
    private Scanner scanner;

    public BajuView(BajuController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        boolean running = true;
        while (running) {
            System.out.println("\n=========================================");
            System.out.println(" SYSTEM RENTAL BAJU ADAT TRADISIONAL ");
            System.out.println("=========================================");
            System.out.println("1. Tambah Data Baju Adat (Create)");
            System.out.println("2. Tampilkan Daftar Baju Adat (Read)");
            System.out.println("3. Ubah Data Baju Adat (Update)");
            System.out.println("4. Hapus Data Baju Adat (Delete)");
            System.out.println("5. Keluar Program");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = validasiInputAngka();
            switch (pilihan) {
                case 1 -> menuTambah();
                case 2 -> menuTampil();
                case 3 -> menuUbah();
                case 4 -> menuHapus();
                case 5 -> {
                    running = false;
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                }
                default -> System.out.println("Pilihan menu tidak valid!");
            }
        }
    }

    private void menuTambah() {
        System.out.println("\n--- Tambah Baju Adat ---");
        System.out.print("Pilih Kategori (1. Anak-anak / 2. Dewasa): ");
        int kat = validasiInputAngka();

        System.out.print("Masukkan ID Baju: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Baju: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Asal Daerah: ");
        String asal = scanner.nextLine();
        System.out.print("Masukkan Harga Sewa / Hari: ");
        double harga = validasiInputDouble();

        if (kat == 1) {
            System.out.print("Masukkan Rentang Usia (misal: 5-8 Tahun): ");
            String usia = scanner.nextLine();
            controller.tambahBaju(new BajuAnak(id, nama, asal, harga, usia));
        } else {
            System.out.print("Masukkan Ukuran (S/M/L/XL): ");
            String ukuran = scanner.nextLine();
            controller.tambahBaju(new BajuDewasa(id, nama, asal, harga, ukuran));
        }
        System.out.println("Data Baju Adat berhasil ditambahkan!");
    }

    private void menuTampil() {
        System.out.println("\n--- Daftar Baju Adat Tradisional ---");
        if (controller.getAllBaju().isEmpty()) {
            System.out.println("Belum ada data baju adat.");
        } else {
            int no = 1;
            for (BajuAdat b : controller.getAllBaju()) {
                System.out.println(no++ + ". " + b.getInfo());
            }
        }
    }

    private void menuUbah() {
        menuTampil();
        if (controller.getAllBaju().isEmpty()) return;
        System.out.print("\nMasukkan ID Baju yang ingin diubah: ");
        String id = scanner.nextLine();
        BajuAdat b = controller.cariBaju(id);

        if (b != null) {
            System.out.print("Masukkan Nama Baju Baru: ");
            b.setNamaBaju(scanner.nextLine());
            System.out.print("Masukkan Asal Daerah Baru: ");
            b.setAsalDaerah(scanner.nextLine());
            System.out.print("Masukkan Harga Sewa Baru: ");
            b.setHargaSewa(validasiInputDouble());
            System.out.println("Data Baju Adat berhasil diubah!");
        } else {
            System.out.println("Data dengan ID tersebut tidak ditemukan!");
        }
    }

    private void menuHapus() {
        menuTampil();
        if (controller.getAllBaju().isEmpty()) return;
        System.out.print("\nMasukkan ID Baju yang ingin dihapus: ");
        String id = scanner.nextLine();
        if (controller.hapusBaju(id)) {
            System.out.println("Data Baju Adat berhasil dihapus!");
        } else {
            System.out.println("Data dengan ID tersebut tidak ditemukan!");
        }
    }

    private int validasiInputAngka() {
        while (!scanner.hasNextInt()) {
            System.out.println("Input salah! Harap masukkan angka.");
            scanner.next();
            System.out.print("Coba lagi: ");
        }
        int val = scanner.nextInt();
        scanner.nextLine();
        return val;
    }

    private double validasiInputDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Input salah! Harap masukkan angka harga yang benar.");
            scanner.next();
            System.out.print("Coba lagi: ");
        }
        double val = scanner.nextDouble();
        scanner.nextLine();
        return val;
    }
}