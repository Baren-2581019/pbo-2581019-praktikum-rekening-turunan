public class Giro extends Rekening { //[cite: 53, 77]
    private int batasOverdraft; //[cite: 77]

    public Giro(String nomor, String pemilik, int saldo, int batasOverdraft) {
        // memanggil constructor parent[cite: 60, 77]
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override //[cite: 70, 77]
    public boolean tarik(int jumlah) {
        // menolak jumlah <= 0 atau yang membuat saldo lebih rendah dari -batasOverdraft[cite: 77]
        if (jumlah <= 0 || (saldo - jumlah) < -batasOverdraft) {
            return false;
        }
        saldo -= jumlah; //[cite: 77]
        return true;
    }

    @Override //[cite: 70, 77]
    public void cetakInfo() {
        super.cetakInfo(); // panggil cetakInfo milik parent terlebih dahulu[cite: 77]
        System.out.println("Jenis: Giro (Batas Overdraft: " + formatRupiah(batasOverdraft) + ")"); //[cite: 77]

        // System.out.println(nomor);
        // java: nomor has private access in Rekening[cite: 75, 77]
    }
}