public class Soldier extends Entity{
    public Soldier(int x, int y){
        super(x,y);
    }
    public void move(){
        AntsMap.moveAntUp(this.getX(),this.getY(),this,1);
        AntsMap.moveAntBack(this.getX(),this.getY(),this,1);
        AntsMap.moveAntDown(this.getX(),this.getY(),this,1);
        AntsMap.moveAntForward(this.getX(),this.getY(),this,1);
    }

}

