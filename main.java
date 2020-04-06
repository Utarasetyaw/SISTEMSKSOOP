package sample;

public class Main  {
    static Matkul[] Matkul;
    static NonPraktikum[] Nonpraktikum;
    static Praktikum[] praktikum;
    static IP[] ip;


    public static void main(String[] args) {
        Nonpraktikum = new NonPraktikum[5];
        NonPraktikum bahasa_indonesia = new NonPraktikum(100,90,85);
        NonPraktikum Sistem_Operasi = new NonPraktikum(100,90,85);
        NonPraktikum Statistika = new NonPraktikum(100,90,85);
        NonPraktikum Pemlan1 = new NonPraktikum(100,90,85);
        NonPraktikum AOK = new NonPraktikum(100,90,85);
        NonPraktikum TBP = new NonPraktikum(100,90,85);

        praktikum = new Praktikum[0];
        Praktikum pemlan = new Praktikum(100,100,95);


        Matkul = new Matkul[5];
        Matkul matkul0 = new Matkul("Bahasa Indonesia",bahasa_indonesia);
        Matkul matkul1 = new Matkul("Sistem Operasi",Sistem_Operasi);
        Matkul matkul2 = new Matkul("Statistika",Statistika);
        Matkul matkul3 = new Matkul("Pemograman",pemlan);
        Matkul matkul4 = new Matkul("AOK",AOK);
        Matkul matkul5 = new Matkul("TBP",TBP);

        ip = new IP[5];
        IP bahasa_indonesia1 = new IP(matkul0,new NonPraktikum[]{bahasa_indonesia});
        IP Sistem_Operasi1 = new IP(matkul1,new NonPraktikum[]{Sistem_Operasi});
        IP Statistika1 = new IP(matkul2,new NonPraktikum[]{Statistika});
        IP Pemlan = new IP(matkul3,new NonPraktikum[]{Pemlan1},new Praktikum[]{pemlan});
        IP AOK1 = new IP(matkul4,new NonPraktikum[]{AOK});
        IP TBP1 = new IP(matkul5,new NonPraktikum[]{TBP});


        Mahasiswa mahasiswa1 = new Mahasiswa("Utara setya w ","195150607111008",new Matkul[]{matkul0,matkul1,matkul2,matkul3,matkul4,matkul5},new IP[]{bahasa_indonesia1,Sistem_Operasi1,Pemlan,Statistika1,AOK1,TBP1});

        mahasiswa1.Tampil_Mahasiswa();
        matkul0.Tampil_matkul();
//        bahasa_indonesia.Hasil();
        matkul1.Tampil_matkul();
//        Sistem_Operasi.Hasil();
        matkul2.Tampil_matkul();
//        Statistika.Hasil();
        matkul3.Tampil_matkul();
//        pemlan.Hasil();
//        Pemlan1.Hasil();
        matkul4.Tampil_matkul();
//        AOK.Hasil();
        matkul5.Tampil_matkul();
//        TBP.Hasil();

        double pemlanNonprak = (Pemlan1.getTugas()*0.20)+(Pemlan1.getUas()*0.40+Pemlan1.getUts()*0.40);
        double pemlanpraktikum = (pemlan.getNilai_tugas()*0.20)+(pemlan.getUtp()*0.40)+(pemlan.getUap()*0.40);
        double ippemlan = (pemlanNonprak*0.40)+(pemlanpraktikum*0.60);
        double statictika = (Statistika.getTugas()*0.20)+(Statistika.getUts()*0.40)+(Statistika.getUas()*0.40);
        double tbp = (TBP.getTugas()*0.20)+(TBP.getUas()*0.40)+(TBP.getUts()*0.40);
        double aok = (AOK.getTugas()*0.20)+(AOK.getUas()*0.40)+(AOK.getUts()*0.40);
        double bahasa = (bahasa_indonesia.getTugas()*0.20)+(bahasa_indonesia.getUts()*0.40)+(bahasa_indonesia.getUas()*0.40);
        double sistemop = (Sistem_Operasi.getTugas()*0.20)+(Sistem_Operasi.getUts()*0.40)+(Sistem_Operasi.getUas()*0.40);

        double ipk_total = (ippemlan+tbp+aok+bahasa+sistemop+statictika)/6;
        System.out.println("IPK ANDA :" +ipk_total);








    }
}
