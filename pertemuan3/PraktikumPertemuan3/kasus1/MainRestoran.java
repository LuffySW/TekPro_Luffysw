package PraktikumPertemuan3.kasus1;

import java.util.Scanner;

public class MainRestoran{
    public static void main(String[] args) {
        
        
        Restoran menu = new Restoran();
        menu.tampilMenuMakanan();

        // Membuat scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // // Meminta input pengguna untuk memesan makanan
        System.out.println("\nMasukkan nomor produk yang ingin dipesan:");
        int nomorProduk = scanner.nextInt();
        System.out.println("Masukkan jumlah yang ingin dipesan:");
        int jumlahPesanan = scanner.nextInt();

        menu.pesanMakanan(nomorProduk, jumlahPesanan);

        menu.tampilMenuMakanan();

        scanner.close();
    }
}