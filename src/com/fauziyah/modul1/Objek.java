package com.fauziyah.modul1;

public class Objek {
    public static void main(String[] args) {
        //deklarasi objek tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Niall");
        mahasiswaTanpa.setNim(12345);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("NIM \t: " + mahasiswaTanpa.getNim());

        //deklarasi objek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Sri", 34466);

        System.out.println("\nMahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("NIM \t: " + mahasiswa.getNim());
    }
}
