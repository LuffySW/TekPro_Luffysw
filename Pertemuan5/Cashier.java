
    public class Cashier extends AbstractStoreEmployee {
        private int numberOfTransactions; // Jumlah transaksi yang telah dilakukan oleh kasir

        // Constructor
        public Cashier(double numberOfHoursWorked, double hourlyRate, String storeDetails, double basePay, String employeeName) {
            super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
            this.numberOfTransactions = 0; // Pada awalnya, belum ada transaksi yang dilakukan
        }

        // Mengimplementasikan metode abstrak untuk menghitung komisi yang diterima oleh kasir
        @Override
        public double calculateCommission() {
            // Dalam kasus nyata, kasir mungkin mendapatkan komisi berdasarkan jumlah transaksi yang dilakukan
            // Di sini kita asumsikan bahwa komisi diberikan berdasarkan setiap transaksi yang dilakukan
            double commissionPerTransaction = 0.50; // Misalnya, setiap transaksi memberi komisi sebesar $0.50
            return commissionPerTransaction * numberOfTransactions;
        }

        // Mengimplementasikan metode abstrak untuk menghitung gaji kasir
        @Override
        public double calculatePay() {
            // Gaji kasir terdiri dari gaji dasar ditambah komisi yang didapat dari jumlah transaksi yang dilakukan
            return getBasePay() + calculateCommission();
        }

        // Mengimplementasikan metode abstrak untuk mengecek kelayakan promosi kasir
        @Override
        public boolean checkPromotionEligibility() {
            // Dalam kasus nyata, promosi kasir mungkin berdasarkan kinerja dan jumlah transaksi yang dilakukan
            // Di sini kita asumsikan bahwa kasir akan dipromosikan jika telah melakukan sejumlah transaksi tertentu
            int promotionTransactionThreshold = 100; // Misalnya, harus melakukan minimal 100 transaksi untuk dipromosikan
            return numberOfTransactions >= promotionTransactionThreshold;
        }

        // Method khusus untuk menambah jumlah transaksi yang dilakukan oleh kasir
        public void addTransaction() {
            numberOfTransactions++;
        }

        // Method khusus untuk mendapatkan jumlah transaksi yang telah dilakukan oleh kasir
        public int getNumberOfTransactions() {
            return numberOfTransactions;
        }

        public void setNumberOfTransactions(int numberOfTransactions) {
            this.numberOfTransactions = numberOfTransactions;
        }

        @Override
        public String getName() {
            
            return employeeName;    
        }

        @Override
    public double calculateTotalRevenue(double storeSales) {
        double commission = calculateCommission();
        double remainingRevenue = calculateRemainingStoreRevenue(storeSales);
        return remainingRevenue + commission;
    }



    @Override
    void determineLeave() {
        double salary = calculatePay();
        double incomeThreshold = 1000;
        if (salary > incomeThreshold) {
            System.out.println("Cashier is eligible for leave due to exceeding income threshold.");
            // Additional logic to grant leave for Cashier
        } else {
            System.out.println("Cashier is not eligible for leave.");
            // Additional logic if Cashier is not eligible for leave
        }
    }

    }

