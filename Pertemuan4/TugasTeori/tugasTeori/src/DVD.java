enum Kategori {
    SU,
    D,
    R,
    A
}

public class DVD {
    private String judul;
    private String publisher;   
    private Kategori kategori;
    private Integer stok;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public DVD(String judul, String publisher, Kategori kategori, int stok) {
        this.judul = judul;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
    }
}
