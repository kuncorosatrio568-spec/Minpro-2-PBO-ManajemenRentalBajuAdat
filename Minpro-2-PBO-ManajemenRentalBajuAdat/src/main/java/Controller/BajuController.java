package rentalbaju.controller;

import java.util.ArrayList;
import rentalbaju.model.BajuAdat;
import rentalbaju.model.BajuAnak;
import rentalbaju.model.BajuDewasa;

public class BajuController {
    private ArrayList<BajuAdat> listBaju = new ArrayList<>();

    public BajuController() {
        // Dummy data awal
        listBaju.add(new BajuAnak("B01", "Baju Bodo Anak", "Sulawesi Selatan", 100000, "6-8 Tahun"));
        listBaju.add(new BajuDewasa("B02", "Ulos Dewasa", "Sumatera Utara", 200000, "L"));
    }

    public ArrayList<BajuAdat> getAllBaju() {
        return listBaju;
    }

    public void tambahBaju(BajuAdat baju) {
        listBaju.add(baju);
    }

    public BajuAdat cariBaju(String id) {
        for (BajuAdat b : listBaju) {
            if (b.getIdBaju().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }

    public boolean hapusBaju(String id) {
        BajuAdat b = cariBaju(id);
        if (b != null) {
            listBaju.remove(b);
            return true;
        }
        return false;
    }
}