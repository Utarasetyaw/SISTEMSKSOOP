package sample;

public class IP {
    Matkul matkul;
    NonPraktikum []nonPraktikum;
    Praktikum []praktikum;

    public IP(Matkul matkul, NonPraktikum[] nonPraktikum) {
        this.matkul = matkul;
        this.nonPraktikum = nonPraktikum;
    }

    public IP(Matkul matkul, Praktikum[] praktikum) {
        this.matkul = matkul;
        this.praktikum = praktikum;
    }

    public IP(Matkul matkul, NonPraktikum[] nonPraktikum, Praktikum[] praktikum) {
        this.matkul = matkul;
        this.nonPraktikum = nonPraktikum;
        this.praktikum = praktikum;
    }

    public IP() {
    }
    }




