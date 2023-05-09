package ilikeyouboss;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ScoreCollectionTest {

    @Test
    public void arithmeticMean() {
        // Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // Act
        int actualResult = collection.arithmeticMean();

        // Assert
        assertThat(actualResult, equalTo(6));
    }
}