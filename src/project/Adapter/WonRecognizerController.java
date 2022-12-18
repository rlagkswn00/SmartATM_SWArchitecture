package project.Adapter;

import project.Products.*;

public class WonRecognizerController implements RecognizerController {

    private int validity;

    @Override
    public int checkValidity(Money inputMoney) {
        Won_10 won_10 = new Won_10(1);
        Won_50 won_50 = new Won_50(1);
        Won_100 won_100 = new Won_100(1);
        Won_500 won_500 = new Won_500(1);
        Won_1000 won_1000 = new Won_1000(1);
        Won_5000 won_5000 = new Won_5000(1);
        Won_10000 won_10000 = new Won_10000(1);
        Won_50000 won_50000 = new Won_50000(1);

        switch(inputMoney.getPrice()) {
            case 10:
                if(inputMoney.getSize() == won_10.getSize()) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            case 50:
                if(inputMoney.getSize() == won_50.getSize()) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            case 100:
                if(inputMoney.getSize() == won_100.getSize()) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            case 500:
                if(inputMoney.getSize() == won_500.getSize()) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            case 1000:
                if(inputMoney.getSize() == won_1000.getSize()) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            case 5000:
                if(inputMoney.getSize() == won_5000.getSize()) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            case 10000:
                if(inputMoney.getSize() == won_10000.getSize()) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            case 50000:
                if(inputMoney.getSize() == won_50000.getSize()) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
        }

        System.out.println("Bill is recognized");
        return this.validity;
    }

}
