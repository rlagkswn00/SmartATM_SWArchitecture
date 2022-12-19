package project;

import project.Products.Cash;
import project.Products.Money;

public class OutputController {
    public void output(Cash outputCash){
        for(Money i : outputCash.getMoneyList()){
            System.out.println(i.getPrice()+"원권 "+ i.getCount() + "장");
        }
    }
}
