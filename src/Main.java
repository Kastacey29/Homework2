public class Main {
    public static void main(String[] args) {

    var Aa = 29;
    byte a = 10;
    short b = 128;
    int c = 32_800;
    long d = 1_000_000L;
    float e = 82.37f;
    double f = 48.625789;
    char g = '$';
    boolean h = true;

    System.out.println(Aa);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
    System.out.println();

    float WeightOne = 78.2f;
    float WeightTwo = 82.7f;
    float CommonWeight = WeightOne + WeightTwo;
    float DifferenceWeight = WeightOne - WeightTwo;
    System.out.println ("Общий вес двух бойцов = " + CommonWeight + " кг. ");
    System.out.println ("Разница в весе двух бойцов = " + Math.abs(DifferenceWeight)  + " кг.");
    System.out.println();
    float WeightBanana = 80f;
    float WeightMilk = 1.05f;
    float WeightIceCream = 100f;
    float WeightEgg = 70f;
    float RecipeBreakfast = 5*WeightBanana + 200*WeightMilk + 2*WeightIceCream + 4*WeightEgg;
    System.out.println("Общий вес завтрака бойца в килограммах составляет " + RecipeBreakfast/1000 + " кг!");
    System.out.println();
    float lostWeight = 7f;
    float lostTime250 = lostWeight*1000/250;
    float lostTime500 = lostWeight*1000/500;
    float averigeTime = (lostTime250 + lostTime500)/2;
    System.out.println("Количество дней при потере веса 250г/день составляет " + lostTime250 + " дней.");
    System.out.println("Количество дней при потере веса 500г/день составляет " + lostTime500 + " дней.");
    System.out.println("Среднее количество дней для потери 7 кг составляет " + averigeTime + " дней.");
    System.out.println();
    float Zarplata1Masha = 67760;
    float Zarplata1Denis = 83690;
    float Zarplata1Kristina = 76230;
    float Zarplata2Masha = Zarplata1Masha+10*Zarplata1Masha/100;
    float Zarplata2Denis = Zarplata1Denis+10*Zarplata1Denis/100;
    float Zarplata2Kristina = Zarplata1Kristina+10*Zarplata1Kristina/100;
    float DifferenceZarplataMasha = Math.abs(Zarplata1Masha*12 - Zarplata2Masha*12);
    float DifferenceZarplataDenis = Math.abs(Zarplata1Denis*12 - Zarplata2Denis*12);
    float DifferenceZarplataKristina = Math.abs(Zarplata1Kristina*12 - Zarplata2Kristina*12);
    System.out.println("Новая зарплата Маши составляет " + Zarplata2Masha + " рублей.");
    System.out.println("Годовой доход Маши вырос на " + DifferenceZarplataMasha + " рублей.");
    System.out.println("Новая зарплата Дениса составляет " + Zarplata2Denis + " рублей.");
    System.out.println("Годовой доход Дениса вырос на " + DifferenceZarplataDenis + " рублей.");
    System.out.println("Новая зарплата Кристины составляет " + Zarplata2Kristina + " рублей.");
    System.out.println("Годовой доход Кристины вырос на " + DifferenceZarplataKristina + " рублей.");

    }

}