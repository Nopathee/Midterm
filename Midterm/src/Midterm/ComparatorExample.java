package Midterm;

import java.text.CollationElementIterator;
import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Water" , "Drink" , 10F , 100));
        items.add(new Item("Lay" , "snack" , 20F , 20));
        items.add(new Item("Chocolate" , "snack" , 55.55F , 50));
        items.add(new Item("Pencil" , "tool" , 13.25F , 1000));
        items.add(new Item("Paper" , "tool" , 2.5F , 10000));
        items.add(new Item("Coke" , "Drink" , 18F , 20));

        Collections.sort(items);

//        items.sort(new Comparator<Item>() {
//            @Override
//            public int compare(Item o1, Item o2) {
//                return (int) -(o1.getPrice() - o2.getPrice());
//            }
//        });

        for (Item item : items){
            System.out.printf(
                    "Name: %s, category : %s , Price : %.2f , Stock : %d%n",
                    item.getName(),item.getCategory(),item.getPrice(),item.getStocks()
            );
        }
    }
}

class Item implements Comparable<Item>{
    private String name;
    private String category;
    private float price;
    private int stocks;

    public Item(String name, String category, float price, int stocks) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public int getStocks() {
        return stocks;
    }

    @Override
    public int compareTo(Item o) {
        //sort by category first then sort by name

        if (this.getCategory().equalsIgnoreCase(o.getCategory())){
            return this.getName().compareToIgnoreCase(o.getName());
        }
        return this.getCategory().compareToIgnoreCase(o.getCategory());
    }
}
