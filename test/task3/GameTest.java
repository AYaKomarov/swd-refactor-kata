package task3;

import org.junit.Test;
import task2.Abbreviate;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private static Game game = new Game();
    private static Question question1;
    private static Question question2;
    private static Question question3;
    static {
        question1 = game.addQuestion("What is the Capital of Great Britain?", "Paris", "Karaganda", "Dublin", "London", "London");
        question2 = game.addQuestion("Who is the author of Godfather novel?", "Hemingway", "Puzo", "Vonnegut", "Tolstoy", "Puzo");
        question3 = game.addQuestion("What is the distance to the Moon?", "156 000 km", "384 000 km", "432 000 km", "521 000 km", "384 000 km");
    }

    @Test
    public void test1() throws Exception {
        String playerGuess = "London";
        boolean result = game.checkAnswer(question1, playerGuess);
        assertEquals(true, result);
    }

}
