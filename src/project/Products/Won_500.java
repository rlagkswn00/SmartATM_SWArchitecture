package project.Products;



public class Won_500 implements Money {
    int price;
    int size;
    int count;
    boolean isValid;
    boolean isBill;

    public Won_500(int count) {
        this.price = 500;
        this.count = count;
        this.size = 4;
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
