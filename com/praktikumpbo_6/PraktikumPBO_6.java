package com.praktikumpbo_6;
public class PraktikumPBO_6 {

    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.bersuara(); // Metode makan yang 
        //dioverride di kelas Kucing
        kucing.makan("Ikan Tongkol");
        kucing.makan("Ikan Tongkol", 3);
        
        Anjing anjing = new Anjing();
        anjing.bersuara(); // Metode makan yang 
        //dioverride di kelas Anjing
        anjing.makan("Daging", 3);
    }
}


