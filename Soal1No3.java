public class Soal1No3 {
    public static void main(String[] args) {
        for (int i = 50; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            } else {
                System.out.println(i + ". saya anak wikusama");
            }
        }
        System.out.println("1. saya senang");
    }
}
