import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        if ((5 - Math.random()) > 0) {
            System.out.println("1: Ok");
        }

        if (!true) {
            System.out.println("2: Ok");
        }

        int x=3;
        int y = (int)(Math.random() * 10);
        if ((x < y) && (x > 3)) {
            System.out.println("3: Yes");
        } else {
            System.out.println("3: No");
        }

        x=3;
        y = (int)(Math.random() * 10);
        if ((x < y) && (x >= 3)) {
            System.out.println("4: Yes");
        } else {
            System.out.println("4: No");
        }

        x=3;
        y = (int)(Math.random() * 10);
        if ((x < y) || (x > 3)) {
            System.out.println("5: Yes");
        } else {
            System.out.println("5: No");
        }

        x=3;
        y = (int)(Math.random() * 10);
        if ((x < y) || (x >= 3)) {
            System.out.println("6: Yes");
        } else {
            System.out.println("6: No");
        }

        double d = Math.random() * 100;
        if (d > 75) {
            System.out.println(d*d);
        } else if (d > 50) {
            System.out.println("7: " + Math.sqrt(d));
        } else if (d > 25) {
            System.out.println("7: " + d+d);
        } else {
            System.out.println("7: " + d);
        }

        String s = "ABCDEFGH";
        char c = (char)(65 +
                (int)(Math.random()*26));
        if (s.indexOf(c) >= 0) {
            System.out.println("8: Ok");
        }

        x=(int)(Math.random()*3);
        switch(x) {
            case 1:
                System.out.println("9: Case 1");
                break;
            case 2:
                System.out.println("9: Case 2");
                break;
            case 3:
                System.out.println("9: Case 3");
                break;
            default:
                System.out.println("9: default case");
        }

        x=(int)(Math.random()*20);
        System.out.println("10: ");
        System.out.println((x>10)?"Greater":"Less or equal");

        boolean b= ((Math.random()*5)>3)?true:false;

        String s1 = "ABC";
        String s2 = "abc";
        if (s1.compareTo(s2) > 0) {
            System.out.println("12: " + s1);
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("12: " + s2);
        } else {
            System.out.println("12: equal");
        }

        c = (char)(65 + (int)(Math.random()*26));
        switch(c) {
            case 'A':
                System.out.println("13: First");
                break;
            case 'Z':
                System.out.println("13: Last");
            default:
                System.out.println("13: Other");
        }

        s = "ABC";
        switch(s) {
            case "as":
                System.out.println("14: Yes");
            default:
                System.out.println("14: No");
        }

        //Task 2
        //Написати програму, яка читає з клавіатури два цілих числа
        //X та Y, після чого за допомогою тернарного оператора обраховує
        //вираз X^2-Y^2, якщо Y > 0 >= X, або X + Y в іншому випадку.

        Scanner scanner = new Scanner(System.in);
        double res;
        System.out.println("Введіть х: ");
        int x1 = scanner.nextInt();
        System.out.println("Введіть y: ");
        int y1 = scanner.nextInt();

        if (y1 > 0 && 0 >= x1)
        {
            res = Math.pow(x1, 2) - Math.pow(y1, 2);
        }
        else
        {
            res = x1 + y1;
        }
        System.out.println("Результат: " + (int)res);

        //Task 3
        //Написати програму, яка читає з клавіатури рядок, що містить
        //арифметичний вираз. Наприклад, "4 + 3", або "-2 -11". Програма
        //повинна обрахувати значення виразу та перевірити, чи воно
        //дорівнює нулю. Якщо дорівнює, програма повинна надрукувати
        //"ТАК", або "НІ" у протилежному випадку.
        scanner.nextLine();
        System.out.println("Введіть арифметичний вираз: ");
        String str = scanner.nextLine();
        scanner.close();
        String[] tok = str.split(" ");
        double a = Integer.parseInt(tok[0]);
        double b1 = Integer.parseInt(tok[2]);
        String  operand = tok[1];
        //System.out.println("0symbol: " + a + "\n1symbol: " + operand + "\n2symbol: " + b);
        switch (operand)
        {
            case "+": a+=b1; break;
            case "-": a-=b1; break;
            case "*": a*=b1; break;
            case "/": if(b1 != 0) a/=b1; else System.out.println("Помилка!!! На 0 не можна ділити!"); break;
        }
        System.out.println("Результат = " + a);
        if (a == 0)
            System.out.println("ТАК");
        else System.out.println("НІ");
    }
}