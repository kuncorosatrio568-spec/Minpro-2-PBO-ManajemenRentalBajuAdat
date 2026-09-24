package rentalbaju;

import rentalbaju.controller.BajuController;
import rentalbaju.view.BajuView;

public class Main {
    public static void main(String[] args) {
        BajuController controller = new BajuController();
        BajuView view = new BajuView(controller);
        view.showMenu();
    }
}