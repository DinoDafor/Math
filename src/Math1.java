

import java.util.InputMismatchException;
import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {

        GaussMethodMainElement task = new GaussMethodMainElement();


        task.beginWork();


//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите n(n<=20): ");
//        int n = in.nextInt();
//        double[][] a = new double[n][n];
//        double[] b = new double[n];
//        double[] c = new double[n];
//        double[] x = new double[n];
//        int l;
//        double det = 1;
//        double[] r = new double[n];
//        double[][] aOld = new double[n][n];
//        double[] bOld = new double[n];
//
//        int count = 0;
//
//        System.out.println("Введите матрицу A: ");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                a[i][j] = in.nextInt();
//                aOld[i][j] = a[i][j];
//            }
//        }
//        System.out.println("Введите вектор B: ");
//        for (int i = 0; i < b.length; i++) {
//            b[i] = in.nextInt();
//            bOld[i] = b[i];
//        }
//        System.out.println("Исходная матрица A и вектор B: ");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                int numbers = j;
//                System.out.print("\u001B[34m" + a[i][j] + "*x" + (numbers + 1) + "  ");
//                if (j == a.length - 1) {
//                    System.out.println("\t" + "\u001B[35m" + b[i]);
//                    System.out.println("\n");
//                }
//            }
//        }
//        //todo sout верна ли? перезаписать данные
//        //todo начинаем
//        for (int j = 0; j < a.length; j++) { //по строке
//            l = j;
//            for (int i = j; i < a.length; i++) { //по столбцу
//
//                if (a[i][j] > a[l][j]) { //todo добавить сравнение по модулю
//                    l = i;
//                }
//            }
//            //перестановка в массиве
//
//            if (l != j) { // если самый большой элемент не на первом месте, то надо поменять их местами
//                count++;
//                for (int permutation = 0; permutation < a.length; permutation++) {
//                    c[permutation] = a[j][permutation];
//                    a[j][permutation] = a[l][permutation];
//                    a[l][permutation] = c[permutation];
//                }
//                c[0] = b[j];
//                b[j] = b[l];
//                b[l] = c[0];
////Вывод пока что для отладки
//                System.out.println("Переставили строки " + (j + 1) + " и " + (l + 1) + " местами.");
//                for (int g = 0; g < a.length; g++) {
//                    for (int f = 0; f < a.length; f++) {
//                        int numbers = f;
//                        System.out.print("\u001B[34m" + a[g][f] + "*x" + (numbers + 1) + "  ");
//                        if (f == a.length - 1) {
//                            System.out.println("\t" + "\u001B[35m" + b[g]);
//                            System.out.println("\n");
//                        }
//                    }
//                }
//
//            }
//
//
//            //todo if и перестановка значений если а = 0;
//
//            for (int m = j + 1; m < a.length; m++) {
//                double per = a[m][j] / a[j][j];
//
//                for (int k = 0; k < a.length; k++) {
//                    a[m][k] = a[m][k] - a[j][k] * per;
//                }
//                b[m] = b[m] - b[j] * per;
//
//            }
//
//
//            //удаляем иксы...
////todo?
//            System.out.println("Удалили из матрицы х");
//            for (int g = 0; g < a.length; g++) {
//                for (int f = 0; f < a.length; f++) {
//                    int numbers = f;
//                    System.out.print("\u001B[34m" + a[g][f] + "*x" + (numbers + 1) + "  ");
//                    if (f == a.length - 1) {
//                        System.out.println("\t" + "\u001B[35m" + b[g]);
//                        System.out.println("\n");
//                    }
//                }
//            }
//
//        }
//
//        //обратный ход
//        for (int i = n-1; i > -1; i--) {
//            double s = 0;
//            for (int j = i + 1; j < n; j++) {
//                s = s + a[i][j]*x[j];
//            }
//            x[i] = (b[i]-s)/a[i][i];
//        }
//
//
//        //вывод определителя
//        for (int i = 0; i < a.length; i++) {
//
//            det = det *a[i][i];
//        }
//        det = det* Math.pow(-1, count);
//        System.out.println("Определитель равен: " + det);
//
//
//
//
////Вывод результатов
//        for (int i = 0; i < x.length; i++) {
//            System.out.println("X равен : " +  x[i]);
//        }
//
//
//        //Вывод невязки
//        for (int i = 0; i <r.length ; i++) {
//            for (int j = 0; j < r.length; j++) {
//                r[i] += aOld[i][j] * x[j];
//            }
//            r[i] = r[i] - bOld[i];
//            System.out.println("Невязка равна: " + r[i]);
//        }


    }


}

