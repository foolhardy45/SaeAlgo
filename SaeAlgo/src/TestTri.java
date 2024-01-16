import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTri {
    public TestTri() {
    }
    @Test
    void testTriInsertionCasNormal() {
        int[] tableau = {5, 2, 9, 1, 5};
        int[] resultatAttendu = {1, 2, 5, 5, 9};
        Sae2.TriInsertion(tableau);
        for (int i = 1; i < tableau.length; i++){
            Assertions.assertEquals(resultatAttendu[i], tableau[i]);
        }
    }

    @Test
    void testTriInsertionTableauVide() {
        int[] tableau = {};
        int[] resultatAttendu = {};
        Sae2.TriInsertion(tableau);
        Assertions.assertEquals(tableau.length==0, resultatAttendu.length==0);
    }

    @Test
    void testTriInsertionTableauDejaTrie() {
        int[] tableau = {1, 2, 3, 4, 5};
        int[] resultatAttendu = {1, 2, 3, 4, 5};
        Sae2.TriInsertion(tableau);
        for (int i = 1; i < tableau.length; i++){
            Assertions.assertEquals(resultatAttendu[i], tableau[i]);
        }
    }
    @Test
    public void testChercherIntElementPresent() {
        int[] tableau = {5, 2, 9, 1, 5};
        int elementRecherche = 9;
        int resultatAttendu = 9;
        Assertions.assertEquals(resultatAttendu, Sae2.chercherInt(tableau, elementRecherche));
    }

    @Test
    public void testChercherIntElementNonPresent() {
        int[] tableau = {5, 2, 9, 1, 5};
        int elementRecherche = 3;
        int resultatAttendu = -1;
        Assertions.assertEquals(resultatAttendu, Sae2.chercherInt(tableau, elementRecherche));
    }

    @Test
    public void testChercherIntTableauVide() {
        int[] tableau = {};
        int elementRecherche = 7;
        int resultatAttendu = -1;
        Assertions.assertEquals(resultatAttendu, Sae2.chercherInt(tableau, elementRecherche));
    }

    @Test
    public void testDichotomieElementPresent() {
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementRecherche = 7;
        int resultatAttendu = 7;
        Assertions.assertEquals(resultatAttendu, Sae2.dichotomie(tableau, elementRecherche));
    }

    @Test
    public void testDichotomieElementNonPresent() {
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementRecherche = 12;
        int resultatAttendu = -1;
        Assertions.assertEquals(resultatAttendu, Sae2.dichotomie(tableau, elementRecherche));
    }

    @Test
    public void testDichotomieTableauVide() {
        int[] tableau = {};
        int elementRecherche = 7;
        int resultatAttendu = -1;
        Assertions.assertEquals(resultatAttendu, Sae2.dichotomie(tableau, elementRecherche));
    }

    @Test
    public void testValPlusProcheElementPresent() {
        int[] tableau = {1, 4, 7, 10, 13, 16, 19};
        int valeurRecherche = 12;
        int resultatAttendu = 13;
        Assertions.assertEquals(resultatAttendu, Sae2.valPlusProche(tableau, valeurRecherche));
    }

    @Test
    public void testValPlusProcheElementNonPresent() {
        int[] tableau = {1, 4, 7, 10, 13, 16, 19};
        int valeurRecherche = 25;
        int resultatAttendu = 19;
        Assertions.assertEquals(resultatAttendu, Sae2.valPlusProche(tableau, valeurRecherche));
    }

    @Test
    public void testValPlusProcheTableauVide() {
        int[] tableau = {};
        int valeurRecherche = 7;
        int resultatAttendu = 0;
        Assertions.assertEquals(resultatAttendu, Sae2.valPlusProche(tableau, valeurRecherche));
    }

    @Test
    public void testValPlusProcheDichotomieElementPresent() {
        int[] tableau = {1, 4, 7, 10, 13, 16, 19};
        int valeurRecherche = 12;
        int resultatAttendu = 13;
        Assertions.assertEquals(resultatAttendu, Sae2.valPlusProcheDichotomie(tableau, valeurRecherche));
    }

    @Test
    public void testValPlusProcheDichotomieElementNonPresent() {
        int[] tableau = {1, 4, 7, 10, 13, 16, 19};
        int valeurRecherche = 25;
        int resultatAttendu = 19;
        Assertions.assertEquals(resultatAttendu, Sae2.valPlusProcheDichotomie(tableau, valeurRecherche));
    }

    @Test
    public void testValPlusProcheDichotomieTableauVide() {
        int[] tableau = {};
        int valeurRecherche = 7;
        int resultatAttendu = -1;
        Assertions.assertEquals(resultatAttendu, Sae2.valPlusProcheDichotomie(tableau, valeurRecherche));
    }
}
