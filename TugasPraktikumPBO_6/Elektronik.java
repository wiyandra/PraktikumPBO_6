package TugasPraktikumPBO_6;
public class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }
    @Override
    public double hitungDiskon() {
        return harga * 0.40;
    }
}
