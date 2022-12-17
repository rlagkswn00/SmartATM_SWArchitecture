package project.Products;


//이어폰 객체
public class Won_5000 implements Money {
    int price;
    String serialNum;
    int size;
    boolean isBill;

    public Won_5000(String serialNum) {
        this.price = 5000;
        this.serialNum = serialNum;
        this.size = 8;
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
