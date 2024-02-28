import java.util.Arrays;

class DVDFilm extends DVD {
    private String[] pemeran;
    private String sutradara;

    public String[] getPemeran() {
        return pemeran;
    }

    public void setPemeran(String[] pemeran) {
        this.pemeran = pemeran;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public DVDFilm(String judul, String publisher, Kategori kategori, Integer stok, String[] pemeran, String sutradara) {
        super(judul, publisher, kategori, stok);
        this.pemeran = pemeran;
        this.sutradara = sutradara;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pemeran: " + Arrays.toString(pemeran));
        System.out.println("Sutradara: " + sutradara);
    }
}
