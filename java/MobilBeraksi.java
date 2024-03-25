class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        mbl.setJenis("MPV");
        mbl.setNama("TOYOTA AVANZA");
        mbl.setTahun(2017);

        System.out.println(mbl.getNama());
        System.out.println(mbl.getJenis());
        System.out.println(mbl.getTahun());
    }
}
