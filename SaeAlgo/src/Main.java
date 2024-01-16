public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean resultat;
        float moytemps = 0;
        //float tempsFin;
        //float tempsDebut ;

        int i;
        for (i = 0; i < 10; i++) {
            int[] tab = Sae2.générertabTriéParOrdreCroissant(50);
            float tempsDebut = System.nanoTime();
            Sae2.dichotomie(tab, 26);
            float tempsFin = System.nanoTime();
            moytemps = (tempsFin - tempsDebut) + moytemps;
            System.out.println("Le programme a pris " + ((tempsFin - tempsDebut) / 10000000) + " secondes pour s'exécuter.");
        }

        System.out.println("la moyenne est de " + (moytemps / i) / 10000000);




    }

}