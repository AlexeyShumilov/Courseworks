package course1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Fitness {
    private final Card[] gym = new Card[20];
    private final Card[] swim = new Card[20];
    private final Card[] group = new Card[20];

    public void visitFitness(String zone, Card card) {
        if (ChronoUnit.DAYS.between(card.getEndDate(), LocalDate.now()) >= 0) {
            System.out.println("Абонемент просрочен");
        }else if(ChronoUnit.MINUTES.between(card.getAbonement().getStartTime(),LocalTime.now()) < 0 || ChronoUnit.MINUTES.between(card.getAbonement().getEndTime(),LocalTime.now()) > 0){
            System.out.println(card.getClient().getNameAndSurname()+", сегодня время посещения у Вашего абонемента закончено ");

        }  else if (zone.equalsIgnoreCase("gym")){
            if (card.getAbonement().isGym()) {
                for (int i = 0; i < gym.length; i++) {
                    if (gym[i] == null) {
                        gym[i] = card;
                        System.out.println(card.getClient().getNameAndSurname() + ", можете проходить в тренажерный зал. " +
                                "Время посещения: " + LocalDate.now() + " " + LocalTime.now());
                        return;
                    }
                }
                System.out.println("В тренажерном зале нет мест");
            }
        } else if (zone.equalsIgnoreCase("swim")){
            if(card.getAbonement().isSwim()) {
                for (int i = 0; i < swim.length; i++) {
                    if (swim[i] == null) {
                        swim[i] = card;
                        System.out.println(card.getClient().getNameAndSurname() + ", можете проходить в бассейн. " +
                                "Время посещения: " + LocalDate.now() + " " + LocalTime.now());
                        return;
                    }
                }
                System.out.println("В бассейне нет мест");
            } else {
                System.out.println(card.getClient().getNameAndSurname() + ", абонемент без бассейна");
            }
        } else if (zone.equalsIgnoreCase("group")){
            if(card.getAbonement().isGroup()){
                for (int i = 0; i < group.length; i++){
                    if (group[i] == null){
                        group[i] = card;
                        System.out.println(card.getClient().getNameAndSurname() + ", можете проходить на групповые занятия. " +
                                "Время посещения: " + LocalDate.now() + " " + LocalTime.now());
                        return;
                    }
                } System.out.println("Группа заполнена");
            } else {
                System.out.println(card.getClient().getNameAndSurname() + ", абонемент без групповых занятий");
            }
        }else {
            System.out.println(card.getClient().getNameAndSurname() + ", пожалуйста укажите желаемое место посещение корректно");
        }
    }

    public void fitnessIsClosing(){
        Arrays.fill(gym, null);
        Arrays.fill(swim, null);
        Arrays.fill(group,null);
        System.out.println("\nФитнес зал закрывается.\nПроверка пустоты фитнес клуба перед закрытием:\n"
                + Arrays.toString(gym) + " -тренажерный зал;\n"
                + Arrays.toString(swim) + " -бассейн;\n"
                + Arrays.toString(group) + " -групповые занятия.");
    }

    public  void printInfo(){
        System.out.println("\n Тренажерный зал: ");
        for (Card card : gym) {
            if (card != null){
                System.out.println(card.getClient().getNameAndSurname());
            }
        }
        System.out.println("\n Бассейн: ");
        for (Card card : swim) {
            if (card != null){
                System.out.println(card.getClient().getNameAndSurname());
            }
        }
        System.out.println("\n Групповые занятия: ");
        for (Card card : group) {
            if (card != null){
                System.out.println(card.getClient().getNameAndSurname());
            }
        }
    }
}
