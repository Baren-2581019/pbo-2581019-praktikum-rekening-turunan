public class BankTurunan {
    public static void main(String[] args) {
        System.out.println("=== Inisiasi Object ===");
        // Data: Tabungan 101 Ani saldo 1.000.000 bunga 2.5%[cite: 77]
        Tabungan tabunganAni = new Tabungan("101", "Ani", 1000000, 2.5);

        // Giro 201 Budi saldo 200.000 batas overdraft 500.000[cite: 77]
        Giro giroBudi = new Giro("201", "Budi", 200000, 500000);

        tabunganAni.cetakInfo();
        giroBudi.cetakInfo();

        System.out.println("\n=== Transaksi Berurutan ===");

        // tabungan tarik 1.500.000[cite: 77]
        boolean statusTarikTabungan = tabunganAni.tarik(1500000);
        System.out.println("Tabungan ditarik 1.500.000 -> " + (statusTarikTabungan ? "Berhasil" : "Gagal"));

        // giro tarik 500.000[cite: 77]
        boolean statusTarikGiro1 = giroBudi.tarik(500000);
        System.out.println("Giro ditarik 500.000 -> " + (statusTarikGiro1 ? "Berhasil" : "Gagal"));

        // giro tarik 300.000[cite: 77]
        boolean statusTarikGiro2 = giroBudi.tarik(300000);
        System.out.println("Giro ditarik 300.000 -> " + (statusTarikGiro2 ? "Berhasil" : "Gagal"));

        // giro setor 100.000[cite: 77]
        boolean statusSetorGiro = giroBudi.setor(100000);
        System.out.println("Giro setor 100.000 -> " + (statusSetorGiro ? "Berhasil" : "Gagal"));

        // tambah bunga tabungan[cite: 77]
        int bungaDidapat = tabunganAni.tambahBunga();
        System.out.println("Bunga Tabungan ditambahkan: " + Rekening.formatRupiah(bungaDidapat));

        System.out.println("\n=== Saldo Akhir ===");
        tabunganAni.cetakInfo();
        giroBudi.cetakInfo();
    }
}