public class AdeganKoridor extends Adegan{
    public AdeganKoridor(){
        narasi = "Rudi pelan-pelan membuka pintu dan keluar dari kamar. Rudi sekarang berada di koridor " +
                "yang sangat panjang dan gelap";
    }

    /* user berhasil menggunakan kunci untuk membuka pintu */
    @Override
    public void gunakanBarang(Barang barangPilih) {
        super.gunakanBarang(barangPilih); //panggil parent
        System.out.println("Rudi berhasil keluar ruangan, permainan selesai");

        oPlayer.isSelesai = true;
    }
}
