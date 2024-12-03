public class Lion extends Animal{

    public Lion(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    public void manger() {
        System.out.println("Le lion mange ses morts");
    }

    @Override
    public void boire() {
        System.out.println("Le lion du whisky");
    }

    @Override
    public void deplacement() {
        System.out.println("Le lion se déplace en Tesla");
    }

    @Override
    public void crier() {
        System.out.println("Le lion rugit");
    }

    @Override
    public String toString() {
        return "Lion : " + super.toString();
    }
}
