import ch.aplu.jgamegrid.*;
public class Labyrinth {

    private final static int nbHorzCells = 29;
    private final static int nbVertCells = 20;
    public String[] map = {
            "00000000000000000000000000000",
            "00000111111111111111111100000",
            "01130101010000100001010103110",
            "01000101011111111111010100010",
            "01000101000100000100010100010",
            "01111111111111111111111111110",
            "00010100010100100101000101000",
            "01110113010101110101031101110",
            "01000100010101110101000100010",
            "01110100010100000101000101110",
            "01111111111111111111111111110",
            "01010010000100100100001001010",
            "01011010111100100111101011010",
            "01001010100001110000101010010",
            "01111011111101010111111011110",
            "00010010100111011100101001000",
            "01111110110101010101101111110",
            "01001010010101010101001010010",
            "01301011111101110111111010310",
            "00000000000000000000000000000",
    };

    public int[][] labyrinth = new int[nbHorzCells][nbVertCells];
    public Feld[][] felder = new Feld[nbHorzCells][nbVertCells];



    Labyrinth(){
        for(int y = 0; y < nbVertCells; y++) {
            for(int x = 0; x < nbHorzCells; x++){
                /*
                labyrinth[x][y] =(map[y].charAt(x) - '0'); // -'0' um es zum int zu machen
                */
                felder[x][y] =(new Feld(x ,y ,map[y].charAt(x) - '0'));

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
}
