public class Player {
    private String name;
    private int number;
    //inital position used for all players.
    private int initPos;
    //temporary Position used for rotating
    public int tempPos;

    private double netSkl;
    private double recSkl;
    private double spkSkl;

    public Player(){
        this.name = "";
        this.number = 0;
        this.initPos = 0;
        this.netSkl = 0;
        this.recSkl = 0;
        this.spkSkl = 0;
    }

    public Player(String name, int number, int pos) {
        this.name = name;
        this.number = number;
        this.initPos = pos;
        this.netSkl = 0;
        this.recSkl = 0;
        this.spkSkl = 0;
    }

    public void shiftPos(){
        if(tempPos == 6){
            tempPos = 0;
        }
        else {
            this.tempPos++;
        }
    }

    //setting using given data
    public void setNetSkl(int blocks, int miss) {
        this.netSkl = (double) blocks /(miss+blocks)*10;
    }
    public void setRecSkl(int rec, int miss) {
        this.recSkl = (double) rec /(miss+rec)*10;
    }
    public void setSpkSkl(int spk, int miss) {
        this.spkSkl = (double) spk /(miss+spk)*10;
    }

    //getting functions
    public double NetSkl() {
        return netSkl;
    }
    public double RecSkl() {
        return recSkl;
    }
    public double getSpkSkl() {
        return spkSkl;
    }

    public void setPos(int p){
        this.initPos = p;
    }
    public int getPos(){
        return initPos;
    }
    public String getName() {
        return name;
    }
    public String details(){
        String detail = "";
        detail += "-------" + name + "-------\n";
        detail += "Number: " + number + "\n";
        detail += "Pos: " + initPos + "\n";
        return detail;
    }
}
