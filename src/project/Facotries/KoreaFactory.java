package project.Facotries;

import project.Products.*;
import java.util.LinkedList;

public class KoreaFactory implements MoneyFactory {
    private String country;

    public KoreaFactory() {
        this.country = "Korea";

    }
    public Cash createCash() {
        return new Won(new LinkedList<Money>(), country);
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