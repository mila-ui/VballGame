import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Rotation {
    //this lineup tells you the player's numbers. I.e. Mila # = 22, the lineup would look like [22, 31, 56, 22, 3, 8]
    private int[] lineUp;
    //Integer is the rotation # (how much they've rotated), double is the stats on that rotation [netskl, recieveskl]
    Dictionary<Integer, double[]> Stats;
    private Team teamUsed;


    Player[] initRotation = new Player[6];
    Player[] tempRot = new Player[6];

    public Rotation(Team t) {
        this.teamUsed = t;
        this.Stats = new Hashtable<>();

        //initalizes rotation that will be used when rotating
        initRotation();
        resetRotation();


    }
    public void initRotation(){
        for(int i = 0 ; i < 6; i ++){
            initRotation[i] = teamUsed.teamMembers.get(i);
        }
    }

    public double getNetSkl(){
        double net_Skill = tempRot[3].NetSkl() + tempRot[4].NetSkl() + tempRot[5].NetSkl();

        net_Skill = net_Skill/3;
        if(tempRot[3].getSpkSkl() > 5 || tempRot[5].getSpkSkl() > 5){
            net_Skill += 1;
        }
        return net_Skill;
    }
    public double getRecSkl(){
        double rec_Skill = tempRot[0].RecSkl() + tempRot[1].RecSkl() + tempRot[2].RecSkl();
        rec_Skill = rec_Skill/3;
        return rec_Skill;
    }
    public double getStats(){
        return 0;
    }


    public void rotate(){
        //resets rotation beforehand just in case

        /* Prints the og rotation
        for(int i = 0; i < tempRot.length; i ++){
            System.out.print(arr[i] + " ");
        }*/

        //temporary variables
        Player last = tempRot[5];
        //makes a temp. array that can be used for rotation
        Player[] tempArr = new Player[6];

        for(int j = 1; j <= tempRot.length - 1; j++) {
            tempArr[j] = tempRot[j - 1];
        }
        tempArr[0] = last;
        tempRot = tempArr;

    }
    public void resetRotation(){
        //Resets temporary positions to the inital positions
        tempRot = initRotation.clone();
    }

    public void displayBoard(Player[] rotUse){
        System.out.println("---------------net--------------");
        System.out.println("          "+ rotUse[3].getName()+"    "+ rotUse[4].getName()+"    "+ rotUse[5].getName());
        System.out.println("          "+ rotUse[2].getName()+"    "+rotUse[1].getName()+"    "+rotUse[0].getName());
    }

    public void displayStats(){
        for(int i = 0; i < 5; i ++){
            rotate();
            System.out.println(i + " : ");
            System.out.println("Net Skl: " + getNetSkl());
            System.out.println("Recieve Skl: " + getRecSkl());
            displayBoard(tempRot);
        }
    }
}
