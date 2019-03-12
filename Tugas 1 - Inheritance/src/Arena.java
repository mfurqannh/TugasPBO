/*
     Menjalankan pertarungan antar dua robot

 */

public class Arena {
    private Robot robot1;
    private Robot robot2;

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
        Robot robotAktif = robot1;
        Robot robotPasif = robot2;

        while (!isSelesai) {
            System.out.println("");
            System.out.println("Giliran robot:"+robotAktif.nama);
            System.out.println("Robot menyerang dengan senjata "+robotAktif.oSenjata.nama);
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
        //buat arena
        Arena oArena = new Arena();

        //siapkan robot
        Robot robot1 = new Robot("Robot pertama");
        Robot robot2 = new Robot("Robot kedua");

        //tambahkan senjata ke robot
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

    }

}
