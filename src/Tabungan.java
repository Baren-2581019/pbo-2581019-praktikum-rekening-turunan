public class Tabungan extends Rekening { //[cite: 53, 77]
    private double bungaPersen; //[cite: 77]

    public Tabungan(String nomor, String pemilik, int saldo, double bungaPersen) {
        // memanggil super(...) untuk menjalankan constructor Rekening[cite: 60, 77]
        super(nomor, pemilik, saldo);
        this.bungaPersen = bungaPersen;
    }

    public int tambahBunga() { //[cite: 77]
        // menghitung bunga dari saldo yang bersifat protected[cite: 77]
        int besarBunga = (int) (saldo * (bungaPersen / 100));

        // menabahkan bunga lewat setor()[cite: 77]
        setor(besarBunga);

        return besarBunga; // mengembalikan besar bunganya[cite: 77]
    }

    @Override //[cite: 70, 77]
    public void cetakInfo() {
        super.cetakInfo(); // panggil super.cetakInfo() dulu[cite: 77]
        System.out.println("Jenis: Tabungan (Bunga: " + bungaPersen + "%)"); //[cite: 77]
    }
}