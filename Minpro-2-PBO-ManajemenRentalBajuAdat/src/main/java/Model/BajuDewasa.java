package rentalbaju.model;

public class BajuDewasa extends BajuAdat {
    private String ukuran;

    public BajuDewasa(String idBaju, String namaBaju, String asalDaerah, double hargaSewa, String ukuran) {
        super(idBaju, namaBaju, asalDaerah, hargaSewa);
        this.ukuran = ukuran;
    }

    public String getUkuran() { return ukuran; }
    public void setUkuran(String ukuran) { this.ukuran = ukuran; }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Kategori: Dewasa (" + ukuran + ")";
    }
}