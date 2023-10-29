package Tugas2;
import java.util.Scanner;
/**
 * Program ini mengkonversi bilangan desimal menjadi bentuk biner dan oktal.
 * Menggunakan dua metode untuk menghitung konversi ke biner dan oktal.
 */
public class DecimalToOctal {

    /**
     * Fungsi utama program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal: ");
        int decimalNumber = input.nextInt();

        String binary = decimalToBinary(decimalNumber);
        String octal = decimalToOctal(decimalNumber);

        System.out.println("Hasil konversi ke biner : " + binary);
        System.out.println("Hasil konversi ke oktal : " + octal);

        input.close();
    }

    /**
     * Metode ini mengkonversi bilangan desimal menjadi bilangan biner.
     *
     * @param decimalNumber Bilangan desimal yang akan dikonversi.
     * @return String yang mewakili bilangan biner.
     */
    public static String decimalToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber = decimalNumber / 2;
        }
        return binary.toString();
    }

    /**
     * Metode ini mengkonversi bilangan desimal menjadi bilangan oktal.
     *
     * @param decimalNumber Bilangan desimal yang akan dikonversi.
     * @return String yang mewakili bilangan oktal.
     */
    public static String decimalToOctal(int decimalNumber) {
        StringBuilder octal = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8;
            octal.insert(0, remainder);
            decimalNumber = decimalNumber / 8;
        }
        return octal.toString();
    }
}
