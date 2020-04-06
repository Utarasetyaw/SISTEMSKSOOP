package sample;

public class Matkul {
    private String Nama;
    Praktikum praktikum;
    NonPraktikum nonPraktikum;

    public Matkul(String nama, Praktikum praktikum) {
        Nama = nama;
        this.praktikum = praktikum;
    }

    public Matkul(String nama, NonPraktikum nonPraktikum) {
        Nama = nama;
        this.nonPraktikum = nonPraktikum;
    }

    public Matkul() {
    }

    public Matkul Tampil_matkul() {
        Matkul tempMAT = new Matkul();

        System.out.println("Nama Matkul  " + getNama());


        return tempMAT;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
}
