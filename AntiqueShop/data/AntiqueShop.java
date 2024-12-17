package data;

import businessLogic.inventoryManager;


public class AntiqueShop {
    inventoryManager invToAnt = new inventoryManager();
    public void ShowAllAntiques(){
        invToAnt.readingData();
        invToAnt.getAllAntiques();

    }
}
