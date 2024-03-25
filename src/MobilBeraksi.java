class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        Mobil mobil2 = new Mobil("SUV", "FORTUNER", 2022);
        Mobil mobil3 = new Mobil("MPV", "HONDA JAZZ", 2019);
        Mobil mobil4 = new Mobil("MPV", "TOYOTA AVANZA", 2023);

        mbl.setJenis("MPV");
        mbl.setNama("TOYOTA AVANZA");
        mbl.setTahun(2017);

        System.out.println(mbl.getNama());
        System.out.println(mbl.getJenis());
        System.out.println(mbl.getTahun());
        System.out.println(mobil2.getNama());

        mobil2.detilMobil();
        mobil3.detilMobil();
        mobil4.detilMobil();
    }
}
