package org.example;

public class Main {
    public static void main(String[] args) {

        String jt = "Java engineer";
        Normaliser n = new Normaliser();
        String normalisedTitle = n.normalise(jt);
        System.out.println(normalisedTitle);

        jt = "C# engineer";
        normalisedTitle = n.normalise(jt);
        System.out.println(normalisedTitle);

        jt = "Chief Accountant";
        normalisedTitle = n.normalise(jt);
        System.out.println(normalisedTitle);

        jt = "Accountant";
        normalisedTitle = n.normalise(jt);
        System.out.println(normalisedTitle);
    }
}