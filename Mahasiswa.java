package sample;

public class Mahasiswa {
    private String Nama;
    private String nim;
    Matkul[] matkul;
    IP [] ip;

    public Mahasiswa(String nama, String nim, Matkul [] matkul, IP [] ip) {
        Nama = nama;
        this.nim = nim;
        this.matkul = matkul;
        this.ip = ip;
    }

    public Mahasiswa() {
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Mahasiswa Tampil_Mahasiswa() {
        Mahasiswa tempMA = new Mahasiswa();

        System.out.println("Nama " + getNama());
        System.out.println("nim : " + getNim());
        return tempMA;

    }
}

