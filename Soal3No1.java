
import java.util.Scanner;

public class Soal3No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        int[] kehadiran = masukkanKehadiran(jumlahSiswa, input);
        int totalKehadiran = hitungTotalKehadiran(kehadiran);
        double rataRataKehadiran = hitungRataRataKehadiran(totalKehadiran, jumlahSiswa);

        cetakLaporanKehadiran(jumlahSiswa, kehadiran, rataRataKehadiran);
    }

    // Fungsi untuk memasukkan kehadiran siswa
    public static int[] masukkanKehadiran(int jumlahSiswa, Scanner input) {
        int[] kehadiran = new int[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            kehadiran[i] = input.nextInt();
        }
        return kehadiran;
    }

    // Fungsi untuk menghitung total kehadiran
    public static int hitungTotalKehadiran(int[] kehadiran) {
        int totalKehadiran = 0;
        for (int hadir : kehadiran) {
            totalKehadiran += hadir;
        }
        return totalKehadiran;
    }

    // Fungsi untuk menghitung rata-rata kehadiran
    public static double hitungRataRataKehadiran(int totalKehadiran, int jumlahSiswa) {
        return (double) totalKehadiran / jumlahSiswa;
    }

    // Fungsi untuk mencetak laporan kehadiran
    public static void cetakLaporanKehadiran(int jumlahSiswa, int[] kehadiran, double rataRataKehadiran) {
        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan: ");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " hari hadir");
        }
        System.out.print("Rata-rata kehadiran siswa: "+ rataRataKehadiran + "hari");

        System.out.println("\nKesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRataKehadiran) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }

        System.out.println("\n- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRataKehadiran) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }
    }
}