package com.company;

// itt nem kötelező értéket adni a változóknak.
public class Human {
    private String name; // mindig privátok legyenek a classokban szereplő változók! Getter-setterrel kezeljük  a külső módosítást le. Alapértelmezett értéke null.
    private int age;  // Alapértelmezett értéke nulla.

    /** Ez a metódus kiírja az ember nevét. */ // Így kell a javadochoz hozzáadni a saját elkészítésű metódusainkhoz a dokumentációt
    void writeMyName(){
        System.out.println("Az én nevem " + name);
    }

    public String getName() {
        return this.name;  // a this több name nevű változó esetén fontos (az objektum name (fő)változójára hivatkozik ezzel)
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
