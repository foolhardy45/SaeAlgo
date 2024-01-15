public class Main {
    public static void main(String[] args) {
        int[] tab = {1,0,5,6,4,6,7,2,1,6,4,45,1,5,5,5,62,1,6,5,100,5,41,6,5,1,0,6,2,5,6,4,2,16,400,6,20,165,1,516,156,5,16,1,68,1,61,5,61,5};
        Sae2.TriInsertion(tab);
        long tempsDebut = System.currentTimeMillis();
        int resultat = Sae2.dichotomie(tab,100);
        long tempsFin = System.currentTimeMillis();
        long tempsExecution = (tempsFin-tempsDebut);
        System.out.println(resultat);
        System.out.println("Le programme a pris " + tempsExecution + " secondes pour s'exécuter.");



    }
}