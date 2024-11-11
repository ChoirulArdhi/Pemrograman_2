package tugas_krs;

public class krs {
    public static void main(String[] args) {
        masterData d = new masterData();
        masterMatakuliah m = new masterMatakuliah ();
        masterDosen md = new masterDosen ();
        System.out.println("============================================================================================");
            System.out.println("============================================================================================");
            System.out.println("  Mahasiswa           : "+d.nama);
            System.out.println("  Dosen Wali          : "+d.wali);
            System.out.println("  Fakultas            : "+d.fakultas +"        Data                : "+d.data);
            System.out.println("  Jurusan             : "+d.prodi);
            System.out.println("  Jenis Kelamin       : "+d.jk +"                NIDN Dosen          : "+d.nidn);
            System.out.println("  Kur / Smt / SKS     : "+d.smt +"                Batas SKS Diambil   : "+d.sks);
            System.out.println("============================================================================================");
            System.out.println("============================================================================================");
            
         System.out.println("=========================================================================================================");
                    System.out.println("|| NO ||   Code   ||             Nama Matkul            ||  SKS  ||               Dosen                ||");
                    System.out.println("=========================================================================================================");
                    System.out.println("|| 1  ||"+m.code[0]+" || "+m.aok+" ||   "+m.sks[0]+"   || "+md.i);
                    System.out.println("|| 2  ||"+m.code[1]+" || "+m.bina+"                   ||   "+m.sks[1]+"   || "+md.r);
                    System.out.println("|| 3  ||"+m.code[2]+" || "+m.bing+"                   ||   "+m.sks[2]+"   || "+md.w);
                    System.out.println("|| 4  ||"+m.code[3]+" || "+m.pgr+"                     ||   "+m.sks[3]+"   || "+md.a);
                    System.out.println("|| 5  ||"+m.code[4]+" || "+m.sbd+"                  ||   "+m.sks[4]+"   || "+md.t);
                    System.out.println("|| 6  ||"+m.code[5]+" || "+m.sp+"        ||   "+m.sks[5]+"   || "+md.v);
                    System.out.println("|| 7  ||"+m.code[6]+" || "+m.tba+"          ||   "+m.sks[6]+"   || "+md.m);
                    System.out.println("=========================================================================================================");
                    System.out.println("        Total SKS yang Diambil                          ||   "+m.totalsks+"  ||                       ");
                    System.out.println("=========================================================================================================");
    }
}
