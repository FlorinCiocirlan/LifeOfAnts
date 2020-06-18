import java.util.ArrayList;

public class AntsMap{
    private static ArrayList<Entity>[][] map = new ArrayList[100][100];

    public static void addAnt(int x , int y, Entity ant){
        map[x][y].add(ant);
    }

    public static void removeAnt(int x, int y, Entity ant){
        map[x][y].remove(ant);
    }

    public static void moveAntForward(int x, int y, Entity ant, int steps){
        removeAnt(x,y,ant);
        map[x+steps][y].add(ant);
    }
    public static void moveAntBack(int x, int y, Entity ant, int steps){
        removeAnt(x,y,ant);
        map[x-steps][y].add(ant);
    }
    public static void moveAntUp(int x, int y, Entity ant, int steps){
        removeAnt(x,y,ant);
        map[x][y+steps].add(ant);
    }
    public static void moveAntDown(int x, int y, Entity ant, int steps){
        removeAnt(x,y,ant);
        map[x][y-steps].add(ant);
    }

    public Entity getAntPosition(Entity entity){
        for(int i = 0 ; i < map.length; i++){
            for(int j = 0; j<map[i].length; j++){
                if(map[i][j].contains(entity)){
                    return map[i][j].get(0);
                }
            }
        }
        return null;
    }

}
