
public class Main {
    public static void main(String[] args) {
        Player p0 = new Player("Maritza", 49, 0);
        Player p1 = new Player("Mila", 32, 1);
        Player p2 = new Player("Andy", 44, 2);
        Player p3 = new Player("Nicole", 8, 3);
        Player p4 = new Player("Austin", 7, 4);
        Player p5 = new Player("Jack", 5, 5);
        p0.setNetSkl(9,1);
        p1.setNetSkl(12,2);
        p2.setNetSkl(13,3);
        p3.setNetSkl(19,1);
        p4.setNetSkl(20,1);
        p5.setNetSkl(25,1);

        p0.setRecSkl(22,10);
        p1.setRecSkl(18,10);
        p2.setRecSkl(19,11);
        p3.setRecSkl(11,9);
        p4.setRecSkl(21,15);
        p5.setRecSkl(22,15);

        Team t1 = new Team("spiked punch");
        t1.addPlayer(p0);
        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(p4);
        t1.addPlayer(p5);

        Rotation rot1 = new Rotation(t1);
        rot1.displayStats();


    }
}