public class DVDMusik extends DVD {
    private String penyanyi;
    private String produser;
    private String[] topHits;

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public String getProduser() {
        return produser;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public String[] getTopHits() {
        return topHits;
    }

    public void setTopHits(String[] topHits) {
        this.topHits = topHits;
    }

    public DVDMusik(String judul, String publisher, Kategori kategori, int stok, String penyanyi, String produser, String[] topHits) {
        super(judul, publisher, kategori, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Penyanyi: " + penyanyi);
        System.out.println("Produser: " + produser);
        System.out.println("Top Hits: " + String.join(", ", topHits));
    }
}
