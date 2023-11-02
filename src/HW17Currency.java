import java.util.Arrays;
import java.util.Random;

public class HW17Currency {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("USD buying rate today: ");

        Bank bank01 = new Bank("Приват", 5 * random.nextDouble() + 35);
        Bank bank02 = new Bank("АВАЛЬ", 5 * random.nextDouble() + 35);
        Bank bank03 = new Bank("Сенс", 5 * random.nextDouble() + 35);
        Bank bank04 = new Bank("ТАСКОМБАНК", 5 * random.nextDouble() + 35);
        Bank bank05 = new Bank("Універсал", 5 * random.nextDouble() + 35);
        Bank bank06 = new Bank("Ощадбанк", 5 * random.nextDouble() + 35);
        Bank bank07 = new Bank("Укрексімбанк", 5 * random.nextDouble() + 35);
        Bank bank08 = new Bank("УКРГАЗБАНК", 5 * random.nextDouble() + 35);
        Bank bank09 = new Bank("Райффайзен ", 5 * random.nextDouble() + 35);
        Bank bank10 = new Bank("УКРСИББАНК", 5 * random.nextDouble() + 35);
        Bank bank11 = new Bank("ПУМБ", 5 * random.nextDouble() + 35);
        Bank bank12 = new Bank("Південний", 5 * random.nextDouble() + 35);
        Bank bank13 = new Bank("КРЕДОБАНК", 5 * random.nextDouble() + 35);
        Bank bank14 = new Bank("ТАС", 5 * random.nextDouble() + 35);

        double [] array01 = {bank01.rate, bank02.rate, bank03.rate, bank04.rate, bank05.rate, bank06.rate,bank07.rate, bank08.rate, bank09.rate, bank10.rate, bank11.rate, bank12.rate, bank13.rate, bank14.rate};
        // System.out.println(Arrays.toString(array01));
        double max = array01 [0];
        for (int i = 1; i< array01.length; i++) max = Math.max(max, array01[i]);

        System.out.println("The most profitable course today: " + " "+ max);





        }





    }

