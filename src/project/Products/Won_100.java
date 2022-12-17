package project.Products;


//이어폰 객체
public class Won_100 implements Money {
    int price;
    String serialNum;
    int size;
    boolean isBill;

    public Won_100(String serialNum) {
        this.price = 100;
        this.serialNum = serialNum;
        this.size = 3;
        this.isBill = false;
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
    public String getSerialNum() {
        return serialNum;
    }

    @Override
    public boolean getIsCash() {
        return isBill;
    }
}
