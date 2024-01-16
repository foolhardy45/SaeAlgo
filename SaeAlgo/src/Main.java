import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean resultat;
        //float tempsFin;
        //float tempsDebut ;

        for (int i = 0; i <10 ; i++) {
            int[] tab = Sae2.générerTabAleatoireEntreBornes(300000,-300000,300000);
            Sae2.TriInsertion(tab);
            float tempsDebut = System.nanoTime();
            resultat = Sae2.chercherInt(tab, 3000);
            float tempsFin = System.nanoTime();
            System.out.println("Le programme a pris " + ((tempsFin - tempsDebut) / 1000000) + " secondes pour s'exécuter.");
        }





        //System.out.println("Le programme a pris " + ((tempsFin - tempsDebut) / 1000000) + " secondes pour s'exécuter.");


    }

}