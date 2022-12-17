package project.Products;


//이어폰 객체
public class Won_10000 implements Money {
    int price;
    String serialNum;
    int size;
    boolean isBill;

    public Won_10000(String serialNum) {
        this.price = 10000;
        this.serialNum = serialNum;
        this.size = 9;
        this.isBill = true;
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
