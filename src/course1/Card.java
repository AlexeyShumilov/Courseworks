package course1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Card {
    private Abonement abonement;
    private Client client;
    private LocalDate startDate;
    private LocalDate endDate;

    public Card(Abonement abonement, Client client) {
        startDate = LocalDate.now();
        this.abonement = abonement;
        setClient(client);
        if (abonement == Abonement.ONEDAY){
            endDate = LocalDate.now().plusDays(1);
        } else
            endDate = LocalDate.now().plusDays(180);
    }

    public void setClient(Client client) {
        if(ChronoUnit.YEARS.between(client.getBirthYear(), LocalDate.now()) < 14) {
            throw new IllegalArgumentException("Посетитель младше 14 лет");}
        this.client = client;
    }

    public Abonement getAbonement() {
        return abonement;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
