package rentalbaju.model;

public class BajuAdat {
    private String idBaju;
    private String namaBaju;
    private String asalDaerah;
    private double hargaSewa;

    public BajuAdat(String idBaju, String namaBaju, String asalDaerah, double hargaSewa) {
        this.idBaju = idBaju;
        this.namaBaju = namaBaju;
        this.asalDaerah = asalDaerah;
        this.hargaSewa = hargaSewa;
    }

    public String getInfo() {
        return "ID: " + idBaju + " | Nama: " + namaBaju + " | Asal: " + asalDaerah + " | Harga: Rp" + hargaSewa;
    }

    public String getIdBaju() { return idBaju; }
    public void setIdBaju(String idBaju) { this.idBaju = idBaju; }
    public String getNamaBaju() { return namaBaju; }
    public void setNamaBaju(String namaBaju) { this.namaBaju = namaBaju; }
    public String getAsalDaerah() { return asalDaerah; }
    public void setAsalDaerah(String asalDaerah) { this.asalDaerah = asalDaerah; }
    public double getHargaSewa() { return hargaSewa; }
    public void setHargaSewa(double hargaSewa) { this.hargaSewa = hargaSewa; }
}