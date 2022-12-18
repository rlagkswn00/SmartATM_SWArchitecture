package project.Products;


//이어폰 객체
public class Won_50000 implements Money {
    int price;
    int size;
    int count;
    boolean isValid;
    boolean isBill;

    public Won_50000(int count) {
        this.price = 10;
        this.count = count;
        this.size = 8;
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
