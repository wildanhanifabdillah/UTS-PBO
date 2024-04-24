class PegawaiPW extends Pegawai {
    private int jamKerja;
    private double tarifPerJam;

    public PegawaiPW(String nama, String jabatan, int jamKerja, double tarifPerJam) {
        super(nama, jabatan);
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }

    public double hitungGaji() {
        double gaji = jamKerja * tarifPerJam;
        return gaji;
    }

    public String toString() {
        return "Nama: " + nama + "\nJabatan: " + jabatan + "\nJam Kerja: " + jamKerja + " jam\nTarif Per Jam: $" + tarifPerJam + "\nTake Home Pay: $" + hitungGaji() +"\nAsuransi: 0";
    }
}

