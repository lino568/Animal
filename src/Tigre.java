public class Tigre extends Animal{

    public Tigre(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    public void manger() {
        System.out.println("Le tigre mange des Haribo");
    }

    @Override
    public void boire() {
        System.out.println("Le tigre boit du champagne");
    }

    @Override
    public void deplacement() {
        System.out.println("Le tigre se déplace pas, il attend");
    }

    @Override
    public void crier() {
        System.out.println("Le tigre rugit seulement en année bisextile");
    }

    @Override
    public String toString() {
        return "Tigre : " + super.toString();
    }
}
