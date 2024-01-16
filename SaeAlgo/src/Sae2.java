import java.util.Arrays;
import java.util.Random;

public class Sae2 {

    public static void main(String[] args) {

        int[] tab = générerTabAleatoire(300000);

        long tempsDébut = System.nanoTime();

        Arrays.sort(tab); // trie le tab en utilisant un algorithme de type Quicksort

        long tempsFin = System.nanoTime();

        System.out.println("Temps de calcul en millisecondes: " + ((tempsFin - tempsDébut) / 1000000));

        //System.out.println(Arrays.toString(tab));

    }


    /*
        Retourne un tab de int rempli avec des valeurs aléatoires.
        La longueur du tab est reçue en paramètre.
        (Valeurs comprises entre Integer.MIN_VALUE=-2^31 et Integer.MAX_VALUE=2^31-1 inclus).
    */
    public static int[] générerTabAleatoire(int longueur) {
        Random random = new Random();
        int[] t = new int[longueur];
        for (int i = 0; i < t.length; i++)
            t[i] = random.nextInt(); // tirage aléatoire d'un int quelconque (compris entre -2^31 et 2^31-1)
        return t;
    }

    /*
        Retourne un tab de int rempli avec des valeurs aléatoires comprises entre min et max inclus.
        La longueur du tab est reçue en paramètre.
    */
    public static int[] générerTabAleatoireEntreBornes(int longueur, int min, int max) {
        Random random = new Random();
        int[] t = new int[longueur];
        for (int i = 0; i < t.length; i++)
            t[i] = random.nextInt(max - min + 1) + min; // nextInt(borne) retourne un int compris entre 0 inclus et borne exclus.
        return t;
    }

    public static int[] générertabTriéParOrdreCroissant(int longueur) {
        int[] t = new int[longueur];
        for (int i = 0; i < t.length; i++)
            t[i] = i;
        return t;
    }

    public static int[] générertabTriéParOrdreDecroissant(int longueur) {
        int[] t = new int[longueur];
        for (int i = 0; i < t.length; i++)
            t[i] = t.length - 1 - i;
        return t;
    }

    /*
        Retourne un tab contenant les multiples de 4 à partir de 0 ({0, 4, 8, 16...}).
        Utile pour faire des essais de recherche dans un tab trié.
     */
    public static int[] générerTabMultiplesDe4(int longueur) {
        int[] t = new int[longueur];
        for (int i = 0; i < t.length; i++)
            t[i] = 4 * i;
        return t;
    }

    public static void TriInsertion(int[] t) {
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

    public static int chercherInt(int[] tab, int a) {
        for (int j : tab) {
            if (j == a) {
                return j;
            }
        }
        return -1;
    }

    public static int dichotomie(int[] tab, int valRecher) {
        int debut = 0;
        int fin = tab.length - 1;
        int milieu;
        int valMilieu;

        while (debut <= fin) {
            milieu = (debut + fin) / 2;
            valMilieu = tab[milieu];
            System.out.println(tab[milieu]);

            if (valMilieu == valRecher) {
                return valMilieu;
            } else if (valMilieu < valRecher) {
                debut = milieu + 1;
            } else {
                fin = milieu - 1;
            }
        }
        return -1;
    }

    public static int valPlusProche(int[] tab, int valRecher) {
        int indicePlusProche = 0;
        if (tab.length == 0) {
            return 0;
        }
        int differenceMin = Math.abs(tab[0] - valRecher);
        for (int i = 1; i < tab.length; i++) {
            int differenceCourante = Math.abs(tab[i] - valRecher);

            if (differenceCourante < differenceMin) {
                differenceMin = differenceCourante;
                indicePlusProche = i;
            } else if (differenceCourante == differenceMin) {
                if (tab[i] > tab[indicePlusProche]) {
                    indicePlusProche = i;
                }
            }
        }
        return tab[indicePlusProche];
    }
    public static int valPlusProcheDichotomie(int[] tableau, int valeurRecherche) {
        if (tableau.length == 0) {
            return -1;
        }
        int debut = 0;
        int fin = tableau.length - 1;
        int indicePlusProche = 0;
        int differenceMin = Math.abs(tableau[0] - valeurRecherche);

        while (debut <= fin) {
            int milieu = (debut + fin) / 2;
            int differenceCourante = Math.abs(tableau[milieu] - valeurRecherche);

            if (differenceCourante < differenceMin || (differenceCourante == differenceMin && tableau[milieu] > tableau[indicePlusProche])) {
                differenceMin = differenceCourante;
                indicePlusProche = milieu;
            }

            if (tableau[milieu] == valeurRecherche) {
                return tableau[milieu];
            } else if (tableau[milieu] < valeurRecherche) {
                debut = milieu + 1;
            } else {
                fin = milieu - 1;
            }
        }

        return tableau[indicePlusProche];
    }
}
