public class MOBILEE {
    String name;
    int rate;
    void internet(){
        System.out.println("mobile phones");
    }

}
class Samsung extends MOBILEE {
    int android;
    int ram;

    public Samsung(int android, int ram, String name, int rate) {
        this.android = android;
        this.ram = ram;
        super.name = name;
        super.rate = rate;
    }
}
class Realme extends MOBILEE{
    String colour;
    int battery;

    public Realme(String colour,int battery,String name,int rate){
        this.colour=colour;
        this.battery=battery;
        super.name=name;
        super.rate=rate;
    }

}