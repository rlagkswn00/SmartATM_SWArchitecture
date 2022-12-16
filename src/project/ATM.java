package project;

import project.Facotries.AppleFactory;
import project.Facotries.SamsungFactory;
import project.Facotries.TechFactory;
import project.Products.IEarphone;
import project.Products.IPhone;
import project.Products.ITablet;

public class ATM {
    public static void main(String[] args) {
        // 각 회사의 Factory 생성
        TechFactory apple_tf = new AppleFactory("IPhone","IPad","Airpods",10);
        TechFactory sam_tf = new SamsungFactory("Galaxy S", "Galaxy Tab","Galaxy Buds",5);

        System.out.println("----------------------------\nAPPLE\n");
        //Apple 회사의 제품들 인스터스 생성
        IEarphone airpods = apple_tf.createEarphone();
        IPhone iphone = apple_tf.createPhone();
        ITablet ipad = apple_tf.createTablet();

        //구현한 메서드 테스트
        airpods.upVolume();
        airpods.upVolume();
        airpods.downVolume();

        iphone.getPhoneName();
        iphone.turnOn();
        iphone.turnOff();

        ipad.getTabletName();
        ipad.turnOn();
        ipad.turnOff();

        System.out.println("----------------------------\nSAMSUNG\n");
        //Samsung 회사의 제품들 인스턴스 생성
        IEarphone buds = sam_tf.createEarphone();
        IPhone galaxy = sam_tf.createPhone();
        ITablet galaxytab = sam_tf.createTablet();

        //구한현 메서드 테스트
        buds.upVolume();
        buds.upVolume();
        buds.downVolume();

        galaxy.getPhoneName();
        galaxy.turnOn();
        galaxy.turnOff();

        galaxytab.getTabletName();
        galaxytab.turnOn();
        galaxytab.turnOff();
    }
}
