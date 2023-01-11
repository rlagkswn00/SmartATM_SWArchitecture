package project.Products;

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
