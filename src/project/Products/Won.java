package project.Products;

import java.util.ArrayList;
import java.util.LinkedList;


//핸드폰 객체
public class Won implements Cash {
    LinkedList<Money> moneyList = null;
    String country;


    public Won(LinkedList<Money> moneyList, String country){
        this.moneyList = moneyList;
        this.country = country;

    }

    @Override
    public int getCnt(int amount) {
        int cnt = 0;
        for(Money i:moneyList){
            if(i.getPrice() == amount) cnt++;
        }
        return cnt;
    }

    @Override
    public int getTotal() {
        int total=0;
        for(Money i:moneyList){
            total+=i.getPrice();
        }
        return total;
    }

    @Override
    public LinkedList<Money> getMoneyList() {
        return moneyList;
    }

    @Override
    public String getCountry() {
        return country;
    }
}