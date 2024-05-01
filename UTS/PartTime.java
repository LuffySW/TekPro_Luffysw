import javax.swing.text.Position;

public class PartTime extends Employee {
    private double hourlyRate; // Tarif per jam untuk karyawan paruh waktu
    private int hoursWorked; // Total jam kerja untuk karyawan paruh waktu
    private int overtimeHours; // Total jam lembur untuk karyawan paruh waktu

    public PartTime(String name, String address, String phoneNumber,  String Position,double hourlyRate, int hoursWorked, int overtimeHours) {
        super(name, address, phoneNumber, Position); // Gaji pokok untuk semua karyawan
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeHours = overtimeHours;
    }

    // Method untuk mengatur tarif per jam
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Method untuk mengatur total jam kerja
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Method untuk mengatur total jam lembur
    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    // Method untuk menghitung gaji total untuk karyawan paruh waktu
    @Override
    public double getBaseSalary() {
        return super.getBaseSalary() + calculateOvertimeAllowance(); // Gaji pokok + Tunjangan lembur
    }

    // Method untuk menghitung tunjangan lembur
    private double calculateOvertimeAllowance() {
        double overtimeRate = 30000; // Tarif lembur per jam
        return overtimeHours * overtimeRate; // Tunjangan lembur
    }
}
