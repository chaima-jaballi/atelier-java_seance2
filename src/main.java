import java.util.Scanner;

public class main {



    public static void main(String[] args) {
        Animal lion = new Animal("cats", "Lion", 20, true);


        zoo myZoo = new zoo("Safari Zoo", "Tunis");
        System.out.println(lion.toString());
        myZoo.displayZoo();


    }

}