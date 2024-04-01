public class TestOverride {
    public static void main(String[] args) {
        Mobil manual = new Mobil();
        Mobil matic = new MobilMatic();
        Mobil truk = new MobilTruk();

        manual.mobilJalan();
        matic.mobilJalan();
        truk.mobilJalan();
    }
}
