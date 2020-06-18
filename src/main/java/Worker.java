public class Worker extends Entity{
    public Worker(int x , int y){
        super(x,y);
    }

    public void move(int randomNumber){
        if (randomNumber == 0){
            AntsMap.moveAntForward(this.getX(),this.getY(),this,1);
        } else if(randomNumber == 1){
            AntsMap.moveAntBack(this.getX(),this.getY(),this,1);
        } else if(randomNumber == 2){
            AntsMap.moveAntUp(this.getX(),this.getY(),this,1);
        } else {
            AntsMap.moveAntDown(this.getX(),this.getY(),this,1);
        }
    }
}
