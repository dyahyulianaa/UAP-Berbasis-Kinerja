package PrakPBOTugas6;
import java.util.ArrayList;

//Nama  : Dyah Yuliana Abidah
//NIM   : 215150601111017

public class Main {

    public static void main(String[] args) {
        Manusia man1 = new Manusia("Lia", "215150601111017", false, true);
        Manusia man2 = new Manusia("Mingyu", "205150601111017", true, false);
        Manusia man3 = new Manusia("Wonwoo", "205150601111018", true, false);
        ArrayList<Manusia> output = new ArrayList<Manusia>();
        output.add(man1);
        output.add(man2);
        output.add(man3);

        System.out.println("========== CLASS MANUSIA ==========");
        for(int i = 0; i < output.size(); i++){
            System.out.println(output.get(i).toString());
        }
        System.out.println("=====================================");

        Mahasiswa mhs1 = new Mahasiswa("Dyah", "3316256789256783", false, false, "215150601111019", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("Yuliana", "3316782356789265", false, true, "215150601111020", 4.0);
        Mahasiswa mhs3 = new Mahasiswa("Abidah", "3316782356789265", false, false, "215150601111021", 3.2);
        ArrayList<Mahasiswa> output1 = new ArrayList<Mahasiswa>();
        output1.add(mhs1);
        output1.add(mhs2);
        output1.add(mhs3);

        System.out.println();
        System.out.println("========== DAFTAR MAHASISWA ==========");
        for(int i = 0; i < output1.size(); i++){
            System.out.println(output1.get(i).toString());
        }
        System.out.println("=====================================");

        Pekerja pkj1 = new Pekerja("Lia", "351167356892568", false, true, 8, 30, "1412123");
        Pekerja pkj2 = new Pekerja("Jamal", "351198743076268", true, false, 9, 28, "1412123");
        Pekerja pkj3 = new Pekerja("Yeni", "3511075378294610", false, true, 10, 26, "1412123");
        ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
        output2.add(pkj1);
        output2.add(pkj2);
        output2.add(pkj3);

        System.out.println();
        System.out.println("========== CLASS PEKERJA ==========");
        for(int i = 0; i < output2.size(); i++){
            System.out.println(output2.get(i).toString());
        }
        System.out.println("=====================================");

        Manager mng1 = new Manager("Jisoo", "3326789354678036", false, true,9, 25,"1233123", 3789);
        Manager mng2 = new Manager("Jennie", "3326634267893547", false, false,8, 28,"1234123", 3789);
        Manager mng3 = new Manager("Park Seo Jun", "3326032674893640", true, true,6, 25,"1235123", 3432);
        ArrayList<Manager> output3 = new ArrayList<Manager>();
        output3.add(mng1);
        output3.add(mng2);
        output3.add(mng3);

        System.out.println();
        System.out.println("========== CLASS MANAGER ==========");
        for(int i = 0; i < output3.size(); i++){
            System.out.println(output3.get(i).toString());
        }
        System.out.println("=====================================");

    }
}
