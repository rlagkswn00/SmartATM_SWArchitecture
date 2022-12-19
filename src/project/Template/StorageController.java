package project.Template;

import project.Products.Cash;
import project.Products.Money;

import java.util.ArrayList;

public interface StorageController {
    void inputStorage(Money inputCash);
    void outputStorage(Cash outputCash);

    boolean CheckAmount(Cash c);
    boolean CheckTypeOfMoney(Cash c); //t_arr는 gui 입력으로 들어오는 User의 조합식/큰 단위 순서대로 숫자 들어가있다고 가정(ex.10000원권 2장,1000원권 3장 = 0203)

}
