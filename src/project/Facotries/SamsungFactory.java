package project.Facotries;

import project.Products.Earphone;
import project.Products.Phone;
import project.Products.Tablet;
import project.Products.IEarphone;
import project.Products.IPhone;
import project.Products.ITablet;

//Samsung Facotory
public class SamsungFactory implements TechFactory {
    String phone_name;
    String tablet_name;
    String earphone_name;
    int vol;

    public SamsungFactory(String phone_name, String tablet_name,String earphone_name, int vol){
        this.vol = vol;
        this.phone_name = "[SAMSUNG]" + phone_name;
        this.tablet_name = "[SAMSUNG]" + tablet_name;
        this.earphone_name = "[SAMSUNG]" + earphone_name;
    }

    @Override
    public IPhone createPhone() {
        return new Phone(this.phone_name);
    }

    @Override
    public ITablet createTablet() {
        return new Tablet(this.tablet_name);
    }

    @Override
    public IEarphone createEarphone() {
        return new Earphone(this.vol,this.earphone_name);
    }

}
