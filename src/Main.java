
public class Main {
    public static void main(String[] args) {
        int ticket = 13676; // стоимость билета
        int mile = 20; // количество рублей для одной бонусной мили
        int calculation = ticket / mile; // расчет количества бонусных миль
        System.out.println("Количество начисленных бонусных миль составляет " + (calculation));

    }
}
