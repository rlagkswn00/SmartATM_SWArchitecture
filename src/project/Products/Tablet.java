package project.Products;

//태블릭 클래스
public class Tablet implements ITablet {
    String TabletName;

    public Tablet(String TabletName){
        this.TabletName = TabletName;
    }
    @Override
    public void getTabletName() {
        System.out.println("태블릿 이름은: " + this.TabletName);

    }

    @Override
    public void turnOn() {
        System.out.println(TabletName + " 테블릿이 켜졌습니다.");

    }

    @Override
    public void turnOff() {
        System.out.println(TabletName + " 테블릿이 켜졌습니다.");

    }
}
