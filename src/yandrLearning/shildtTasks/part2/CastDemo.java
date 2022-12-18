package yandrLearning.shildtTasks.part2;

// Демонстрация приведения типов
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;
        x = 10.0;
        y = 3.0;
        i = (int) (x / y); //при приведении double к int, теряется дробная часть числа
        System.out.println("Цeлoчиcлeнный результат деления " + x + "/" + y + "=" + i);
        i = 100;
        b = (byte) i;//информация не теряется - Тип bуtе может содержать значение 1ОО.
        System.out.println("Знaчeниe b: " + b);
        i = 257;
        b = (byte) i;//На этот раз информация теряется - Тип bуtе не может содержать значение 257.
        System.out.println("Знaчeниe b: " + b);
        b = 88; //Представление символа Х в коде ASCII
        ch = (char) b;//Явное приведение несовместимых типов
        System.out.println("ch: " + ch);
    }
}

