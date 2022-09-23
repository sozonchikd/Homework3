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

System.out.println("Задача 5");
byte totalPaint = 120;
byte whiteOneClass = 2;
byte brownOneClass = 4;
int totalClasses = totalPaint / (whiteOneClass + brownOneClass);
System.out.println("В школе, где " + totalClasses + " классов, нужно " + (totalClasses * whiteOneClass) + " банок белой краски и " + (totalClasses * brownOneClass) + " банок коричневой краски." );

System.out.println("Задача 6");
byte banana1 = 80;
byte milk100Ml = 105;
byte iceCream1 = 100;
byte eggsRaw1 = 70;
byte totalRecipeBanana = 5;
short totalRecipeMilkMl = 200;
byte totalRecipeIceCream = 2;
byte totalRecipeEggsRaw = 4;
int mixedBlenderGram = (banana1 * totalRecipeBanana) + (milk100Ml * 2) + (iceCream1 * totalRecipeIceCream) + (eggsRaw1 * totalRecipeEggsRaw);
float mixedBlenderKG = mixedBlenderGram / 1000f;
System.out.println("Вес спорт-завтрака составляет " + mixedBlenderGram + " грамм или " + mixedBlenderKG + " килограмма");

System.out.println("Задача 7");
byte totalLoseWeightKg = 7;
short lose1WeightGram = 250;
short lose2WeightGram = 500;
int totalLoseWeightGram = totalLoseWeightKg * 1000;
int loseWeightDay250 = totalLoseWeightGram / lose1WeightGram;
System.out.println(loseWeightDay250 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
int loseWeightDay500 = totalLoseWeightGram / lose2WeightGram;
System.out.println(loseWeightDay500 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
System.out.println("Может потребоваться в среднем " + ((loseWeightDay250 + loseWeightDay500) / 2) + " день чтобы добиться результата похудения");

System.out.println("Задача 8");
int mashaSalary = 67760;
int denisSalary = 83690;
int kristinaSalary = 76230;
int mashaSalaryPromotion = mashaSalary / 10 + mashaSalary;
int mashaSalaryYearDifference = mashaSalaryPromotion * 12 - mashaSalary * 12;
System.out.println("Маша теперь получает " + mashaSalaryPromotion + " рублей. Годовой доход вырос на " + mashaSalaryYearDifference + " рублей");
int denisSalaryPromotion = denisSalary / 10 + denisSalary;
int denisSalaryYearDifference = denisSalaryPromotion * 12 - denisSalary * 12;
System.out.println("Денис теперь получает " + denisSalaryPromotion + " рублей. Годовой доход вырос на " + denisSalaryYearDifference + " рублей");
int kristinaSalaryPromotion = kristinaSalary / 10 + kristinaSalary;
int kristinaSalaryYearDifference = kristinaSalaryPromotion * 12 - kristinaSalary * 12;
System.out.println("Кристина теперь получает " + kristinaSalaryPromotion + " рубля. Годовой доход вырос на " + kristinaSalaryYearDifference + " рублей");








    }
}