class GaussMethodMainElement {
    //Сканнер для считывания данных с клавиатуры пользователя.
    Scanner in = new Scanner(System.in);
    //Размер квадратного массива.
    int n;
    //Массив для хранения матрицы системы.
    double[][] a;
    //Массив для хранения правых частей.
    double[] b;
    //Дополнительный массив, нужен для перестановки строк местами.
    double[] c;
    //Массив для хранения вектора неизвестных.
    double[] x;
    //Массив для хранения невязок.
    double[] r;
    //Массив для хранения изначальной матрицы системы, нужен будет для нахождения невязки.
    double[][] aOld;
    //Массив для хранения правых частей, нужен будет для нахождения невязки.
    double[] bOld;
    //Счётчик, нужен будет для определения знака детерминанта.
    int count = 0;

    boolean haveAnswer = true;

    //Главная точка входа из main`a. Является функцией-телом класса.
    public void beginWork() {
        while (true) {
            System.out.println("\u001B[36m" + " Здравствуйте! Данная программа помогает решать СЛАУ Методом Гаусса с выбором главного элемента.");
            System.out.print("Введите n(n<=20): ");
            try {
                n = Integer.parseInt(in.next().trim());
                if (n > 0 && n <= 20) {
                    a = new double[n][n];
                    b = new double[n];
                    c = new double[n];
                    x = new double[n];
                    r = new double[n];
                    aOld = new double[n][n];
                    bOld = new double[n];

                    System.out.println("Если хотите ввести данные вручную, то напишите \"1\" без двойных ковычек и нажмите Enter.");
                    System.out.println("Если хотите считать данные с файла, то напишите \"2\" без двойных ковычек и нажмите на Enter.");
                    System.out.println("Любите всегда получать что-то новое? Тогда напишите \"3\" и Мы заполним систему за вас!");
                    int choice = Integer.parseInt(in.next().trim());
                    if (choice == 1) {
                        this.readDataFromUser();
                    } else if (choice == 2) {
                        this.readDataFromFile();
                    } else if (choice == 3) {
                        System.out.println("Отлично, Вы выбрали случайное заполнение. Введите сколько хотите цифр в числе.");
                        this.randomNumbers(Integer.parseInt(in.next().trim()));
                        //todo рандом
                    } else {

                        throw new InputMismatchException();

                    }

                    this.findAnswer();

                } else {
                    System.out.println("Введите n от 1 до 20!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вводите строго числа! Для n - целочисленное.");
            } catch (InputMismatchException e) {
                System.out.println("Введите строго  \"1\" или  \"2\" или  \"3\"!");
            }


        }
    }

    //Функция для считывания данных с клавиатуры пользователя.
//Заполняет массив A, затем массив B. Также заполняет заполняет ещё один массив для А и Б, чтобы потом вычислить невязку.
//Также выводит на экран СЛАУ для ознакомления пользователю.
    public void readDataFromUser() {
        //todo проверку
        System.out.println("Введите матрицу A: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = Double.parseDouble(in.next().replace(",", ".").trim());
                aOld[i][j] = a[i][j];
            }
        }
        System.out.println("Введите вектор B: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = Double.parseDouble(in.next().replace(",", ".").trim());
            bOld[i] = b[i];
        }
        System.out.println("Исходная матрица A и вектор B: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int numbers = j;
                System.out.print("\u001B[34m" + a[i][j] + "*x" + (numbers + 1) + "  ");
                if (j == a.length - 1) {
                    System.out.println("\t" + "\u001B[35m" + b[i]);
                    System.out.println("\n");
                }
            }
        }
    }

    public void readDataFromFile() {
        //todo сделать чтение из файла
    }

    //Функция для нахождения треугольной матрицы. Включает себя перестановку строк, прямой и обратный ход.
    public void findAnswer() {
        for (int j = 0; j < a.length; j++) { //по строке
            int l = j;
            for (int i = j; i < a.length; i++) { //по столбцу
                if (Math.abs(a[i][j]) > Math.abs(a[l][j])) {
                    l = i;
                }

            }
            if (a[l][j] == 0) {
                System.out.println("Нет решения, т.к. определитель равен нулю.");
                haveAnswer = false;
                break;
            }

            //Здесь мы делаем перестановку строк (Выбор главного элемента).
            if (l != j) {
                count++;
                for (int permutation = 0; permutation < a.length; permutation++) {
                    c[permutation] = a[j][permutation];
                    a[j][permutation] = a[l][permutation];
                    a[l][permutation] = c[permutation];
                }
                c[0] = b[j];
                b[j] = b[l];
                b[l] = c[0];
//Уведомляем пользователя о каждой перестановке строк.
                System.out.println("Переставили строки " + (j + 1) + " и " + (l + 1) + " местами.");
                for (int g = 0; g < a.length; g++) {
                    for (int f = 0; f < a.length; f++) {
                        int numbers = f;
                        System.out.print("\u001B[34m" + a[g][f] + "*x" + (numbers + 1) + "  ");
                        if (f == a.length - 1) {
                            System.out.println("\t" + "\u001B[35m" + b[g]);
                            System.out.println("\n");
                        }
                    }
                }

            }


            //todo if и перестановка значений если а = 0;

//            //если элемент на  главной диагонали равен нулю, то
//            if (a[j][j] == 0) {
//                l = j;
//                for (int i = j; i < a.length; i++) { //по столбцу
//                    if (a[i][j] != 0) {
//                        l = i;
//                    }
//                }
//                if (l != j) {
//                    count++;
//                    for (int permutation = 0; permutation < a.length; permutation++) {
//                        c[permutation] = a[j][permutation];
//                        a[j][permutation] = a[l][permutation];
//                        a[l][permutation] = c[permutation];
//                    }
//                    c[0] = b[j];
//                    b[j] = b[l];
//                    b[l] = c[0];
//                } else {
//                    //todo подправить
//                    System.out.println("Решения нет!!!");
//                    break;
//                }
//
//
//
//            }

            //Удаляем Х
            for (int m = j + 1; m < a.length; m++) {
                double per = a[m][j] / a[j][j];

                for (int k = 0; k < a.length; k++) {
                    a[m][k] = a[m][k] - a[j][k] * per;
                }
                b[m] = b[m] - b[j] * per;

            }


            //удаляем иксы...
//todo?
            System.out.println("\u001B[36m" + "Удалили из матрицы х");
            for (int g = 0; g < a.length; g++) {
                for (int f = 0; f < a.length; f++) {
                    int numbers = f;
                    System.out.print("\u001B[34m" + a[g][f] + "*x" + (numbers + 1) + "  ");
                    if (f == a.length - 1) {
                        System.out.println("\t" + "\u001B[35m" + b[g]);
                        System.out.println("\n");
                    }
                }
            }


        }
        if (haveAnswer) {
            this.findDeterminant();
            this.findX();
            //todo добавить
            this.showUnknownColumn();
            this.findResidual();
        }
        haveAnswer = true;

    }

    //Функция для вывода невязки на экран пользователю.
