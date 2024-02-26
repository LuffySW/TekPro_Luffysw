package PraktikumPertemuan3.kasus2;

import java.util.ArrayList;
import java.util.List;

public class sistemPembelian {
    private List<Produk> produk = new ArrayList<>();
    private List<Penjualan> penjualan = new ArrayList<>();

    public sistemPembelian(){
        defaultProduct();
    }

    private void defaultProduct() {
        produk.add(new Produk("Nasi Goreng", 15000, 10));
        produk.add(new Produk("Mie Goreng", 12000, 15));
        produk.add(new Produk("Ayam Goreng", 20000, 8));
        produk.add(new Produk("Soto Ayam", 18000, 12));
        produk.add(new Produk("Capcay", 17000, 10));
        produk.add(new Produk("Bakso", 15000, 20));
        produk.add(new Produk("Gado-gado", 16000, 15));
        produk.add(new Produk("Sate Ayam", 25000, 10));
        produk.add(new Produk("Nasi Uduk", 13000, 12));
        produk.add(new Produk("Martabak", 18000, 10));
    }
    
    public List<Produk> getProduk(){
        return produk;
    }

    public List<Penjualan> getPenjualans(){
        return penjualan;
    }
}
