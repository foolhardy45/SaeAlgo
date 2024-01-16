
import java.util.Arrays;
import java.util.Random;

public class Sae2 {

    public static void main(String[] args) {

        int[] tab = générerTabAleatoire(300000);

        long tempsDébut = System.nanoTime();

        Arrays.sort(tab); // trie le tableau en utilisant un algorithme de type Quicksort

        long tempsFin = System.nanoTime();

        System.out.println("Temps de calcul en millisecondes: " + ((tempsFin - tempsDébut) / 1000000) );

        //System.out.println(Arrays.toString(tab));

    }


    /*
        Retourne un tableau de int rempli avec des valeurs aléatoires.
        La longueur du tableau est reçue en paramètre.
        (Valeurs comprises entre Integer.MIN_VALUE=-2^31 et Integer.MAX_VALUE=2^31-1 inclus).
    */
    public static int[] générerTabAleatoire(int longueur) {
        Random random = new Random();
        int[] t = new int[longueur];
        for (int i = 0 ; i < t.length ; i++)
            t[i] = random.nextInt(); // tirage aléatoire d'un int quelconque (compris entre -2^31 et 2^31-1)
        return t;
    }

    /*
        Retourne un tableau de int rempli avec des valeurs aléatoires comprises entre min et max inclus.
        La longueur du tableau est reçue en paramètre.
    */
    public static int[] générerTabAleatoireEntreBornes(int longueur, int min, int max) {
        Random random = new Random();
        int[] t = new int[longueur];
        for (int i = 0 ; i < t.length ; i++)
            t[i] = random.nextInt(max-min+1)+min; // nextInt(borne) retourne un int compris entre 0 inclus et borne exclus.
        return t;
    }

    public static int[] générerTableauTriéParOrdreCroissant (int longueur) {
        int[] t = new int[longueur];
        for (int i = 0 ; i < t.length ; i++)
            t[i] = i;
        return t;
    }

    public static int[] générerTableauTriéParOrdreDecroissant (int longueur) {
        int[] t = new int[longueur];
        for (int i = 0 ; i < t.length ; i++)
            t[i] = t.length-1-i;
        return t;
    }

    /*
        Retourne un tableau contenant les multiples de 4 à partir de 0 ({0, 4, 8, 16...}).
        Utile pour faire des essais de recherche dans un tableau trié.
     */
    public static int[] générerTabMultiplesDe4(int longueur) {
        int[] t = new int[longueur];
        for (int i = 0 ; i < t.length ; i++)
            t[i] = 4*i;
        return t;
    }
    public static void TriInsertion (int [] t) {
        int i, j, pivot;
        for (i = 1; i < t.length; i++) {
            j = i;
            pivot = t[i];
            while (j > 0 && t[j - 1] > pivot) {
                t[j] = t[j - 1];
                j -= 1;
            }
            t[j] = pivot;
        }
    }
    public static boolean chercherInt (int[] tab,int a){
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == a){
                return true;
            }
        }
        return false;
    }

    public static int dichotomie (int[] tab,int valRecher){
        int debut = 0;
        int fin = tab.length-1;
        int milieu;
        int valMilieu;

        while(debut<= fin){
            milieu = (debut+fin) / 2;
            valMilieu = tab[milieu];

            if(valMilieu == valRecher){
                return valMilieu;
            }else if (valMilieu < valRecher){
                debut = milieu + 1;
            }else{
                fin = milieu -1;
            }
        }
        return -1;
    }

    public static int valPlusProche(int[] tab, int a){
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == a) {
                System.out.println("la valeur la plus proche de " + a + " est " + tab[i] + " car c'est elle même");
            }


        }
        return -1;
    }
}
