package sistem_Penilaian;
import java.util.Scanner;

public class Sistem_Penilaian_Mhs {
    // Modifier private untuk variabel konstanta batas kelulusan
    private static final double BATAS_KELULUSAN = 70.0;

    public static void main(String[] args) {
        // Scanner untuk input data
        Scanner scanner = new Scanner(System.in);

        // Memanggil prosedur untuk memasukkan data
        String nama = inputNama(scanner);
        double nilai = inputNilai(scanner);

        // Menghitung keterangan kelulusan
        String keterangan = tentukanKeterangan(nilai);

        // Menampilkan hasil akhir
        tampilkanHasil(nama, nilai, keterangan);

        // Menutup scanner
        scanner.close();
    }

    // Fungsi inputNama: mengembalikan nama yang diinput
    public static String inputNama(Scanner scanner) {
        System.out.print("Masukkan Nama Mahasiswa: ");
        return scanner.nextLine();
    }

    // Fungsi inputNilai: mengembalikan nilai yang diinput
    public static double inputNilai(Scanner scanner) {
        System.out.print("Masukkan Nilai Mahasiswa: ");
        return scanner.nextDouble();
    }

    // Fungsi tentukanKeterangan: mengembalikan keterangan kelulusan berdasarkan nilai
    public static String tentukanKeterangan(double nilai) {
        if (nilai > BATAS_KELULUSAN) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    // Prosedur tampilkanHasil: menampilkan nama, nilai, dan keterangan kelulusan
    public static void tampilkanHasil(String nama, double nilai, String keterangan) {
        System.out.println("\nHasil Penilaian:");
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Keterangan: " + keterangan);
    }
}