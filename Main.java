public class Main {
    public static void main(String[] args)
    {
        raider Ajinkya=new raider(22,5,"Ajinkya",28);
        System.out.println("Ajinkya raid points is"+Ajinkya.raid_points);
        System.out.println("Ajinkya super10 is"+Ajinkya.super10);

        defender sarath=new defender(55,9,"sarath",25);
        System.out.println("sarath tackle point is:"+sarath.tackle_points);

        allrounder narender=new allrounder(88,22,"narender",22);
        System.out.println("narender tacklepoints is:"+narender.tacklepoints);


    }
}