package Doctor;

public class Terapevt extends Doctor{

    @Override
    public void heal(Client client) {
        System.out.println("I'm trying to investigate the problem for"+ client.getName());
    }
}
