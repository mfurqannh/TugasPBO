public class AdeganLuarJendela extends Adegan {
    private Zombie oZombie = new Zombie();

    public AdeganLuarJendela(){
        narasi = "Rudi Bertemu dengan zombie dengan darah "+oZombie.kesehatan;

        Adegan adeganPintu = new AdeganPintu();
        Adegan adeganMeja  = new Adegan();
        Adegan adeganJendela = new AdeganJendela(); //adegan jendela

        Pilihan pilihanMenujuPintu = new PilihanGantiAdegan(adeganPintu,"Menuju pintu");
        Pilihan pilihanMenujuMeja  = new PilihanGantiAdegan(adeganMeja,"Menuju meja");
        Pilihan pilihanMenujuJendela = new PilihanGantiAdegan(adeganJendela,"Masuk jendela");

        tambahPilihan(pilihanMenujuJendela);
        adeganJendela.tambahPilihan(pilihanMenujuMeja);
        adeganJendela.tambahPilihan(pilihanMenujuPintu);
        adeganJendela.idBarangBisaDigunakan = "obeng";

        if (oZombie.kesehatan<=0){
            System.out.println("Zombie mati dan Rudi berhasil keluar, permainan selesai");
            oPlayer.isSelesai = true;
        }

    }

    /* user berhasil menggunakan kunci untuk membuka pintu */
    @Override
    public void gunakanBarang(Barang barangPilih) {
        super.gunakanBarang(barangPilih); //panggil parent
        System.out.println("Zombie terkena 50 damage, Rudi terkena 5 damage");
        oZombie.kesehatan-=50;
        oPlayer.kesehatan-=5;

    }
}
