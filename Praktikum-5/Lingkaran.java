// Kelas Lingkaran yang meng-override method hitungLuas
public class Lingkaran extends Shape {
    private double jariJari;

    // Konstruktor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}