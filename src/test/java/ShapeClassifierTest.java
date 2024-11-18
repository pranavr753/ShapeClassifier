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

    @DisplayName("Incorrect Even/Odd Guess Test")
    @Test
    public void incorrectEvenOddGuess() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Equilateral,Large,No,100,100,100");
        assertEquals("Even/Odd guess is incorrect. The perimeter is even.", answer);
    }

    @DisplayName("Edge Case: Small Shape with Perimeter Exactly 10")
    @Test
    public void edgeCaseSmallShape() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Scalene,Small,Yes,3,3,3");
        assertEquals("Yes", answer);
    }

    @DisplayName("Edge Case: Perimeter Exactly 10 but Large Classification")
    @Test
    public void edgeCaseLargeSize() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Scalene,Large,No,100,100,100");
        assertEquals("Yes", answer);
    }
}
