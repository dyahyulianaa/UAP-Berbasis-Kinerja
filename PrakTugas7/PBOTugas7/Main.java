package PBOTugas7;

//Nama  : Dyah Yuliana Abidah
//NIM   : 215150601111017

public class Main {

    public static void main(String[] args) {
        PegawaiTetap pt1 = new PegawaiTetap("Dyah Yuliana Abidah", "3502784903274248", 2000000);
        System.out.println(pt1.toString());
        PegawaiHarian ph1 = new PegawaiHarian("Irene", "3502043274092343", 8500, 50);
        System.out.println(ph1.toString());
        Sales s1 = new
                Sales("Nono", "3502704902345060", 45, 40000);
        System.out.println(s1.toString());
        System.out.println("========================================");

        PegawaiTetap pt2 = new PegawaiTetap("Kim Jisoo", "3502849024230033", 3000000);
        System.out.println(pt2.toString());
        PegawaiHarian ph2 = new PegawaiHarian("Jiwon", "3502374095482914", 5000, 45);
        System.out.println(ph2.toString());
        Sales s2 = new
                Sales("Nana", "3502443290425606", 90, 80000);
        System.out.println(s2.toString());
        System.out.println("========================================");

        PegawaiTetap pt3 = new PegawaiTetap("Song Hye Kyo", "3502181905060004", 4000000);
        System.out.println(pt3.toString());
        PegawaiHarian ph3 = new PegawaiHarian("Wendy", "3502562263782537", 30000, 30);
        System.out.println(ph3.toString());
        Sales s3 = new
                Sales("Nini", "3502490327424508", 50, 20000);
        System.out.println(s3.toString());
    }
}
