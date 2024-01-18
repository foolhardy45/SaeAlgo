public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean resultat;
        float moytemps = 0;

        int i;
        for (i = 0; i < 10; i++) {
            int[] tab = Sae2.générerTabAleatoireEntreBornes(999999999,-300000,300000);
            float tempsDebut = System.nanoTime();
            Sae2.valPlusProcheDichotomie(tab,300000);
            float tempsFin = System.nanoTime();
            moytemps = (tempsFin - tempsDebut) + moytemps;
            System.out.println("Le programme a pris " + ((tempsFin - tempsDebut)/100000000 ) + " secondes pour s'exécuter.");
        }

        System.out.println("la moyenne est de " + (moytemps / i)/100000000 );

    }

}