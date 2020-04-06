package sample;

public class Praktikum {
    private int nilai_tugas, utp, uap;

    public Praktikum(int nilai_tugas, int utp, int uap) {
        this.nilai_tugas = nilai_tugas;
        this.utp = utp;
        this.uap = uap;
    }

    public Praktikum() {
    }

    public int getNilai_tugas() {
        return nilai_tugas;
    }

    public void setNilai_tugas(int nilai_tugas) {
        this.nilai_tugas = nilai_tugas;
    }

    public int getUtp() {
        return utp;
    }

    public void setUtp(int utp) {
        this.utp = utp;
    }

    public int getUap() {
        return uap;
    }

    public void setUap(int uap) {
        this.uap = uap;
    }
    public Praktikum Hasil(){
        Praktikum temprak = new Praktikum();
        System.out.println("tugas "+ getNilai_tugas());
        System.out.println("utp "+ getUtp());
        System.out.println("uap "+ getUap());
        double hasil = getNilai_tugas()*0.30;
       double hasil2 = getUap()*0.30;
       double hasil3 = getUtp()*0.40;
        double all = hasil+hasil2+hasil3;
        System.out.println("ip semestara prakikum " + all);
        return temprak;
    }
    }
