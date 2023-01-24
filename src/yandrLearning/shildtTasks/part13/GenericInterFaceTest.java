package yandrLearning.shildtTasks.part13;

public class GenericInterFaceTest {
    public static void main(String[] args) {
        Integer x[] = { 1, 2, 3, 4 };
        MyClass<Integer> ob =  new MyClass(x) ;
        System.out.println(ob.contains(2));
        System.out.println(ob.contains(5));
//        System.out.println(ob.contains(5.25));

    }
}

interface Containment<T> {
    boolean contains(T o);
}

class MyClass<T> implements Containment<T> {
    /*    Любой класс, реализующий обобщенный интерфейс,
        также должен быть обобщенным или указать тип прир объявлении класса:
        class MyClass implements Containment<Integer> */
    T[] arrayRef;

    public MyClass(T[] arrayRef) {
        this.arrayRef = arrayRef;
    }

    @Override
    public boolean contains(T o) {
        for (T x:arrayRef) {
            if (x.equals(o))return true;
        }
        return false;
    }
}