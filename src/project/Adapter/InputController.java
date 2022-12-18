package project.Adapter;


import project.Products.Money;

public class InputController {

    private Money inputMoney;
    private int totalCash = 0;
    private static Validity recognizerAdapter;

    public InputController(){
        this.recognizerAdapter = new RecognizerAdapter(new WonRecognizerController());
    }

    public Money InputCash(Money inputMoney) {
        this.inputMoney = inputMoney;
        this.recognizerAdapter.checkValidity(inputMoney);

        if (this.inputMoney.getIsValid()) {
            return this.inputMoney;

        } else {
            returnCash();

        }
    }

    public void returnCash() {
        System.out.println("Is not valid");
    }
}
