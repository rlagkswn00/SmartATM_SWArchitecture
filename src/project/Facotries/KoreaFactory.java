package project.Facotries;

import project.Products.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class KoreaFactory implements MoneyF {
    private String country;
    private LinkedList<Money> moneyList = null;

    public KoreaFactory() {
        this.country = "Korea";
        moneyList = new LinkedList<Money>();
    }

    public Cash createCash() {
        return new Won(moneyList, country);
    }

    public Money createMoney(int amount, int count) {
        if (amount == 50000) {
            return new Won_50000(count);
        } else if (amount == 10000) {
            return new Won_10000(count);
        } else if (amount == 5000) {
            return new Won_5000(count);
        } else if (amount == 1000) {
            return new Won_1000(count);
        } else if (amount == 500) {
            return new Won_500(count);
        } else if (amount == 100) {
            return new Won_100(count);
        } else if (amount == 50) {
            return new Won_50(count);
        } else if (amount == 10) {
            return new Won_10(count);
        }
            return null;
    }
}
