public class Siswa {
    private String nama;
    private int nisn;
    private int kelas;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNisn(int nisn) {
        this.nisn = nisn;
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }

    String getNama() {
        return this.nama;
    }

    int getNisn() {
        return this.nisn;
    }

    int getKelas() {
        return this.kelas;
    }

}
