package Behaviorial.TemplateMethod;

// Abstract Class with Template Method
abstract class Game {
    // Template method
    public final void playGame() {
        start();
        play();
        end();
    }

    // Steps of the algorithm, some of which will be defined by subclasses
    protected abstract void start();
    protected abstract void play();
    protected abstract void end();
}

// Concrete Class 1
class Chess extends Game {
    @Override
    protected void start() {
        System.out.println("Chess game started. Set up the chess board.");
    }

    @Override
    protected void play() {
        System.out.println("Playing chess... Make your move.");
    }

    @Override
    protected void end() {
        System.out.println("Chess game ended. Checkmate!");
    }
}

// Concrete Class 2
class Soccer extends Game {
    @Override
    protected void start() {
        System.out.println("Soccer game started. Kick-off!");
    }

    @Override
    protected void play() {
        System.out.println("Playing soccer... Score goals!");
    }

    @Override
    protected void end() {
        System.out.println("Soccer game ended. Final whistle blown!");
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Game chess = new Chess();
        chess.playGame();

        System.out.println();

        Game soccer = new Soccer();
        soccer.playGame();
    }
}
