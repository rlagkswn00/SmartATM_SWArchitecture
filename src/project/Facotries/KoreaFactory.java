package project.Facotries;

import project.Products.Earphone;
import project.Products.Phone;
import project.Products.Tablet;

//Apple Factory
public class AppleFactory implements TechFactory {
    String phone_name;
    String tablet_name;
    String earphone_name;
    int vol;

    public AppleFactory(String phone_name, String tablet_name,String earphone_name, int vol){
        this.vol = vol;
        this.phone_name = "[APPLE]" + phone_name;
        this.tablet_name = "[APPLE]" + tablet_name;
        this.earphone_name = "[APPLE]" + earphone_name;
    }
    @Override
    public Phone createPhone() {
        return new Phone(this.phone_name);
    }

    @Override
    public Tablet createTablet() {
        return new Tablet(this.tablet_name);
    }

    @Override
    public Earphone createEarphone() {
        return new Earphone(this.vol,this.earphone_name);
    }
}
