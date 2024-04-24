class Pegawai {
    protected String nama;
    protected String jabatan;
    protected double gajiPokok = 550;
    protected double asuransi = 30;

    public Pegawai(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public String toString() {
        return "Nama: " + nama + "\nJabatan: " + jabatan + "\nGaji Pokok: " + gajiPokok + "\nAsuransi: " + asuransi;
    }
}





