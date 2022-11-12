package com.example.funfacts;

import java.util.Random;

public class FactBook {
    public String[] mFacts = {
            "Fourmis etendent quand ils se reveillznt le matin.",
            "Autruches peuvent courir plus vite que les chevaux.",
            "Medailles d'or olympiques sont en fait surtout de l'argent.",
            "Vous etes ne avec 300 os; au moment ou vous etes un adult, vous aurez 206.",
            "Il faut environ 8 minutes pour la lumiere du soleil pour attiendre la terre.",
            "Certaines plantes de bambou peut pousser presque un mètre en use seul journée,",
            "L'etat de Floride est olus grand que l'Angleterre.",
            "Certains pingouins peuvent sauter 2-3 metres hors de l'eau.",
            "En moyenne, il faut 66 jours pour former une nouvelle habitude.",
            "Mammouths marchait encore la terre, quand la grande pyramide a ete construit."

    };
    public String getFacts(){
        String fact =  "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        return fact;
    }
}