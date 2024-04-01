public class Smartphone {
    private String nama;
    private int harga;
    private int tahun;

    public Smartphone(String nama, int harga, int tahun){
        this.nama = nama;
        this.tahun = tahun;
        this.harga = harga;
    }

    public void showSmartphone(){
        System.out.println(nama);
    }
}

