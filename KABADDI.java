public class KABADDI {
    String name;
    int age;
    void  playing (){

        System.out.println("plays KABADDI");
    }
}
class raider extends KABADDI {
    int raid_points;
    int super10;
    public raider(int raid_points,int super10,String name,int age){
        this.raid_points=raid_points;
        this.super10=super10;
        super.name=name;
        super.age=age;
    }

}
class defender extends KABADDI{
    int tackle_points;
    int super_tackles;
    public defender(int tackle_points,int super_tackles,String name,int age){
        this.super_tackles=super_tackles;
        this.tackle_points=tackle_points;
        super.name=name;
        super.age=age;
    }
}
class allrounder extends KABADDI{

    int raidpoints;
    int tacklepoints;
    public allrounder(int raidpoints,int tacklepoints,String name,int age){
        this.raidpoints=raidpoints;
        this.tacklepoints=tacklepoints;
        super.name=name;
        super.age=age;

    }
}