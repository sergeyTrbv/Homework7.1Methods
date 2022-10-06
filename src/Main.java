public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void chekingYearVerification( int a){
        if (a % 4 ==0 && a % 100 != 0 || a % 400 ==0){
            System.out.println(a + " - високосный год");
        } else {
            System.out.println(a + " - не високосный год");
        }
    }

    public static void task1() {
        System.out.println("Task 1");

    //Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
    // Также високосным является каждый четырехсотый год.

        int year = 2022;
       chekingYearVerification(year);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    public static void chekingOSAndYear(int a, int b){
        if (a == 0){
            if (b < 2015) {
                System.out.println("Установите облечгенную версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (b < 2015){
                System.out.println("Установите облечгенную версию приложения для Android по ссылке");
            }else
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2(){
        System.out.println("\nTask 2");

        // 0 — iOS ; 1 — Android
        // 2015 - вышло обновление

        int clientOSNew = 1;
        int clientDeviceYear = 2013;
        chekingOSAndYear(clientOSNew, clientDeviceYear);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////

public static void calculationOfDeliveryDays(int a){
    int deliveryDays = 1;

    if (a <= 20){
        System.out.println("Потребуется дней : " + deliveryDays);
    } else if (a > 20 && a <= 60){
        System.out.println("Потребутся дней: " + (deliveryDays + 1));
    } else if (a > 60 && a <=100){
        System.out.println("Потребуется дней: " + (deliveryDays + 2));
    }
}
    public static void task3(){
        System.out.println("\nTask 3");

        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.

        //Написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки

        int deliveryDistance = 95;
        calculationOfDeliveryDays(deliveryDistance);
    }
}