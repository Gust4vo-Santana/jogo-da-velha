package logic;

import static java.lang.Math.random;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import view.Table;

public class Game {

    private boolean over;
    private boolean p1Turn;

    Player p1 = new Player(Symbol.X);
    Player p2 = new Player(Symbol.O);

    List<Player> players = Arrays.asList(p1, p2);

    private void setGameOver() {
        this.over = true;
    }

    public void gameCycle() {

        p1Turn = 0 == Math.round(random());

        try (Scanner input = new Scanner(System.in)) {
            while (!over) {

                System.out.println(Table.displayTable());

                System.out.println("Posicao: ");

                int play = input.nextInt();

                players.get(p1Turn ? 0 : 1).play(play);

                gameOver();

                p1Turn = !p1Turn;
            }
        }

        System.out.println(Table.displayTable());

        if (tie()) {
            System.out.println("Deu velha!");
        } else {
            System.out.println("Fim de jogo! " + players.get(p1Turn ? 1 : 0).toString() + " venceu!");
        }
    }

    private void gameOver() {

        if (win() || tie()) {
            setGameOver();
        }
    }

    private boolean winByColumn() {
        return IntStream.of(0, 3, 6).anyMatch(s -> sameSymbol(s, s + 1, s + 2));
    }

    private boolean winByRow() {
        return IntStream.of(0, 1, 2).anyMatch(s -> sameSymbol(s, s + 3, s + 6));
    }

    private boolean winByDiagonal() {
        return sameSymbol(0, 4, 8) || sameSymbol(2, 4, 6);
    }

    private boolean win() {
        return winByColumn() || winByRow() || winByDiagonal();
    }

    private boolean tie() {
        return !(win()) && Table.positions.values().size() == 9;
    }

    private boolean sameSymbol(int a, int b, int c) {
        return Table.positions.get(a) != null
                && Table.positions.get(a).equals(Table.positions.get(b))
                && Table.positions.get(b).equals(Table.positions.get(c));
    }
}