//Расчитывается по формуле Ax* - B;
    public void findResidual() {

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
                r[i] += aOld[i][j] * x[j];
            }
            r[i] = r[i] - bOld[i];
            System.out.println("Невязка для " + (i + 1) + " уравнения равна: " + r[i]);
        }
    }

    //Функция для  нахождения и вывода детерминанта на экран пользователю.
//Используется формула (-1)^k * П a[i][i], где k количество перестановок
    public void findDeterminant() {
        double det = 1;
        for (int i = 0; i < a.length; i++) {
            det = det * a[i][i];
        }
        det = det * Math.pow(-1, count);
    }

    //Функция для вывода столбца неизвестных пользователю на экран.
    public void showUnknownColumn() {
        for (int i = 0; i < x.length; i++) {
            System.out.println("X" + (i + 1) + " равен : " + x[i]);
        }
    }

    //    //Функция для вывода треугольной матрицы на экран пользователю.
//    public void showTriangularMatrix() {
//        //todo оптимизировать sout
//        for (int g = 0; g < a.length; g++) {
//            for (int f = 0; f < a.length; f++) {
//                int numbers = f;
//                System.out.print("\u001B[34m" + a[g][f] + "*x" + (numbers + 1) + "  ");
//                if (f == a.length - 1) {
//                    System.out.println("\t" + "\u001B[35m" + b[g]);
//                    System.out.println("\n");
//                }
//            }
//        }
//    }
//Метод для нахождения неизвестных.
    public void findX() {
        for (int i = n - 1; i > -1; i--) {
            double s = 0;
            for (int j = i + 1; j < n; j++) {
                s = s + a[i][j] * x[j];
            }
            x[i] = (b[i] - s) / a[i][i];
        }
    }

    //Метод для получения случайных коэфициентов для системы.
    public void randomNumbers(int number) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.pow(10, number) * Math.random();
            }
            b[i] = Math.pow(10, number) * Math.random();
        }
    }
}