package project.Products;


//이어폰 객체
public class Won_10 implements Money {
    int price;
    int size;
    int count;
    boolean isValid;
    boolean isBill;

    public Won_10(int count) {
        this.price = 10;
        this.count = count;
        this.size = 1;
        this.isBill = false;
    }

    @Override
    public void setValid(boolean valid) {
        this.isValid = valid;
    }

    public void setSize(int size){
        this.size=size;
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
    public int getCount() {
        return count;
    }

    @Override
    public int getMoneyTotal() {
        return price * count;
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
