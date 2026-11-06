public class Rekening {
    // nomor dan pemilik tetap private
    private String nomor;
    private String pemilik;

    // saldo diubah jadi protected agar bisa diakses langsung oleh child[cite: 54, 77]
    protected int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        this.saldo += jumlah;
        return true;
    }

    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > this.saldo) {
            return false;
        }
        this.saldo -= jumlah;
        return true;
    }

    // formatRupiah diubah jadi protected static
    protected static String formatRupiah(int nominal) {
        return String.format("Rp%,d", nominal).replace(',', '.');
    }

    public void cetakInfo() {
        System.out.println(this.nomor + " | " + this.pemilik + " | " + formatRupiah(this.saldo));
    }
}