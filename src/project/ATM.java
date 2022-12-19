package project;

import project.Adapter.*;
import project.Facotries.KoreaFactory;
import project.Facotries.MoneyF;
import project.GUI.default_gui;
import project.Products.Cash;
import project.Products.Money;
import project.Template.MoneyStorage;
import project.Template.WonExchange;

import java.util.Scanner;

public class ATM {
    private static MoneyF moneyFactory;
    private static MoneyStorage moneyStorage;
    private static WonExchange wonExchange;
    private static InputController inputController;
    private static default_gui gui;
    public ATM() {
        moneyFactory = new KoreaFactory();
        Cash storageCash = moneyFactory.createCash();
        for (int i = 0; i < 10; i++) {
            storageCash.getMoneyList().add(moneyFactory.createMoney(50000, i));
            storageCash.getMoneyList().add(moneyFactory.createMoney(10000, i));
            storageCash.getMoneyList().add(moneyFactory.createMoney(5000, i));
            storageCash.getMoneyList().add(moneyFactory.createMoney(1000, i));
            storageCash.getMoneyList().add(moneyFactory.createMoney(500, i));
            storageCash.getMoneyList().add(moneyFactory.createMoney(100, i));
            storageCash.getMoneyList().add(moneyFactory.createMoney(50, i));
            storageCash.getMoneyList().add(moneyFactory.createMoney(10, i));
        }
        moneyStorage = new MoneyStorage(storageCash);
        wonExchange = new WonExchange();
        inputController = new InputController();
        gui = new default_gui();
    }

    public static void main(String[] args) {
        ATM atm = new ATM();

        // 스크린의 버튼을 눌렀을 때 inputCash 실행하는 코드 필요함
        // 아래의 함수를 버튼을 눌렀을 때 버튼 클릭 이벤트에 할당해야 함
        Cash input_won = moneyFactory.createCash();
        Scanner s = new Scanner(System.in);

        //임시 인풋 요청이 들어옴.
        String input = s.nextLine();
        Money inputMoney = moneyFactory.createMoney(Integer.parseInt(input),10);
        System.out.println(inputMoney.getMoneyTotal());

        // InputCash()를 실행하면서 Real, Fake에 따른 입금 금액 계산
        inputMoney = inputController.InputCash(inputMoney);
        System.out.println(input_won.getTotal());
        //확인된 지폐 임시 입력 50000원권 10장 투입함.
        input_won.getMoneyList().add(inputMoney);
        System.out.println(input_won.getTotal());

        Cash output = wonExchange.ReturnOutput(wonExchange.getConbinationInput(moneyStorage, input_won));

        //교환 후 출력
        System.out.println(output.getTotal());
    }

}
