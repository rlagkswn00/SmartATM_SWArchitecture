package project.Products;
//이어폰 인터페이스
public interface Money {
    public int getPrice();
    public int getMoneyTotal();
    public int getSize();
    public int getCount();
    public void setSize(int size);
    public void setValid(boolean valid);
    public boolean getIsBill();
    public boolean getIsValid();

}
