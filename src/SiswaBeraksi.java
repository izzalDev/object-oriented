public class SiswaBeraksi {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();
        siswa1.setNama("Maulana Malik Ibrahim");
        siswa1.setNisn(16546845);
        siswa1.setKelas(12);
        System.out.println(siswa1.getNama());
        System.out.println(siswa1.getNisn());
        System.out.println(siswa1.getKelas());
    }
}
