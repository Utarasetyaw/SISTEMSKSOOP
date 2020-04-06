package sample;

public class NonPraktikum {
    private int tugas, uts, uas;

    public NonPraktikum(int tugas, int uts, int uas) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public NonPraktikum() {
    }

    public int getTugas() {
        return tugas;
    }

    public void setTugas(int tugas) {
        this.tugas = tugas;
    }

    public int getUts() {
        return uts;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public int getUas() {
        return uas;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }
    public NonPraktikum Hasil(){
        NonPraktikum tempNOrak = new NonPraktikum();
        System.out.println("tugas "+ getTugas());
        System.out.println("uts "+ getUts());
        System.out.println("uas "+ getUas());
        double hasil = getTugas()*0.30;
        double hasil2 = getUts()*0.30;
        double hasil3 = getUas()*0.40;
        double all = hasil+hasil2+hasil3;
        System.out.println("ip semestara Nonpraktikum " + all);
        return tempNOrak;
    }


}


