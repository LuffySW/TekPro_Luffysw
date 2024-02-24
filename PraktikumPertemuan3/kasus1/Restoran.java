package PraktikumPertemuan3.kasus1;

public class Restoran {
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;

    private static byte id= 0;

    Restoran() {
        namaMakanan = new String[15];
        hargaMakanan = new double[10];
        stok = new int[10];

        defaultMenu();
    }

    private void defaultMenu(){
        tambahMenuMakanan("Bala-Bala", 1000, 20);
        nextId();
        tambahMenuMakanan("gehu", 1000, 20);
        Restoran.nextId();
        tambahMenuMakanan("tahu", 1000, 0);
        Restoran.nextId();
        tambahMenuMakanan("molen", 1000, 20);
        Restoran.nextId();
    }

    private void tambahMenuMakanan(String nama,double harga,int stok){
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
    }

    void tampilMenuMakanan(){
        for (int i =0 ; i<id;i++) {
            if(!ifOutOfStock(i)){
                System.out.println(namaMakanan[i] +"["+stok[i]+"]"+"\tRp. "+hargaMakanan[i]);
            }else{
                System.out.println(namaMakanan[i] +"["+stok[i]+"]"+"\t\tRp. "+hargaMakanan[i]); //menambah list item dengan stok 0
            }
        }
    }


    boolean ifOutOfStock(int id) {
        return stok[id] < 1;
    }

    static void nextId(){
        id++;
    }

    public void pesanMakanan(int index, int jumlah) {
        int noProduk = index-1;
        if (noProduk > 0 && noProduk < id && stok[noProduk] >= jumlah) {
            stok[noProduk] -= jumlah;
            System.out.println("Pesanan berhasil diproses!");
        } else {
            System.out.println("Pesanan tidak dapat diproses. Stok tidak mencukupi.");
        }
    }
}
