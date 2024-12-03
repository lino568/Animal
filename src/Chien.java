public class Chien extends Animal{

    public Chien(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    public void manger() {
        System.out.println("Le chien mange des croquettes");
    }

    @Override
    public void boire() {
        System.out.println("Le chien boit de l'eau");
    }

    @Override
    public void deplacement() {
        System.out.println("Le chien se déplace à 4 pattes");
    }

    @Override
    public void crier() {
        System.out.println("Le chien aboie");
    }

    @Override
    public String toString() {
        return "Chien : " + super.toString();
    }
}
