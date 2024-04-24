class Pegawai1 extends Pegawai {
    private double tunjangan;
    private double bonus;

    public Pegawai1(String nama, String jabatan, double tunjangan) {
        super(nama, jabatan);
        this.tunjangan = tunjangan;
        this.bonus = 0.04 * (gajiPokok + tunjangan);
    }

    public double hitungGaji() {
        double gaji = gajiPokok + tunjangan + bonus;
        return gaji;
    }

    public String toString() {
        return super.toString() + "\nTunjangan: " + tunjangan + "\nBonus: " + bonus + "\nTake Home Pay: " + hitungGaji();
    }
}

