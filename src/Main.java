public class Main {
    public static void main(String[] args) {
byte pizza = 121;
System.out.println("Значение переменной pizza с типом byte равно " + pizza);
short temperature = -48;
System.out.println("Значение переменной temperature с типом short равно " + temperature);
int computer = 7777;
System.out.println("Значение переменной computer с типом int равно " + computer);
long money = 21775900L;
System.out.println("Значение переменной money с типом long равно " + money);
double forceOfGravity = 9.80665;
System.out.println("Значение переменной forceOfGravity с типом double равно " + forceOfGravity);
float cable = 1.6f;
System.out.println("Значение переменной cable с типом float равно " + cable);

System.out.println("Задача 2");
float flour = 27.12f;
System.out.println(flour);
long brick = 987678965549L;
System.out.println(brick);
float sugarWeight = 2.786f;
System.out.println(sugarWeight);
short voltage = 220;
System.out.println(voltage);
boolean nominalVoltage = voltage > 300;
System.out.println(nominalVoltage);
short tire = 569;
System.out.println(tire);
short accountOnTheCard = -159;
System.out.println(accountOnTheCard);
short metalWeight = 27897;
System.out.println(metalWeight);
byte automobile = 67;
System.out.println(automobile);

        System.out.println("Задача 3");
byte LyudmilaPavlovna = 23;
byte AnnaSergeyevna = 27;
byte YekaterinaAndreyevna = 30;
short totalPaper = 480;
System.out.println("На каждого ученика рассчитано " + (totalPaper / (LyudmilaPavlovna + AnnaSergeyevna + YekaterinaAndreyevna)) + " листов бумаги");

System.out.println("Задача 4");
byte productivity2Minutes = 16;
int productivity1Minutes = productivity2Minutes / 2;
System.out.println("За 20 минут машина произвела бутылок " + (productivity1Minutes * 20) + " штук");
int day = 24 * 60 * productivity1Minutes;
System.out.println("За сутки машина произвела бутылок " + day + " штук");
int day3 = day * 3;
System.out.println("За 3 дня машина произвела бутылок " + day3 + " штук");
int month1 = day * 30;
System.out.println("За 1 месяц машина произвела бутылок " + month1 + " штук");




    }
}