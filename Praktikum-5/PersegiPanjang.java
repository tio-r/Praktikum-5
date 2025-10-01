// Kelas Persegi Panjang yang meng-override method hitungLuas
public class PersegiPanjang extends Shape {
    private double panjang;
    private double lebar;

    // Konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}