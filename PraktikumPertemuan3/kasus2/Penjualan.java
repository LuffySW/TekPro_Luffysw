package PraktikumPertemuan3.kasus2;

public class Penjualan {
    private Produk produk;
    private int jumlah;

    public Penjualan(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public double hitungTotalBayar() {
        return produk.getHarga() * jumlah;
    }

    public String toString() {
        return produk.getNamaProduk() + "\t" + jumlah + "\t\tRp. " + hitungTotalBayar();
    }
}
