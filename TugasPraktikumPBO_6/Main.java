package TugasPraktikumPBO_6;
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja(3); //Kapasitas Keranjang 10 Produk
        
        //Tambah Produk
        keranjang.keranjangbelanja(new Buku("Buku Siksa Neraka", 30000));
        keranjang.keranjangbelanja(new Elektronik("Kulkas", 1500000));
        keranjang.keranjangbelanja(new Pakaian("Baju Robek", 500000));
        
        keranjang.detailbarang();
        
        double totalHarga = keranjang.hitungHarga();
        System.out.println("Total Harga sebelum Diskon : " + totalHarga);
        double totalHargaDiskon = keranjang.hitungHargaDiskon();
        System.out.println("Total Harga sesudah Diskon : " + totalHargaDiskon);
    }
}
