package Doctor;

public class Dentist extends Doctor{
    @Override
    public void heal(Client client) {
        System.out.println("I'm drilling a tooth of"+client.getName());
    }
}
