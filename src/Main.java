import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Project 3 for CECS 328
 * @Author Mark Garcia
 *         mark.garcia.8001@gmail.com
 */
public class Main {
    /**
     * Driver class for the program
     * @param args
     */
    public static void main(String[] args){
        char[][] nx2 = new char[2][12];
        ArrayList<Character> possibleTiles = new ArrayList<>();
        possibleTiles.add('x');
        possibleTiles.add('+');
        possibleTiles.add('-');


        for(int i = 0; i < nx2.length; i++){
            for(int j = 0; j < nx2[i].length; j++){
                nx2[i][j] = possibleTiles.get((int) Math.random()*3);
            }
        }

        for(int k = 0; k < nx2.length; k++){
            for(int l = 0; l < nx2[k].length; l++){
                System.out.println(nx2[k][l] + " ");
            }
        }

        Board board = new Board(nx2, 4);

    }

    public static class Board{
        private char[][] mnboard;
        private int numMags;

        public Board (char[][] nx2, int mag){
            this.mnboard = nx2;
            this.numMags = mag;
        }

        public void placeMagnets(){

        }

    }
}
