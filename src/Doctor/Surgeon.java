package Doctor;

public class Surgeon extends Doctor{
    @Override
    public void heal(Client client) {
        System.out.println("I'm cutting a part of"+client.getName());
    }
}
