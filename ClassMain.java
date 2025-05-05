package TugasPBO2;

class Mobil {
    String merk;

    Mobil(String merk) {
        this.merk = merk; // this.merk adalah variabel instance
    }

    void tampilkanMerk() {
        System.out.println("Merk mobil: " + this.merk); // Menampilkan merk
    }
}

public class ClassMain {
    public static void main(String[] args) {
        Mobil m = new Mobil("Toyota");
        m.tampilkanMerk(); // output: Merk mobil: Toyota
    }
}
