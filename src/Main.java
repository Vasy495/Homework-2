public class Main {
    public static void main(String[] args) {
        // Пример №1
        byte numberByte = 12;
        short numberShort = 123;
        int numberInt = 1234;
        long numberLong = 12345L;
        float numberFloat = 1.1F;
        double numberDouble = 1.12;
        char numberChar = 1;
        boolean numberBoolean = true;

        // Пример №2
        float boxerOne = 78.2f;
        float boxerTwo =  82.7f;
        float totalWeight = boxerOne + boxerTwo;
        float differenceWeight = boxerTwo % boxerOne;
        System.out.println("Вес двух боксеров: " + totalWeight + " кг");
        System.out.println("Разница в весе: " + differenceWeight + " кг");

        // Пример №3
        byte numberBananas = 5;
        short weightBananas = 80;
        short numberMilk = 200;
        short weightMilk = 105;
        byte numberCream = 2;
        short weightCream = 100;
        byte numberEggs = 4;
        short weightEggs = 70;

        int weightBreakfast = numberBananas * weightBananas + numberCream * weightCream + numberEggs * weightEggs + numberMilk * weightMilk / 100;
        float totalBreakfast = weightBreakfast / 1000f;
        System.out.println("Вес продуктов: " + weightBreakfast + ". Вес в кг: " + totalBreakfast);

        // Пример №4
        short difWeight = 7;
        float result250 = difWeight / 0.250f;
        float result500 = difWeight / 0.500f;
        float resultAverage = (result250 + result500) / 2;
        System.out.println("Количество дней при 250-ой граммовой диете: " + result250);
        System.out.println("Количество дней при 500-ой граммовой диете: " + result500);
        System.out.println("Количество дней при средней потере веса: " + resultAverage);

        // Пример №5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        float newSalaryMasha = salaryMasha * 1.1f;
        float newSalaryDenis = salaryDenis * 1.1f;
        float newSalaryKristina = salaryKristina * 1.1f;

        float difSalaryMasha = (salaryMasha * 12) % (newSalaryMasha * 12);
        float difSalaryDenis = (salaryDenis * 12) % (newSalaryDenis * 12);
        float difSalaryKristina = (salaryKristina * 12) % (newSalaryKristina * 12);

        System.out.println("Маша теперь получает: " + difSalaryMasha + ". Годовой доход вырос на " + difSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает: " + difSalaryDenis + ". Годовой доход вырос на " + difSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает: " + difSalaryKristina + ". Годовой доход вырос на " + difSalaryKristina + " рублей.");





    }
}