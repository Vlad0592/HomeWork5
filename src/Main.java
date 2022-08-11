public class Main {
    public static void main(String[] args) {
             // task 1

        int [] numbers = new int[3];
       numbers[0] = 1;
       numbers[1] = 2;
       numbers[2] = 3;
       int number1 = numbers[0];
       int number2 = numbers[1];
       int number3 = numbers[2];

       double [] alsoNumbers = {1.57, 7.654, 9.986};
       String [] Seasons = {"Winter", "Spring", "Summer", "Autumn"};


        // task2

        int [] numbers2 = new int[3];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        int number11 = numbers2[0];
        int number12 = numbers2[1];
        int number13 = numbers2[2];
        System.out.println(number11+ "," +number12+ ","+number13);

        double [] alsoNumber2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(alsoNumber2[i]+",");
        }
        System.out.println();

        String [] Seasons1 = {"Winter", "Spring", "Summer", "Autumn"};
        for (int b = 0; b < 3; b++) {
            System.out.print(Seasons1[b]+",");

        }
        System.out.println();

        //task3

        int [] numbers4 = new int[3];
        numbers4[0] = 1;
        numbers4[1] = 2;
        numbers4[2] = 3;
        int number0 = numbers2[0];
        int number01 = numbers2[1];
        int number02 = numbers2[2];
        System.out.println(number02+ "," +number01+ ","+number0);


      double [] alsoNumbers2 = {1.57, 7.654, 9.986};
        for (int i = alsoNumbers2.length -1; i >= 0; i --) {
            System.out.print(alsoNumbers2[i]+",");
        }
      System.out.println();


        // task3

        String [] Seasons2 = {"Winter", "Spring", "Summer", "Autumn"};
        for (int i = Seasons2.length -1; i >= 0; i--) {
            System.out.print(Seasons2[i]+",");
        }

      System.out.println();

        // task4

        int [] numbers3 = new int[3];
        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;
        int number121 = numbers3[0];
        int number122 = numbers3[1];
        int number123 = numbers3[2];
        int numberPlus =  ++number121;
        int numberPlus2 = ++number123;
        System.out.println(numberPlus+ "," +number122+ ","+numberPlus2);

    }
}