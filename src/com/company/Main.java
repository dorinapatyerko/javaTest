package com.company;
// ctrl + parancsra kattintás -> a megfelelő helyre ugrik az IDE

public class Main {

    public static void main(String[] args) {
        Cat cica = new Cat();
        cica.makeSound();


    }

}

  /*

-- 3. - Human classhoz tartozó próbálgatások a main-en belül

    public static void main(String[] args) {
        Human first = new Human(); // saját adattípus definiálása, példányosítás
        Human second = new Human();

        first.writeMyName();
        second.setName("Ákos");
        second.setAge(21);

        boolean empty = (first.getName() == null);

        System.out.println(empty == true ? "Üres" : "Nem üres");  // Háromoperandusú/Ternary Operator "Igaz ez ? Igen : Nem

        System.out.println(first.getName());
        System.out.println(second.getName());

        if (second.getName() == null){
            System.out.println("Nincs név");
        }else{
            System.out.println("Van név: " + second.getName() + ", kora: " + second.getAge());
        }

    }


-- 2.
    // szócserélő függvény - cenzúrázó
    static String censor(String text, String toChange, String newWord){
        if (text.contains(toChange)) {
            text = text.replaceAll(toChange, newWord);

        }
        return text;
    }

-- 1.

    //nincs visszatérési értéke
    void Metodus(){

    }

    //van visszatérési értéke
    String Fuggveny(){
        return null;
    }

   */

