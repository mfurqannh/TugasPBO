import java.util.Scanner;

public class ArenaInteraktif {
/*
    private RobotAlt robot1;
    private RobotAlt robot2;

    public void tambahRobot(Robot r1,Robot r2) {
        robot1 = r1;
        robot2 = r2;
    }

    public void bertanding() {
        //UI sederhana untuk pertandingan

        //loop sampai salah satu robot habis skor kesehatannya
        boolean isSelesai = false;

        //LENGKAPI dengan NIM dan NAMA
        System.out.println("Saya berjanji tdk berbuat curang dan/atau membantu orang lain berbuat curang");
        System.out.println(" Quiz 1 27 Feb ");
        System.out.println(" NIM 1600659 NAMA Muhammad Furqan Nur Hakim ");

        System.out.print("Pertandingan dimulai =====\n");

        //player
        RobotAlt robotAktif = robot1;
        RobotAlt robotPasif = robot2;

        while (!isSelesai) {
            System.out.println("");
            System.out.println("Giliran robot:"+robotAktif.nama);
            System.out.println("Robot menyerang dengan senjata "+robotAktif.oSenjata[0].nama);
            System.out.println(""+robotPasif.nama+ " menggunakan perisai " +robotPasif.oPerisai.nama);
            System.out.println("Serangan berkurang sebesar " +robotPasif.oPerisai.kekuatan);
            robotAktif.serang(robotPasif);
            //print kesehatan
            robot1.printStatistik();
            robot2.printStatistik();
            //tukar peran
            Robot temp = robotAktif; //supaya tdk tertimpa
            robotAktif = robotPasif;
            robotPasif = temp;

            //stop jika salah satu robot skor kesehatanya nol
            isSelesai = (robotAktif.kesehatan<=0 || robotPasif.kesehatan<=0);
        }
        System.out.println("Pertandingan Selesai");
        if (robotPasif.kesehatan>0){
            robotAktif = robotPasif;
        }
        System.out.println("Pemenangnya adalah "+robotAktif.nama);


        //cek pemenang
        //lengkapi

    }



    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        //buat arena
        ArenaInteraktif oArena = new ArenaInteraktif();

        //siapkan robot
        System.out.println("Nama robot pertama: ");
        String rb1 = in.next();
        System.out.println("Nama robot kedua: ");
        String rb2 = in.next();

        RobotAlt robot1 = new RobotAlt(rb1);
        RobotAlt robot2 = new RobotAlt(rb2);

        //tambahkan senjata ke robot
        System.out.println("Jumlah senjata robot "+robot1.nama+":");
        int s1 = in.nextInt();
        System.out.println("Jumlah senjata robot "+robot2.nama+":");
        int s2 = in.nextInt();

        Senjata oSenjataKilat = new SenjataKilat();
        robot1.tambahSenjata(oSenjataKilat);

        Senjata oSenjataPukulan2 = new SenjataPukulan();
        robot2.tambahSenjata(oSenjataPukulan2);

        Perisai oPerisaiKayu = new PerisaiKayu();
        robot1.tambahPerisai(oPerisaiKayu);

        Perisai oPerisaiBesi = new PerisaiBesi();
        robot2.tambahPerisai(oPerisaiBesi);

        //tambahkan robot ke arena
        oArena.tambahRobot(robot1,robot2);

        //mainkan
        oArena.bertanding();
        */
}
