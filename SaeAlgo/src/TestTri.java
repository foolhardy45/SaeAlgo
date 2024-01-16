import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TestTri {
    public TestTri() {
    }
    @Test
    void testTriInsertionCasNormal() {
        int[] tableau = {5, 2, 9, 1, 5};
        int[] resultatAttendu = {1, 2, 5, 5, 9};
        Sae2.TriInsertion(tableau);
        assertArrayEquals(resultatAttendu, tableau);
    }

    @Test
    void testTriInsertionTableauVide() {
        int[] tableau = {};
        int[] resultatAttendu = {};
        Sae2.TriInsertion(tableau);
        assertArrayEquals(resultatAttendu, tableau);
    }

    @Test
    void testTriInsertionTableauDejaTrie() {
        int[] tableau = {1, 2, 3, 4, 5};
        int[] resultatAttendu = {1, 2, 3, 4, 5};
        Sae2.TriInsertion(tableau);
        assertArrayEquals(resultatAttendu, tableau);
    }
}
