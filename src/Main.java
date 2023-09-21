import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
/*
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
*/

        //Task 2
        //Написати програму, яка читає з клавіатури два цілих числа
        //X та Y, після чого за допомогою тернарного оператора обраховує
        //вираз X^2-Y^2, якщо Y > 0 >= X, або X + Y в іншому випадку.

        Scanner scanner = new Scanner(System.in);
        double res;
        /*
        System.out.println("Введіть х: ");
        int x = scanner.nextInt();
        System.out.println("Введіть y: ");
        int y = scanner.nextInt();

        if (y > 0 && 0 >= x)
        {
            res = Math.pow(x, 2) - Math.pow(y, 2);
        }
        else
        {
            res = x + y;
        }
        System.out.println("Результат: " + (int)res);
        */

        //Task 3
        //Написати програму, яка читає з клавіатури рядок, що містить
        //арифметичний вираз. Наприклад, "4 + 3", або "-2 -11". Програма
        //повинна обрахувати значення виразу та перевірити, чи воно
        //дорівнює нулю. Якщо дорівнює, програма повинна надрукувати
        //"ТАК", або "НІ" у протилежному випадку.

        String str = scanner.nextLine();
        String[] tok = str.split(" ");
        double a = Integer.parseInt(tok[0]);
        double b = Integer.parseInt(tok[2]);
        String  operand = tok[1];
        System.out.println("0symbol: " + a + "\n1symbol: " + operand + "\n2symbol: " + b);
        switch (operand)
        {
            case "+": a+=b; break;
            case "-": a-=b; break;
            case "*": a*=b; break;
            case "/": if(b != 0) a/=b; else System.out.println("Помилка!!! На 0 не можна ділити!"); break;
        }
        //System.out.println("RES = " + a);
        if (a == 0)
            System.out.println("ТАК");
        else System.out.println("НІ");
    }
}