public class AdeganJendela extends Adegan{
    boolean isTerkunci = true;
    String narasiTerkunci = "Rudi mendekati jendela. Rudi mencoba membuka jendela. \"Ah terkunci\"";
    String narasiTerbuka  = "Rudi mencoba membuka jendela dan terbuka!";

    //constructor
    public AdeganJendela(){
        narasi = narasiTerkunci;
    }

    /* user berhasil menggunakan obeng untuk membuka jendela */
    @Override
    public void gunakanBarang(Barang barangPilih) {
        super.gunakanBarang(barangPilih); //panggil parent

        isTerkunci = false;
        narasi = narasiTerbuka;

        //karena jendela sudah terbuka ada pilihan baru keluar dari kamar
        Adegan adeganLuarJendela = new AdeganLuarJendela();
        Pilihan pilihanKeluarJendela = new PilihanGantiAdegan(adeganLuarJendela,"Keluar jendela");
        tambahPilihan(pilihanKeluarJendela);
        adeganLuarJendela.idBarangBisaDigunakan = "senjata";
    }
}
