package rentalbaju.model;

public class BajuAnak extends BajuAdat {
    private String rentangUsia;

    public BajuAnak(String idBaju, String namaBaju, String asalDaerah, double hargaSewa, String rentangUsia) {
        super(idBaju, namaBaju, asalDaerah, hargaSewa);
        this.rentangUsia = rentangUsia;
    }

    public String getRentangUsia() { return rentangUsia; }
    public void setRentangUsia(String rentangUsia) { this.rentangUsia = rentangUsia; }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Kategori: Anak-anak (" + rentangUsia + ")";
    }
}
