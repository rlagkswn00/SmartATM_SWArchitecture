package project.Products;

import java.util.LinkedList;

public interface Cash {
    public LinkedList<Money> getMoneyList();
    public String getCountry();
    public int getTotal();
    public int getCnt(int amount);
    public Money getMoneyFromMoneyList(int amount);
}
