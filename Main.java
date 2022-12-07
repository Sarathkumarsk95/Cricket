public class Main {
    public static void main(String[] args) {
        Batsman kohli=new Batsman(12000,59,"virat kohli",34);
        System.out.println("kohli age is"+kohli.age);
        System.out.println("kohli run is"+kohli.runs);

        Bowler bumrah=new Bowler(200,10,"bumrah",33);
        System.out.println("bumrah wickets is"+bumrah.wickets);
        System.out.println("bumrah maiden is"+bumrah.maiden);

    }
}