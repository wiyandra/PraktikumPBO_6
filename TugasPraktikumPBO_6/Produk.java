package TugasPraktikumPBO_6;
public abstract class Produk {
    protected String nama;
    protected double harga;
    
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    public double hitungDiskon() {
        return harga * 0;
    }
}
