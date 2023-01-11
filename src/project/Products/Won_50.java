package project.Products;



public class Won_50 implements Money {
    int price;
    int count;
    int size;
    boolean isValid;
    boolean isBill;

    public Won_50(int count) {
        this.price = 50;
        this.count = count;
        this.size = 2;
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
    public boolean getIsValid() {
        return isValid;
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
