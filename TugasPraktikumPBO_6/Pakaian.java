package TugasPraktikumPBO_6;
public class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }
    @Override
    public double hitungDiskon() {
        return harga * 0.20;
    }
}
