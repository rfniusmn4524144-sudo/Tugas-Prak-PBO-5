public abstract class RentalPS {
    protected String namaPenyewa;
    protected int lamaSewa;
    protected double hargaPerjam;

    public RentalPS(String namaPenyewa, int lamaSewa, double hargaPerjam) {
        this.namaPenyewa = namaPenyewa;
        this.lamaSewa = lamaSewa;
        this.hargaPerjam = hargaPerjam;
    }

    public abstract double hitungBiayasewa();
    public abstract void tampilkanInfo();
    
}
