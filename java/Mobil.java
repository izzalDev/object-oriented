class Mobil {
    private String jenis;
    private String nama;
    private int tahun;

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    String getNama() {
        return nama;
    }

    String getJenis() {
        return jenis;
    }

    int getTahun() {
        return tahun;
    }
}