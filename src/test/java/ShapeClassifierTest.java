import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ShapeClassifierTest {

    /**
     * This is an example test 
     */
    @DisplayName("Example Test")
    @Test
    public void example() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Equilateral,Large,Yes,100,100,100");
        assertNotEquals("Yes", answer);
    }

    @DisplayName("Example Guess Test")
    @Test
    public void incorrectShapeGuess() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Rectangle,Large,Yes,100,100,100");
        assertEquals("Yes", answer);
    }

    @DisplayName("Example Guess Test")
    @Test
    public void incorrectSizeGuess() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Equilateral,Small,Yes,100,100,100");
        assertEquals("Yes", answer);
    }
}
