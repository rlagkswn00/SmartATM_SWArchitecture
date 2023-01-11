package project.Adapter;

import project.Products.*;

public class WonRecognizerController implements RecognizerController {

    private int validity;

    @Override
    public int checkValidity(Money inputMoney) {
        switch (inputMoney.getPrice()) {
            case 10: {
                if (inputMoney.getSize() == 1) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            }
            case 50: {
                if (inputMoney.getSize() == 2) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            }
            case 100: {
                if (inputMoney.getSize() == 3) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            }
            case 500:{
                if (inputMoney.getSize() == 4) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            }
            case 1000:{
                if (inputMoney.getSize() == 5) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            }
            case 5000:{
                if (inputMoney.getSize() == 6) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            }
            case 10000:{
                if (inputMoney.getSize() == 7) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            }
            case 50000:{
                if (inputMoney.getSize() == 8) {
                    this.validity = 1;
                } else {
                    this.validity = 0;
                }
                break;
            }
        }
        System.out.println("Bill is recognized");
        return this.validity;
    }

}
