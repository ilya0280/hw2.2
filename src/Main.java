public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println(" Задание 1 ");

        int dog = 5;
        System.out.println( "Значение переменной dog с типом int равно " + dog);
        byte cat = 4;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        short mouse = 6;
        System.out.println("Значение переменной mouse с типом short равно " + mouse);
        long elephant = 100L;
        System.out.println("Значение переменной elephant с типом long равно " + elephant);
        float saltWeight = 1.5f;
        System.out.println("Значение переменной saltWeight с типом float равно " +saltWeight);
        double sugarWeight = 7.5;
        System.out.println("Значение переменной sugarWeight с типом double равно " + sugarWeight);

        // Задание 2
        System.out.println(" Задание 2");

        byte a = 1;
        System.out.println(a);
        short b = 2;
        System.out.println(b);
        int c = 3;
        System.out.println(c);
        long d = 4L;
        System.out.println(d);
        float e = 5.0f;
        System.out.println(e);
        double f = 6.0;
        System.out.println(f);
        char g = 7;
        System.out.println(g);
        boolean aH = a > 8;
        System.out.println(aH);

        // Задание 3
        System.out.println(" Задание 3");

        byte lP = 23;
        System.out.println("У Людмила Павловны " + lP + " ученика");
        byte aS = 27;
        System.out.println("У Анны Сергеевны " + aS + " учеников");
        byte eA =30;
        System.out.println("У Екатерины Андреевны " + eA + " учеников");
        int students = lP + aS + eA;
        System.out.println("Всего учеников " + students);
        short paperTotal = 420;
        System.out.println("Всего купили бумаги на три класса " + paperTotal + " листов");
        int paperStudent = paperTotal / students;
        System.out.println("На каждого ученика рассчитано " +paperStudent+ " листов бумаги");

        // Задание 4
        System.out.println( " Задание 4");

        byte thePerformanceOfMachines2Min= 16;
        System.out.println("Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты.");
        byte workingHours2Min = 2;
        int thePerformanceOfMachines = thePerformanceOfMachines2Min / workingHours2Min;
        System.out.println("Производительность машины " +thePerformanceOfMachines+ " бутылок в минуту");
        byte workingHours = 1;
        int workingHours20Min = thePerformanceOfMachines*20;
        System.out.println("За 20 минут работы машины произвела бутылок " + workingHours20Min +" штук ");
        int workingHours1Day = thePerformanceOfMachines*1440;
        System.out.println("За сутки работы машины произвела бутылок " + workingHours1Day + " штук");
        int workingHours3Day = thePerformanceOfMachines*4320;
        System.out.println("За 3 дня работы машины произвела бутылок " + workingHours3Day + " штук");
        int workingHours1Month = thePerformanceOfMachines*44640;
        System.out.println("За 1 месяц работы машины произвела бутылок " + workingHours1Month + " штук");

        // Задание 5
        System.out.println(" Задание 5");

        byte totalPaint =120;
        System.out.println("На ремонт школы нужно " + totalPaint + " банок краски двух цветов");
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalPaintClass = whitePaint+brownPaint;
        System.out.println("На один класс нужно " + whitePaint+ " банки белой краски и " + brownPaint +  " коричневой");
        System.out.println("Всего на один класс нужно " +totalPaintClass + " Банок краски двух цветов");
        int totalClass = totalPaint/totalPaintClass;
        System.out.println("В школе всего "+ totalClass+ " классов");
        int whitePaintTotal = whitePaint*totalClass;
        int brownPaintTotal = brownPaint*totalClass;
        System.out.println("В школе, где " + totalClass+ " классов, нужно "+whitePaintTotal+" банок белой краски и " +brownPaintTotal+" банок коричневой краски");

        // Задание 6
        System.out.println(" Задание 6");

        int bananaWeight =80;
        int milkWeight =105;
        int iceCreamWeight =100;
        int eggWeight =70;

        // Рецепт спорт-завтрака
        System.out.println("Рецепт спорт-завтрака:");

        int bananas =bananaWeight*5;
        System.out.println("Бананы-5 штук (" +bananas+ " грамм)");
        int milk =milkWeight*2;
        System.out.println("Молоко-200 мл ("+milkWeight+ " грамм)");
        int iceCream =iceCreamWeight*2;
        System.out.println("Мороженное пломбир-2 брикета ("+iceCream+ " грамм)");
        int eggs =eggWeight*4;
        System.out.println("Яйца сырые-4 яйца ("+eggs+ " грамм)");

        int sportsBreakfastWeightGram = bananas+milk+iceCream+eggs;
        System.out.println("Вес такого спорт-завтрака " +sportsBreakfastWeightGram+ " грамм");
        float sportsBreakfastWeightKilogram =(bananas+milk+iceCream+eggs)/1000f;
        System.out.println("Вес такого спорт-завтрака "+sportsBreakfastWeightKilogram+" килограмм");

        // Задание 7
        System.out.println(" Задание 7");

        float totalWeightLose =7f;
        System.out.println("Всего спорсмен должен сбросить "+totalWeightLose+ " кг");
        float weightLoseMin =0.250f;
        float weightLoseMax =0.500f;
        float weightLoseAverage= (weightLoseMin+weightLoseMax)/2;
        System.out.println("Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день");
        System.out.println("В среднем сортсмен может терять в весе "+weightLoseAverage);
        float dietDayMin =totalWeightLose/weightLoseMax;
        float dietDayMax =totalWeightLose/weightLoseMin;
        double dietDayAverage = totalWeightLose/weightLoseAverage;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм то он достигнет результата через "+dietDayMax);
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм то он достигнет результата через "+dietDayMin);
        System.out.println("Для достижения результата в среднем понадобится "+dietDayAverage+" дней");

        // Задание 8
        System.out.println(" Задание 8");

        float prize=0.10f;

        int mashaSalary=67760;
        int denisSalary=83690;
        int kristinaSalary=76230;
        System.out.println("Маша получает " +mashaSalary+ " рублей в месяц");
        System.out.println("Денис получает " +denisSalary+ " рублей в месяц");
        System.out.println("Кристина получает " +kristinaSalary+ " рублей в месяц");
        System.out.println("Каждому нужно увеличить зарплату на "+prize+ " процентов");

        int mashaSalaryYear= mashaSalary*12;
        int denisSalaryYear= denisSalary*12;
        int kristinaSalaryYear= kristinaSalary*12;

        float mashaIncome=mashaSalary+(mashaSalary*prize);
        float denisIncome=denisSalary+(denisSalary*prize);
        float kristinaIncome=kristinaSalary+(kristinaSalary*prize);

        float mashaIncomeYear=mashaIncome*12;
        float denisIncomeYear=denisIncome*12;
        float kristinaIncomeYear=kristinaIncome*12;

        float mashaIncomeHasGrown=mashaIncomeYear-mashaSalaryYear;
        float denisIncomeHasGrown=denisIncomeYear-denisSalaryYear;
        float kristinaIncomeHasGrown=kristinaIncomeYear-kristinaSalaryYear;

        System.out.println("Маша теперь получает " +mashaIncome+ " рублей. Годовой доход вырос на " +mashaIncomeHasGrown+ " рублей");
        System.out.println("Денис теперь получает " +denisIncome+ " рублей. Годовой доход вырос на " +denisIncomeHasGrown+ " рублей");
        System.out.println("Кристина теперь получает " +kristinaIncome+ " рублей. Годовой доход вырос на " +kristinaIncomeHasGrown+ " рублей");




























    }
}