public class Loup extends Animal {


    public Loup(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    public void manger() {
        System.out.println("Le loup mange les faibles");
    }

    @Override
    public void boire() {
        System.out.println("Le loup boit du sang");
    }

    @Override
    public void deplacement() {
        System.out.println("Le loup se déplace en moonwalk");
    }

    @Override
    public void crier() {
        System.out.println("Le loup hurle");
    }

    @Override
    public String toString() {
        return "Loup : " + super.toString();
    }
}
