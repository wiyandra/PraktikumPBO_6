package TugasPraktikumPBO_6;
public class KeranjangBelanja {
    private Produk[] ListProduk;
    private int hitung;
    double total = 0;
    public KeranjangBelanja (int kapasitaskeranjang) {
        ListProduk = new Produk[kapasitaskeranjang];
        hitung = 0;
    }
    public void keranjangbelanja(Produk produk) {
        if (hitung < ListProduk.length) {
            ListProduk[hitung] = produk;
            hitung++;
        } else {
            System.out.println("Keranjang Belanja Sudah Penuh");
        }
    }
    public double hitungHarga() {
        for (int i = 0; i < hitung; i++) {
            total += ListProduk[i].getHarga();
        }
        return total;
    }
    public double hitungHargaDiskon() {
        for (int i = 0; i < hitung; i++) {
            total -= ListProduk[i].getHarga() - (ListProduk[i].getHarga() - ListProduk[i].hitungDiskon());
        }
        return total;
    }
    public void detailbarang() {
        for (Produk produk : ListProduk) {
            if (produk != null) {
                System.out.println("Nama Barang : " + produk.getNama());
                System.out.println("Harga Barang : " + produk.getHarga());
                System.out.println("Harga Diskon : " + produk.hitungDiskon() + "\n");
            } else {
                System.out.println("Semua Produk Sudah Terlist");
            }
        }
    }
}
