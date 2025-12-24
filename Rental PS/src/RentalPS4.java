public class RentalPS4 extends RentalPS implements BonusMember{

    public RentalPS4(String namaPenyewa, int lamSewa) {
        super(namaPenyewa, lamSewa, 15000);
    }

    @Override
    public double hitungBiayasewa() {
        return lamaSewa * hargaPerjam;
    }

    @Override 
    public void  tampilkanInfo(){
        System.out.println("Nama Penyewa: " + namaPenyewa);
        System.out.println("Lama Sewa : " + lamaSewa + " jam");
        System.out.println("Harga per Jam: Rp " + hargaPerjam);
        System.out.println("Total Harga Sewa: " + hitungBiayasewa());
    }

    @Override
    public void tampilkanBonus() {
        if(lamaSewa >= 6){
            System.out.println("Bonus : 1 paket snack gratis");
        } else {
            System.out.println("Bonus : Tidak ada bonus");
        }
    }
    
}
