# -*- coding: utf-8 -*-
"""
Created on Mon Jan 15 21:53:13 2024

@author: Utilisateur
"""

import time


def tri_insertion(tab):
    for i in range(1, len(tab)):
        k = tab[i]
        j = i - 1
        while j >= 0 and k < tab[j]:
            tab[j + 1] = tab[j]
            j -= 1
        tab[j + 1] = k


# Utilisez un tableau plus grand
tab = [98, 22, 15, 32, 2, 74, 63, 70] * 1000

temps_debut = time.time()
tri_insertion(tab)
temps_fin = time.time()

temps_execution = temps_fin - temps_debut
temps_formatte = "{:.2f}".format(temps_execution)

print(f"Le programme a pris {temps_formatte} secondes pour s'exécuter.")
