package project.Template;

import project.Facotries.KoreaFactory;
import project.Facotries.MoneyF;
import project.Products.Cash;
import project.Products.Money;

public class WonExchange extends CashExchange {
    @Override
    public Cash getConbinationInput(MoneyStorage ms, Cash inputCash) {
        //event e를 받아서(gui에서 유저가 조합을 입력하면), 그 조합을 int[] t_arr로 반환하는 과정 추가해야 함.
        //t_arr는 큰 단위 순서대로 숫자 들어가있다고 가정(ex.10000원권 2장,1000원권 5장 = 0205)

        //조합값으로 받은 돈 생성
        MoneyF koreaFactory = new KoreaFactory();
        Cash combinationForOutput = koreaFactory.createCash();
        combinationForOutput.getMoneyList().add(koreaFactory.createMoney(10000, 50));

        //Storage의 총합과 금액권 확인
        if (!ms.CheckAmount(inputCash)) {
            System.out.println("Storage의 총액이 충분하지 않습니다!");
            System.exit(0);
        }
        if (!ms.CheckTypeOfMoney(combinationForOutput)) {
            System.out.println("Storage의 금액권이 충분하지 않습니다!");
            System.exit(0);
        }
        if (!compareAmount(combinationForOutput, inputCash)) {
            System.out.println("선택하신 조합의 총액과 넣으신 현금의 총액이 같지 않습니다!");
            System.exit(0);
        }

        return combinationForOutput;
    }

    @Override
    public boolean compareAmount(Cash tc, Cash c) {
        if (c.getTotal() != tc.getTotal()) {
            return false;
        } else {
            return true;
        }
    }

}
