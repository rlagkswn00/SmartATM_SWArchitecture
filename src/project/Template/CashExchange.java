package project.Template;

import project.Products.Cash;

public abstract class CashExchange {
    abstract boolean compareAmount(Cash tc,Cash c);
    abstract Cash getConbinationInput(MoneyStorage ms, Cash c);//event e로 교체 예정


}
