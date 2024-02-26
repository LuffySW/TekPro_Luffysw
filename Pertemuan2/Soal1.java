package pertemuan2;
import java.math.BigInteger;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        try {
            BigInteger[] angka = new BigInteger[6];
            System.out.println("Masukkan Angka :");
            for (int i = 0; i < angka.length; i++) {
                if (!myObj.hasNextBigInteger()) {
                    System.out.println("Tidak cukup angka yang dimasukkan.");
                    break;
                }
                angka[i] = myObj.nextBigInteger();
            }
        
            for (int i = 0; i<= 5;i++){
                boolean isFittedShown = false;

                if (!isFittedShown) {
                    System.out.println(angka[i] + " can be fitted in: ");
                    isFittedShown = true;
                }
                
                if (angka[i].compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) > 0 &&
                        angka[i].compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) < 0) {
                    System.out.println("*byte");
                }  if (angka[i].compareTo(BigInteger.valueOf(Short.MIN_VALUE)) > 0 &&
                        angka[i].compareTo(BigInteger.valueOf(Short.MAX_VALUE)) < 0) {
                    System.out.println("*short");
                }  if (angka[i].compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) > 0 &&
                        angka[i].compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) < 0) {
                    System.out.println("*int");
                } else if (angka[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) > 0 &&
                        angka[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0) {
                    System.out.println("*long");
                }
                else{
                    System.out.println("Cant be fitted anywhere");
                }
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally{
        myObj.close();
        }
    }  
}
