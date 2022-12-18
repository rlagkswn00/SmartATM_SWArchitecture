package project.Adapter;

import project.Products.Money;

public class RecognizerAdapter implements Validity {

    private RecognizerController recognizerController;
    public RecognizerAdapter(RecognizerController rc) {
        recognizerController = rc;
    }

    @Override
    public void checkValidity(Money inputMoney) {
        int val = recognizerController.checkValidity(inputMoney);
        if(val == 1){
            inputMoney.setValid(true);
        } else {
            inputMoney.setValid(false);
        }

    }

}
