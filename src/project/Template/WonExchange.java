package project.Template;

import project.Facotries.KoreaFactory;
import project.Facotries.MoneyFactory;
import project.Products.Cash;
import project.Storage.MoneyStorage;

import java.util.Scanner;

public class WonExchange extends CashExchange {
    @Override
    public Cash getConbinationInput(MoneyStorage ms, Cash inputCash) {
        //event e를 받아서(gui에서 유저가 조합을 입력하면), 그 조합을 int[] t_arr로 반환하는 과정 추가해야 함.
        //t_arr는 큰 단위 순서대로 숫자 들어가있다고 가정(ex.10000원권 2장,1000원권 5장 = 0205)
        Cash combinationForOutput;
        while (true) {
            //조합값으로 받은 돈 생성
            MoneyFactory koreaFactory = new KoreaFactory();
            combinationForOutput = koreaFactory.createCash();
            System.out.println("투입 총액: " + inputCash.getTotal());
            System.out.print("원하는 교환 조합을 입력하시오. (1 2 0 3 1 1 2 2): ");
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            String[] input_arr = input.split(" ");

            combinationForOutput.getMoneyList().add(koreaFactory.createMoney(50000, Integer.parseInt(input_arr[0])));
            combinationForOutput.getMoneyList().add(koreaFactory.createMoney(10000, Integer.parseInt(input_arr[1])));
            combinationForOutput.getMoneyList().add(koreaFactory.createMoney(5000, Integer.parseInt(input_arr[2])));
            combinationForOutput.getMoneyList().add(koreaFactory.createMoney(1000, Integer.parseInt(input_arr[3])));
            combinationForOutput.getMoneyList().add(koreaFactory.createMoney(500, Integer.parseInt(input_arr[4])));
            combinationForOutput.getMoneyList().add(koreaFactory.createMoney(100, Integer.parseInt(input_arr[5])));
            combinationForOutput.getMoneyList().add(koreaFactory.createMoney(50, Integer.parseInt(input_arr[6])));
            combinationForOutput.getMoneyList().add(koreaFactory.createMoney(10, Integer.parseInt(input_arr[7])));

            System.out.println(combinationForOutput.getTotal());
            //Storage의 총합과 금액권 확인
            if (!ms.CheckAmount(inputCash)) {
                System.out.println("Storage의 총액이 충분하지 않습니다!");
                continue;
            }
            if (!ms.CheckTypeOfMoney(combinationForOutput)) {
                System.out.println("Storage의 금액권이 충분하지 않습니다!");
                continue;
            }
            if (!compareAmount(combinationForOutput, inputCash)) {
                System.out.println("선택하신 조합의 총액과 넣으신 현금의 총액이 같지 않습니다!");
                continue;
            }
                break;
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
