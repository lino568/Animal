import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal chat = new Chat(5, "noir");
        Animal chien = new Chien(30, "marron");
        Animal lion = new Lion(120, "roux");
        Animal loup = new Loup(90, "gris");
        Animal tigre = new Tigre(220, "orange");
        
        ArrayList<Animal> l = new ArrayList<>();
        l.add(loup);
        l.add(lion);
        l.add(chat);
        l.add(chien);
        l.add(tigre);

        for (Animal a: l){
            System.out.println(a);
            a.boire();
            a.crier();
            a.deplacement();
            a.manger();

        }
    }
}