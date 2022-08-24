package Doctor;

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Client[] clients = getClients();

        for (Client client : clients) {
            Doctor doctor = DoctorFactory.getDoctorByMedicalPlan(client.getMedicalPlan());
            doctor.heal(client);
        }
    }

    private static Client[] getClients() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Get clients size: ");
        int size = scanner.nextInt();
        Client[] clients = new Client[size];
        for (int i = 0; i < size; i++) {
            clients[i] = getClient();
        }
        return clients;
    }

    private static Client getClient() {
        Random r = new Random();
        int nextValue = r.nextInt(4);
        Client client = new Client(" Fedor" + nextValue);
        MedicalPlan medicalPlan = new MedicalPlan(nextValue);
        client.setMedicalPlan(medicalPlan);
        return client;
    }
}
