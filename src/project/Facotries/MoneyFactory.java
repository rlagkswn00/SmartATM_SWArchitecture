package project.Facotries;

import project.Products.Money;
import project.Products.Cash;

//전자기기 공장
public interface MoneyFactory {

    public Cash createCash();

    public Money createMoney(int amount, int count);
}
