package project;

import project.Facotries.KoreaFactory;
import project.Facotries.MoneyF;
import project.Products.Cash;
import project.Products.Money;
import project.Products.Won;

public class ATM {
    public static void main(String[] args) {
        // 각 회사의 Factory 생성
        MoneyF koreaFactory = new KoreaFactory();
        Cash won = koreaFactory.createCash();
        won.getMoneyList().add(koreaFactory.createMoney(50000,"3"));
        won.getMoneyList().add(koreaFactory.createMoney(50000,"2"));
        System.out.println(won.getTotal());
    }
}
