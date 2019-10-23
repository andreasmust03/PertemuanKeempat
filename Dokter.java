public class Dokter extends Orang {
    @Override
    public void makan() {
        super.makan();
        System.out.println("Dokter sedang makan");
    }

    @Override
    public void tampilkanInfo(String nama, int dumur, String warnapakaian) {
        super.tampilkanInfo(nama, dumur, warnapakaian);
        System.out.println("Saya bernama " + nama + "dan berumur" + umur +"tahun");
        System.out.println("Pakaian saya berwarna"+ warnaPakaian);
    }
    public void memerikas(){
        System.out.println("Dokter sedang memeriksa pasien");
    }
}
