public class Main {
    public static void main(String[] args) {

        int[] months_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"ianuarie", "februarie", "martie", "aprilie", "mai", "iunie", "iulie", "august", "septembrie", "octombrie", "noiembrie", "decembrie"};
        //ex1
        for (int id = 0; id < months_days.length; id++)
            System.out.println(months[id] + " " + months_days[id]);
        System.out.println();

        //ex2
        for (int id = 0; id < months_days.length; id++)
            if (months_days[id] == 31)
                System.out.println(months[id]);
        System.out.println();

        //ex3
        for (int id = 0; id < months_days.length; id++)
            if (months_days[id] < 31)
                System.out.println(months[id] + " " + months_days[id]);
        System.out.println();

        //ex4
        int s_days= 0;
        for (int id = 0; id < months_days.length; id++)
            if (months_days[id] < 31)
                s_days += months_days[id];
        System.out.println("Numarul de zile este:" + " " + s_days);
        System.out.println();

        //ex5
        for (int id = 0; id < months_days.length; id++)
        {
            String abbreviatedMonth = months[id].substring(0, 3);
            System.out.println(abbreviatedMonth + " - " + months_days[id]);
        }



    }
}