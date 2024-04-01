public class testInheritance {
    public static void main(String[] args) {
        Hewan kcg = new Kucing();
        kcg.namaHewan("Kucing");
        kcg.suaraHewan("Meong");

        Hewan anjing1 = new Anjing();
        anjing1.namaHewan("Anjing");
        anjing1.suaraHewan("guk-guk");
    }
}
