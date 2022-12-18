package project.Template;

import project.Products.Cash;

public abstract class CashExchange {

    public Cash ReturnOutput(Cash c){

        System.out.printf("%d 원이 다음과 같이 교환되었습니다.\n",c.getTotal());

        for(int i = 0; i < c.getMoneyList().size();i++)
                System.out.printf("%d 원\n",c.getMoneyList().get(i).getPrice());

        return c;
    }
    abstract boolean compareAmount(Cash tc,Cash c);
    abstract Cash getConbinationInput(MoneyStorage ms, Cash c);//event e로 교체 예정


}
