public class Soal2No1 {
    public static void main(String[] args) {
        int tabunganAwal = 100000; // Tabungan bulan pertama
        int kenaikanPerBulan = 50000; // Kenaikan tabungan setiap bulan
        int jumlahBulan = 12; // Jumlah bulan
    
        int totalTabungan = hitungTotalTabungan(tabunganAwal, kenaikanPerBulan, jumlahBulan);
    
        System.out.println("Total tabungan setelah 12 bulan: Rp" + totalTabungan);
    }
    
    // Fungsi untuk menghitung tabungan bulan ini
    public static int hitungTabunganBulanIni(int tabunganAwal, int kenaikanPerBulan, int bulan) {
        return tabunganAwal + (bulan - 1) * kenaikanPerBulan;
    }

    // Fungsi untuk menampilkan dan menghitung total tabungan
    public static int hitungTotalTabungan(int tabunganAwal, int kenaikanPerBulan, int jumlahBulan) {
        int totalTabungan = 0;
        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            int tabunganBulanIni = hitungTabunganBulanIni(tabunganAwal, kenaikanPerBulan, bulan);
            System.out.println("Bulan " + bulan + ": Rp" + tabunganBulanIni + "\n--------------------------------");
            totalTabungan += tabunganBulanIni;
        }
        return totalTabungan;
    }

}

