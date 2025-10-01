public class Main {
    public static void main(String[] args) {
        // Polymorphism: objek Shape merujuk ke PersegiPanjang dan Lingkaran
        Shape bentuk1 = new PersegiPanjang(10, 5);
        Shape bentuk2 = new Lingkaran(7);

        // Menampilkan hasil luas
        System.out.println("Luas Persegi Panjang: " + bentuk1.hitungLuas());
        System.out.println("Luas Lingkaran: " + bentuk2.hitungLuas());
    }
}