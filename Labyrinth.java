import ch.aplu.jgamegrid.*;
public class Labyrinth {

    private final static int nbHorzCells = 29;
    private final static int nbVertCells = 20;
    public int[][] labyrinth = new int[nbHorzCells][nbVertCells];


    Labyrinth(){
        String Zeile0 = "00000000000000000000000000000";
        String Zeile1 = "00000111111111111111111100000";
        String Zeile2 = "01130101010000100001010103110";
        String Zeile3 = "01000101011111111111010100010";
        String Zeile4 = "01000101000100000100010100010";
        String Zeile5 = "01111111111111111111111111110";
        String Zeile6 = "00010100010100100101000101000";
        String Zeile7 = "01110113010101110101031101110";
        String Zeile8 = "01001100010101110101000110010";
        String Zeile9 = "01110100010100000101000101110";
        String Zeile10 = "01111111111111111111111111110";
        String Zeile11 = "01010010000100100100001001010";
        String Zeile12 = "01011010111100100111101011010";
        String Zeile13 = "01001010100001110000101010010";
        String Zeile14 = "01111011111101010111111011110";
        String Zeile15 = "00010010100111011100101001000";
        String Zeile16 = "01111110110101010101101111110";
        String Zeile17 = "01001010010101010101001010010";
        String Zeile18 = "01301011111101110111111010310";
        String Zeile19 = "00000000000000000000000000000";






        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][0] =(Zeile0.charAt(x) - '0'); // -'0' um es zum int zu machen
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][1] =(Zeile1.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][2] =(Zeile2.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][3] =(Zeile3.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][4] =(Zeile4.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][5] =(Zeile5.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][6] =(Zeile6.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][7] =(Zeile7.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][8] =(Zeile8.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][9] =(Zeile9.charAt(x) - '0');
        }

        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][10] =(Zeile10.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][11] =(Zeile11.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][12] =(Zeile12.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][13] =(Zeile13.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][14] =(Zeile14.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][15] =(Zeile15.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][16] =(Zeile16.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][17] =(Zeile17.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][18] =(Zeile18.charAt(x) - '0');
        }
        for(int x = 0; x < nbHorzCells; x++){
            labyrinth[x][19] =(Zeile19.charAt(x) - '0');
        }






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
        /*
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
        */




    }


    public int getLocation(Location location) {
        return labyrinth[location.x][location.y];
    }

    public int[][] getLabyrinth() {
        return labyrinth;
    }
}
