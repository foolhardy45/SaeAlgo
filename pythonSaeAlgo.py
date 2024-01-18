# -*- coding: utf-8 -*-
"""
Created on Mon Jan 15 21:53:13 2024

@author: Utilisateur
"""

import time
import random

def tableau_aleatoire(taille):
    """
    Crée un tableau avec des valeurs aléatoires.

    :param taille: Taille du tableau
    :return: Tableau avec des valeurs aléatoires
    """
    tableau = [random.randint(1, 100) for _ in range(taille)]
    return tableau

def tableau_decroissant(taille):
    """
    Crée un tableau trié par ordre décroissant.

    :param taille: Taille du tableau
    :return: Tableau trié par ordre décroissant
    """
    tableau = [i for i in range(taille, 0, -1)]
    return tableau

def tableau_croissant(taille):
    """
    Crée un tableau trié par ordre croissant.

    :param taille: Taille du tableau
    :return: Tableau trié par ordre croissant
    """
    tableau = [i for i in range(1, taille + 1)]
    return tableau
def tri_insertion(tab):
    for i in range(1, len(tab)):
        k = tab[i]
        j = i - 1
        while j >= 0 and k < tab[j]:
            tab[j + 1] = tab[j]
            j -= 1
        tab[j + 1] = k

compteur = 0
totalTemps = 0
# Utilisez un tableau plus grand
for i in range(1, 10):
    tab = tableau_decroissant(30000)
    temps_debut = time.time()
    tri_insertion(tab)
    temps_fin = time.time()
    temps_execution = temps_fin - temps_debut
    temps_formatte = "{:.2f}".format(temps_execution)
    compteur+=1
    totalTemps = temps_execution + totalTemps
    print(f"Le programme a pris {temps_formatte} secondes pour s'exécuter.")


moyenne = (totalTemps/compteur)
print(moyenne)




