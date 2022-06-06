package course1;

public class App {
    public static void main(String[] args) {
        Client client1 = new Client("Ivan","Ivanov","28.11.1994");
        Client client2 = new Client("Anna", "Ilina", "01.01.1982");
        Client client3 = new Client("Olga", "Smirnova", "05.08.1971");
        Client client4 = new Client("Andrey", "Popov", "11.03.2002");
        Client client5 = new Client("Oleg", "Markov", "29.04.1999");
        Client client6 = new Client("Andrey", "Denisov", "19.12.1996");
        Client client7 = new Client("Inna", "Fedorova", "17.07.1998");
        Client client8 = new Client("Sergey", "Nikulin", "24.03.1987");
        Client client9 = new Client("Alexander", "Stepanov", "30.02.2004");
        Client client10 = new Client("Alla", "Ionova", "13.05.1975");


        Card card1 = new Card(Abonement.FULL, client1);
        Card card2 = new Card(Abonement.ONEDAY, client2);
        Card card3 = new Card(Abonement.MORNING, client3);
        Card card4 = new Card(Abonement.FULL, client4);
        Card card5 = new Card(Abonement.MORNING, client5);
        Card card6 = new Card(Abonement.ONEDAY, client6);
        Card card7 = new Card(Abonement.MORNING, client7);
        Card card8 = new Card(Abonement.FULL, client8);
        Card card9 = new Card(Abonement.FULL, client9);
        Card card10 = new Card(Abonement.MORNING, client10);

        Fitness day = new Fitness();

        day.visitFitness("swim", card1);
        day.visitFitness("swim", card2);
        day.visitFitness("gym", card3);
        day.visitFitness("swim", card4);
        day.visitFitness("group", card5);
        day.visitFitness("swim", card6);
        day.visitFitness("group", card7);
        day.visitFitness("gym", card8);
        day.visitFitness("group", card9);
        day.visitFitness("gym", card10);


        day.printInfo();
        System.out.println();
        day.fitnessIsClosing();
    }
}
