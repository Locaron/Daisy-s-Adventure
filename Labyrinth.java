import ch.aplu.jgamegrid.*;

public class Labyrinth {

    private final static int nbHorzCells = 29;
    private final static int nbVertCells = 20;
    public String[] map = {
            "00000000000000000000000000000",
            "00000111111111111111111100000",
            "01130101010000100001010104110",
            "01000101011111111111010100010",
            "01000101000100000100010100010",
            "01111111111111111111111111110",
            "00010100010100000101000101000",
            "01110115010102220101061101110",
            "01000100010102220101000100010",
            "01110100010100000101000101110",
            "01011111111111111111111111010",
            "01010010000100100100001001010",
            "01011010111100100111101011010",
            "01001010100001210000101010010",
            "01111011111101010111111011110",
            "00010010100111011100101001000",
            "01111110110101010101101111110",
            "01001010010101010101001010010",
            "01701011111101110111111010810",
            "00000000000000000000000000000",
    };

    public int[][] labyrinth = new int[nbHorzCells][nbVertCells];
    public Feld[][] felder = new Feld[nbHorzCells][nbVertCells];
    public Location[][] portals = new Feld[3][2];


    Labyrinth() {
        for (int y = 0; y < nbVertCells; y++) {
            for (int x = 0; x < nbHorzCells; x++) {
                /*
                labyrinth[x][y] =(map[y].charAt(x) - '0'); // -'0' um es zum int zu machen
                */
                felder[x][y] = (new Feld(x, y, map[y].charAt(x) - '0'));

                switch (felder[x][y].getFeldart()) {
                    case FeldArt.PORTAL1_1:
                        portals[0][0] = felder[x][y];
                        break;
                    case FeldArt.PORTAL1_2:
                        portals[0][1] = felder[x][y];
                        break;
                    case FeldArt.PORTAL2_1:
                        portals[1][0] = felder[x][y];
                        break;
                    case FeldArt.PORTAL2_2:
                        portals[1][1] = felder[x][y];
                        break;
                    case FeldArt.PORTAL3_1:
                        portals[2][0] = felder[x][y];
                        break;
                    case FeldArt.PORTAL3_2:
                        portals[2][1] = felder[x][y];
                        break;
                }
            }
        }
    }

    public int getLocation(Location location) {
        return labyrinth[location.x][location.y];
    }

    public int[][] getLabyrinth() {
        return labyrinth;
    }

    public Feld[][] getFelder() {
        return felder;
    }

    public Location[][] getPortals() {
        return portals;
    }
}
