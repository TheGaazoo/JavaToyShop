import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Raffle r = new Raffle();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                \033[34m\033[4mГлавное меню:\033[0m
                \033[32m1 - Добавить новую игрушку в призовой фонд\033[0m
                \033[32m2 - Изменить частоту выпадения какой-нибудь игрушки\033[0m
                \033[32m3 - Провесть розыгрыш и сохранить результаты\033[0m
                \033[32m0 - ВЫХОД\033[0m
                    >\s""");
            var selection = sc.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("\033[33m\033[4mСпасибо за использование данного продукта. До свидания!\033[0m");
                    System.exit(0);
                }
                default -> System.out.println("\033[31mНе корректный выбор. Попробуйте снова.\033[0m");
            }
        }
    }
}