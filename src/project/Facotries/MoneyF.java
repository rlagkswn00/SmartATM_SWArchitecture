package project.Facotries;

import project.Products.Money;
import project.Products.Cash;

import java.util.ArrayList;

//전자기기 공장
public interface MoneyF {

    public Cash createCash();

    public Money createMoney(int amount, String serialNum);
}
