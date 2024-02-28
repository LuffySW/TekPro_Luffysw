import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Membuat objek DVDFilm
        String[] pemeranFilm = {"Pemeran 1", "Pemeran 2"};
        DVDFilm film = new DVDFilm("judul film", "publisher film", Kategori.D, 10, pemeranFilm, "Sutradara");
        // Membuat objek DVDMusik
        String[] topHitsMusik = {"Lagu 1", "Lagu 2", "Lagu 3"};
        DVDMusik musik = new DVDMusik("Judul Album", "Publisher Musik", Kategori.R, 15, "Penyanyi", "Produser", topHitsMusik);

        // Menampilkan informasi DVD Film
        System.out.println("Informasi DVD Film:");
        film.displayInfo();
        System.out.println();
        
        // Menampilkan informasi DVD Musik
        System.out.println("Informasi DVD Musik:");
        musik.displayInfo();
    }
}
