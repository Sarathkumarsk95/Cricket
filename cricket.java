public class cricket {
    String name;
    int age;

    void playing()
    {
        System.out.println("plays cricket");
    }
}

class Batsman extends cricket
{
    int runs;
            int fifties;

    public Batsman(int runs, int fifties,String name,int age) {
        this.runs = runs;
        this.fifties = fifties;
        super.age=age;
        super.name=name;
    }

}
class Bowler extends cricket
{
    int wickets;
    int maiden;

    public Bowler(int wickets,int maiden,String name,int age){
        this.wickets=wickets;
        this.maiden=maiden;
        super.name=name;
        super.age=age;


    }



}
