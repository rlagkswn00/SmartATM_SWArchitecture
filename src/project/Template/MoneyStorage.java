package project.Template;

import project.Products.Cash;
import project.Products.Won;

import java.nio.file.Paths;
import java.util.ArrayList;

public class MoneyStorage implements StorageController {

    Cash storage_cash;

    public MoneyStorage(Cash storage_cash) {
        this.storage_cash = storage_cash;
    }

    @Override
    public boolean CheckAmount(Cash c) //d.totalprice는 앞 단계에서 계산한 총액
    {
        if (c.getTotal() <= this.storage_cash.getTotal())
            return true;
        else {
            //에러화면출력
            return false;
        }
    }

    @Override
    public boolean CheckTypeOfMoney(Cash c) {
        if(c.getCnt(50000) > storage_cash.getCnt(50000) ||
                c.getCnt(50000) > storage_cash.getCnt(50000) ||
                c.getCnt(10000) > storage_cash.getCnt(10000) ||
                c.getCnt(5000) > storage_cash.getCnt(5000) ||
                c.getCnt(1000) > storage_cash.getCnt(1000) ||
                c.getCnt(500) > storage_cash.getCnt(500) ||
                c.getCnt(100) > storage_cash.getCnt(100) ||
                c.getCnt(50) > storage_cash.getCnt(50) ||
                c.getCnt(10) > storage_cash.getCnt(10)){
            return false;
        }

        return true;
    }
}