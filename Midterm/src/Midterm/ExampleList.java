package Midterm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TestX{
    public static void main(String[] args) {
        ExampleList<String> exampleList = new ExampleList<>();

        exampleList.add("Test 1");
        exampleList.add("Test 2");
        exampleList.add("Test 3");
        exampleList.add("Test 4");
        exampleList.add("Test 5");
        exampleList.add("Test 6");
        exampleList.add("Test 7");

        for (String str : exampleList){
            System.out.println(str);
        }
    }
}
public class ExampleList<T> implements Iterable<T> {

    private List<T> myList = new ArrayList<>();

    public void add(T value){
        myList.add(value);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(myList);
    }

    public class MyIterator<E> implements Iterator<E> {

        int currentPosition;
        List<E> lists;

        public MyIterator(List<E> lists){
            this.lists = lists;
        }

        @Override
        public boolean hasNext() {
            if (lists.size() >= currentPosition + 1){
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            E value = lists.get(currentPosition);
            currentPosition += 2;
            return value;
        }
    }
}
