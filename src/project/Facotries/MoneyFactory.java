package project.Facotries;

import project.Products.Money;
import project.Products.Cash;

public interface MoneyFactory {

    public Cash createCash();

    public Money createMoney(int amount, int count);
}
