public class Main {
    public static void main(String[] args) {
        // Membuat objek karyawan Asep (sebagai staf programmer yang sudah bekerja 3 tahun)
        Fulltime asep = new Fulltime("Asep", "Jalan ABC No. 123", "081234567890", "staf programmer");
        asep.setNumberOfChildren(2); // Asep memiliki 2 anak
        asep.setOvertimeHours(3); // Asep sudah bekerja selama 3 tahun
        double asepLoanAmount = 500000; // Pinjaman koperasi Asep

        // Membuat objek karyawan Ujang (sebagai karyawan paruh waktu)
        PartTime ujang = new PartTime("Ujang", "Jalan XYZ No. 456", "089876543210", "staf programmer",0, 30000, 0);
 
        ujang.setOvertimeHours(5); // Ujang lembur selama 5 jam

        // Menghitung gaji Asep dan Ujang di bulan April
        double totalSalaryAsep = calculateTotalSalaryAprilAsep  (asep, asepLoanAmount);
        double totalSalaryUjang = calculateTotalSalaryApril(ujang); // Ujang tidak memiliki pinjaman koperasi

        // Menampilkan total gaji Asep dan Ujang di bulan April
        System.out.println("Total Gaji Asep di bulan April: Rp " + totalSalaryAsep);
        System.out.println("Total Gaji Ujang di bulan April: Rp " + totalSalaryUjang);
    }

    // Method untuk menghitung total gaji karyawan di bulan April
    private static double calculateTotalSalaryAprilAsep(Fulltime fulltime, double loanAmount) {
        double totalSalary = fulltime.getBaseSalary(); // Gaji pokok
        totalSalary += fulltime.calculatePositionAllowance(); // Tunjangan jabatan
        totalSalary += fulltime.calculateCommunicationAllowance(); // Tunjangan komunikasi
        totalSalary += fulltime.calculateOvertimeAllowance(); // Tunjangan lembur
        totalSalary += fulltime.calculateChildAllowance(); // Tunjangan anak
        totalSalary -= loanAmount; // Potongan pinjaman koperasi
        return totalSalary;
    }

    private static double calculateTotalSalaryApril(PartTime partTime) {
        return partTime.getBaseSalary(); // Gaji part-time tidak memperhitungkan tunjangan lainnya
    }
}
