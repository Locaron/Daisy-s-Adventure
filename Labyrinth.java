import ch.aplu.jgamegrid.*;
public class Labyrinth {

    private final static int nbHorzCells = 29;
    private final static int nbVertCells = 20;
    public int[][] labyrinth = new int[nbHorzCells][nbVertCells];


    Labyrinth(){
        /*
        String maze =
                        "xxxxxxxxxxxxxxx" + // 0
                        "xxxxxxxxxxxxxxx" + // 1
                        "xx............x" + // 2
                        "xx.xxxx.xxxxx.x" + // 3
                        "xx.xxxx.xxxxx.x" + // 4
                        "xx.xxxx.xxxxx.x" + // 5
                        "xx............." + // 6
                        "xx.xxxx.xx.xxxx" + // 7
                        "xx.xxxx.xx.xxxx" + // 8
                        "xx......xx....x" + // 9
                        "xxxxxxx.xxxxx x" + // 10
                        "xxxxxxx.xxxxx x" + // 11
                        "xxxxxxx.xx     " + // 12
                        "xxxxxxx.xx xxxx" + // 13
                        "xxxxxxx.xx xxxx" + // 14
                        "xx     .   xxxx" + // 15
                        "xxxxxxx.xx xxxx" + // 16
                        "xxxxxxx.xx xxxx" + // 17
                        "xxxxxxx.xx     " + // 18
                        "xxxxxxx.xx xxxx" + // 19
                        "xxxxxxx.xx xxxx";// 20

        for (int i = 0; i < nbVertCells; i++)
        {
            for (int k = 0; k < nbHorzCells / 2; k++)
                Labyrinth[i][k] = toInt(maze.charAt(15 * i + k));
            for (int k = nbHorzCells / 2; k < nbHorzCells; k++)
                Labyrinth[i][k] = toInt(maze.charAt(15 * i + (29 - k)));
        }

        */

        for(int x = 0; x < nbHorzCells; x++){
            for(int y= 0; y < nbVertCells; y++){
                labyrinth[x][y] = FeldArt.EAT;
            }
        }

        //AußenWall
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][0] = FeldArt.WALL;
            labyrinth[x][19] = FeldArt.WALL;
        }

        for(int y = 0; y < nbVertCells; y++){
            labyrinth[0][y] = FeldArt.WALL;
            labyrinth[28][y] = FeldArt.WALL;
        }

        labyrinth[1][1] = FeldArt.PORTAL;
        labyrinth[2][2] = FeldArt.WALL;
        labyrinth[3][3] = FeldArt.TERRAIN;




    }


    public int getLocation(Location location) {
        return labyrinth[location.x][location.y];
    }

    public int[][] getLabyrinth() {
        return labyrinth;
    }
}
