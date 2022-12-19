package project.Products;

import java.util.LinkedList;

//핸드폰 인터페이스
public interface Cash {
    public LinkedList<Money> getMoneyList();
    public String getCountry();
    public int getTotal();
    public int getCnt(int amount);
    public Money getMoneyFromMoneyList(int amount);
}
