package project.Storage;

import project.Products.Cash;
import project.Products.Money;

import java.util.ArrayList;

public interface StorageController {
    void inputStorage(Money inputCash);
    void outputStorage(Cash outputCash);
    boolean CheckAmount(Cash c);
    boolean CheckTypeOfMoney(Cash c);
}
