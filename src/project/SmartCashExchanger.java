package project;

import project.Adapter.*;
import project.Facotries.KoreaFactory;
import project.Facotries.MoneyFactory;
import project.GUI.default_gui;
import project.Products.Cash;
import project.Products.Money;
import project.Storage.MoneyStorage;
import project.Template.WonExchange;

import java.util.Scanner;

public class SmartCashExchanger {
    private static MoneyFactory moneyFactory;
    private static MoneyStorage moneyStorage;
    private static WonExchange wonExchange;
    private static InputController inputController;
    private static OutputController outputController;
    private static default_gui gui;

    public SmartCashExchanger() {
        moneyFactory = new KoreaFactory();
        Cash storageCash = moneyFactory.createCash();
        storageCash.getMoneyList().add(moneyFactory.createMoney(50000, 10));
        storageCash.getMoneyList().add(moneyFactory.createMoney(10000, 10));
        storageCash.getMoneyList().add(moneyFactory.createMoney(5000, 10));
        storageCash.getMoneyList().add(moneyFactory.createMoney(1000, 10));
        storageCash.getMoneyList().add(moneyFactory.createMoney(500, 10));
        storageCash.getMoneyList().add(moneyFactory.createMoney(100, 10));
        storageCash.getMoneyList().add(moneyFactory.createMoney(50, 10));
        storageCash.getMoneyList().add(moneyFactory.createMoney(10, 10));

        moneyStorage = new MoneyStorage(storageCash);
        wonExchange = new WonExchange();
        inputController = new InputController();
        outputController = new OutputController();
//        gui = new default_gui();
    }

    public static void main(String[] args) {
        SmartCashExchanger smartCashExchanger = new SmartCashExchanger();

        // 스크린의 버튼을 눌렀을 때 inputCash 실행하는 코드 필요함
        // 아래의 함수를 버튼을 눌렀을 때 버튼 클릭 이벤트에 할당해야 함

        while (true) {
            Cash inputCash = moneyFactory.createCash();
            Money inputMoney = null;

            while (true) {
                System.out.print("투입할 돈을 입력하시오(입력완료는 end, 교환기 종료는 exit): ");
                Scanner s = new Scanner(System.in);
                String input = s.nextLine();

                if (input.equals("end")) {
                    break;
                } else if (input.equals("exit")) {
                    System.out.println("교환기 종료.");
                    System.exit(0);

                } else {
                    // InputCash()를 실행하면서 Real, Fake에 따른 입금 금액 계산
                    inputMoney = inputController.InputCash(moneyFactory.createMoney(Integer.parseInt(input), 1));

                    //돈통 추가
                    moneyStorage.inputStorage(inputMoney);
                    //현재 들어온 데이터 추가
                    inputCash.getMoneyList().add(inputMoney);
                }
            }

            //확인된 지페 exchange함.
            Cash combinationOfOutput = wonExchange.getConbinationInput(moneyStorage, inputCash);

            //storage update함
            moneyStorage.outputStorage(combinationOfOutput);

            //교환 후 출력
            outputController.output(combinationOfOutput);

        }

    }

}
