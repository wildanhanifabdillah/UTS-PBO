class Pegawai2 extends Pegawai {
    private double bonus;

    public Pegawai2(String nama, String jabatan) {
        super(nama, jabatan);
        this.bonus = 0.04 * gajiPokok;
    }

    public double hitungGaji() {
        double gaji = gajiPokok + bonus;
        double asuransi = Math.min(0.1 * gaji, 30);
        return gaji - asuransi;
    }

    public String toString() {
        return super.toString() + "\nBonus: " + bonus + "\nTake Home Pay: " + hitungGaji();
    }
}

