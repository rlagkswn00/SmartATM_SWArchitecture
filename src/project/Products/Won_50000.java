package project.Products;

//이어폰 객체
public class Earphone implements IEarphone {
    int volume;
    String name;
    public Earphone(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    @Override
    public void upVolume() {
        this.volume++;
        System.out.println(this.name + "현재 볼륨: " + this.volume);

    }

    @Override
    public void downVolume() {
        this.volume--;
        System.out.println(this.name + "현재 볼륨: " + this.volume);
    }
}
