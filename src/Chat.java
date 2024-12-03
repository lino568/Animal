public class Chat extends Animal{

    public Chat(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    public void manger() {
        System.out.println("Le chat mange dans des assiettes en argent");
    }

    @Override
    public void boire() {
        System.out.println("Le chat boit ce qu'il veut, c'est lui qui décide");
    }

    @Override
    public void deplacement() {
        System.out.println("Le chat se déplace SI il en a envie et QUAND il le désire");
    }

    @Override
    public void crier() {
        System.out.println("Le chat ne miaule pas, il exige");
    }

    @Override
    public String toString() {
        return "Chat : " + super.toString();
    }
}
