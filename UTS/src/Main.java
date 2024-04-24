//Nomor 1
//public class Main {
//    public static void main(String[] args) {
//        Pegawai1 pegawai1 = new Pegawai1("Hanif", "Manager", 20);
//        Pegawai2 pegawai2 = new Pegawai2("Marcel", "Staff IT");
//        PegawaiPW pegawaiPW = new PegawaiPW("Allan", "Sekretaris", 60, 10);
//
//        System.out.println("Informasi Pegawai:");
//        System.out.println("=====================================");
//        System.out.println("Pegawai 1:");
//        System.out.println(pegawai1);
//        System.out.println("\nPegawai 2:");
//        System.out.println(pegawai2);
//        System.out.println("\nPegawai Paruh Waktu:");
//        System.out.println(pegawaiPW);
//    }
//}

//Nomor 2
public class Main {
    public static void main(String[] args) {
        Pegawai1 pegawai1 = new Pegawai1("Hanif", "Manager", 20);
        Pegawai2 pegawai2 = new Pegawai2("Marcel", "Staff IT");
        PegawaiPW pegawaiPW = new PegawaiPW("Allan", "Sekretaris", 60, 10);

        System.out.println("Informasi Pegawai:");
        System.out.println("=====================================");
        System.out.println("Pegawai 1:");
        System.out.println(pegawai1);
        System.out.println("\nPegawai 2:");
        System.out.println(pegawai2);
        System.out.println("\nPegawai Paruh Waktu:");
        System.out.println(pegawaiPW);

        Pegawai pegawaiTertinggi = pegawai1;
        double gajiTertinggi = pegawai1.hitungGaji();

        if (pegawai2.hitungGaji() > gajiTertinggi) {
            pegawaiTertinggi = pegawai2;
            gajiTertinggi = pegawai2.hitungGaji();
        }
        if (pegawaiPW.hitungGaji() > gajiTertinggi) {
            pegawaiTertinggi = pegawaiPW;
        }

        System.out.println("\nPegawai dengan Take Home Pay Tertinggi:");
        System.out.println("=====================================");
        System.out.println(pegawaiTertinggi);
    }
}

