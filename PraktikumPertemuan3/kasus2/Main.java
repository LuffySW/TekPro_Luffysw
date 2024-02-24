package PraktikumPertemuan3.kasus2;

import java.util.Scanner;

public class Main {
    private static sistemPembelian sistembeli = new sistemPembelian();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String konfirmasi;
        System.out.println("Menu Makanan:");
        System.out.println("No\tNama Produk\tHarga\tStok");

        int index = 1;

        for (Produk produk : sistembeli.getProduk()) {
            System.out.println(index+ "\t" +produk.getNamaProduk() + "\t\tRp. " + produk.getHarga() + "\t" + produk.getStok());
            index++;
        }

        do{
        System.out.println("\nMasukkan pemesanan Anda :");
            System.out.println("\nMasukan Nomor urutan Produk");
            int nomorProduk = input.nextInt();
            System.out.println("\nMasukan Jumlah Produk yang dipesan");
            int quantity = input.nextInt();

            System. out. print("\033[H\033[2J");
            System. out. flush();    
        // Ambil produk berdasarkan nomor
        Produk produkDipesan = sistembeli.getProduk().get(nomorProduk - 1);

        if (produkDipesan == null) {
            System.out.println("Produk tidak ditemukan.");
        } else {
            // Tambahkan penjualan
            Penjualan penjualan = new Penjualan(produkDipesan, quantity);
            sistembeli.getPenjualans().add(penjualan);

            // Tampilkan pesanan dan total bayar
            System.out.println("\nPesanan Anda:");
            System.out.println("Nama Produk\tQuantity\tTotal Bayar");
            System.out.println(penjualan);
        }

        // Konfirmasi pemesanan lain
        System.out.println("\nApakah Anda ingin memesan item makanan lain? (ya/tidak)");
        konfirmasi = input.next();
        input.nextLine();
        }while( "ya".equals(konfirmasi)|| "Ya".equals(konfirmasi) || "YA".equals(konfirmasi));
        System. out. print("\033[H\033[2J");
        System. out. flush();
        System.out.println("\nTerima kasih! Selamat menikmati makanan Anda.");
        
         
        input.close();
    }
}
