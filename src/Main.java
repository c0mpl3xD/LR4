public class Main {
    public static void main(String[] args) {
        //Task 1
        if ((5 - Math.random()) > 0) {
            System.out.println("Ok");
        }
        if (!true) {

            System.out.println("Ok");
        }

        int x=3;
        int y = (int)(Math.random() * 10);
        if ((x < y) && (x > 3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        x=3;
        y = (int)(Math.random() * 10);
        if ((x < y) && (x >= 3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        x=3;
        y = (int)(Math.random() * 10);
        if ((x < y) || (x > 3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        x=3;
        y = (int)(Math.random() * 10);
        if ((x < y) || (x >= 3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        double d = Math.random() * 100;
        if (d > 75) {
            System.out.println(d*d);
        } else if (d > 50) {
            System.out.println(Math.sqrt(d));
        } else if (d > 25) {
            System.out.println(d+d);
        } else {
            System.out.println(d);
        }

        String s = "ABCDEFGH";
        char c = (char)(65 +
                (int)(Math.random()*26));
        if (s.indexOf(c) >= 0) {
            System.out.println("Ok");
        }

        x=(int)(Math.random()*3);
        switch(x) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("default case");
        }

        x=(int)(Math.random()*20);
        System.out.println((x>10)?"Greater":"Less or equal");

        boolean b= ((Math.random()*5)>3)?true:false;

        String s1 = "ABC";
        String s2 = "abc";
        if (s1.compareTo(s2) > 0) {
            System.out.println(s1);
        } else if (s1.compareTo(s2) < 0) {
            System.out.println(s2);
        } else {
            System.out.println("equal");
        }

        c = (char)(65 + (int)(Math.random()*26));
        switch(c) {
            case 'A':
                System.out.println("First");
                break;
            case 'Z':
                System.out.println("Last");
            default:
                System.out.println("Other");
        }

        s = "ABC";
        switch(s) {
            case "as":
                System.out.println("Yes");
            default:
                System.out.println("No");
        }

        //Task 2
        //Написати програму, яка читає з клавіатури два цілих числа
        //X та Y, після чого за допомогою тернарного оператора обраховує
        //вираз X^2-Y^2, якщо Y > 0 >= X, або X + Y в іншому випадку.

    }
}