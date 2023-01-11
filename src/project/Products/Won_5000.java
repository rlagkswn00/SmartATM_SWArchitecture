package project.Products;



public class Won_5000 implements Money {
    int price;
    int size;
    int count;
    boolean isValid;
    boolean isBill;

    public Won_5000(int count) {
        this.price = 5000;
        this.count = count;
        this.size = 6;
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
