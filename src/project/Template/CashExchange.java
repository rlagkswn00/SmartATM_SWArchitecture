package project.Template;

import project.Products.Cash;
import project.Storage.MoneyStorage;

public abstract class CashExchange {
    abstract boolean compareAmount(Cash tc,Cash c);
    abstract Cash getConbinationInput(MoneyStorage ms, Cash c);
}
