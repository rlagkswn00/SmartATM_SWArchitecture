package project.Products;


//이어폰 객체
public class Won_100 implements Money {
    int price;
    int size;
    int count;
    boolean isValid;
    boolean isBill;

    public Won_100(int count) {
        this.price = 100;
        this.count = count;
        this.size = 3;
        this.isBill = false;
    }
    @Override
    public void setValid(boolean valid) {
        this.isValid = valid;
    }
    @Override
    public void setSize(int size){
        this.size=size;
    }
    @Override
    public int getMoneyTotal() {
        return price * count;
    }
    @Override
    public int getCount() {
        return count;
    }
    @Override
    public boolean getIsValid() {
        return isValid;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getSize() {
        return size;
    }


    @Override
    public boolean getIsBill() {
        return isBill;
    }
}
