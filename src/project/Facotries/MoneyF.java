package project.Facotries;

import project.Products.IEarphone;
import project.Products.IPhone;
import project.Products.ITablet;

//전자기기 공장
public interface MoneyF {
    public IPhone createPhone();
    public ITablet createTablet();
    public IEarphone createEarphone();
}
