package project.Products;

//핸드폰 객체
public class Phone implements IPhone {
    String phoneName;
    public Phone(String phoneName){
        this.phoneName = phoneName;
    }

    @Override
    public void getPhoneName() {
        System.out.println("핸드폰 이름은: " + this.phoneName);
    }

    @Override
    public void turnOn() {
        System.out.println(phoneName + " 핸드폰이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println(phoneName + " 핸드폰이 꺼졌습니다.");
    }
}
