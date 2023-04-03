import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]

        List<Integer> list=new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
        }};
        removeEvenNumber(list);
        System.out.println(list);
    }

    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
//        Вариант 1
//        for (int i = numbers.size()-1; i > 0 ; i--) {
//            if (numbers.get(i) % 2 == 0){
//                numbers.remove(i);
//            }
//        }

//        Вариант 2
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            if (iterator.next()%2 == 0){
                iterator.remove();
            }
        }
    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            try {
                Integer.parseInt(iterator.next());
                iterator.remove();
            } catch (NumberFormatException e){
            }
        }
    }
}
