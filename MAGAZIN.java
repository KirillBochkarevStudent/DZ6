import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MAGAZIN {
    public static void main(String[] args) {
        NOTEBOOK notebook1 = new NOTEBOOK("ASUS", "Windows", 16, 11, "Red");
        NOTEBOOK notebook2 = new NOTEBOOK("ACER", "Windows", 32, 15, "Black");
        NOTEBOOK notebook3 = new NOTEBOOK("MAC", "Ios", 16, 12, "White");

        HashSet<NOTEBOOK> hashSet = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3));
        filtr(args, hashSet);
    }

    public static void filtr(String[] args, HashSet<NOTEBOOK> hashSet) {
        HashSet<NOTEBOOK> hashSett = new HashSet<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:\r\n" +
                "1 - Модель\r\n" +
                "2 - Операционная система\r\n" +
                "3 - Оперативная память в ГБ\r\n" +
                "4 - Размер ноутбука (диагональ)\r\n" +
                "5 - Цвет ноутбука");

        Scanner scanner = new Scanner(System.in);
        String fil = scanner.nextLine();
        int k = Integer.parseInt(fil);
        if (k == 1) {
            System.out.println("Какую модель вы ищете? (Введите ASUS, ACER или MAC)");
            String fil1 = scanner.nextLine();
            for (NOTEBOOK el : hashSet) {
                if (el.model.equals(fil1)) {
                    hashSett.add(el);
                }
            }
        }
        if (k == 2) {
            System.out.println("Ноутбук с какой операционной системой вы ищете? (Введите Windows или Ios)");
            String fil1 = scanner.nextLine();
            for (NOTEBOOK el : hashSet) {
                if (el.opsistem.equals(fil1)) {
                    hashSett.add(el);
                }
            }
        }
        if (k == 3) {
            System.out.println("Сколько вам надо оперативной памяти? (Введите минимальное значение)");
            String fil1 = scanner.nextLine();
            int f = Integer.parseInt(fil1);
            for (NOTEBOOK el : hashSet) {
                int fil2 = el.randaccessmemory;
                if (fil2 >= f) {
                    hashSett.add(el);
                }
            }
        }
        if (k == 4) {
            System.out.println("Какая диагональ вам нужна? (Введите минимальное значение в Дюймах)");
            String fil1 = scanner.nextLine();
            int f = Integer.parseInt(fil1);
            for (NOTEBOOK el : hashSet) {
                int fil2 = el.size;
                if (fil2 >= f) {
                    hashSett.add(el);
                }
            }
        }
        if (k == 5) {
            System.out.println("Какого цвета вам нужен ноутбук? (Введите цвет: Red, Black ... )");
            String fil1 = scanner.nextLine();
            for (NOTEBOOK el : hashSet) {
                if (el.color.equals(fil1)) {
                    hashSett.add(el);
                }
            }
        }
        for (NOTEBOOK el : hashSett) {
            System.out.println(el);
        }
    }
}
