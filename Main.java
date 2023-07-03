package HW7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Samsung", "Galaxy S19", 699.99));
        phoneList.add(new Phone("Samsung", "Galaxy S21", 4299.99));
        phoneList.add(new Phone("Apple", "iPhone X", 1849.99));
        phoneList.add(new Phone("Apple", "iPhone 13", 1099.99));
        List<String> samsung = phoneList.stream()
                .filter(phone -> phone.getManufacture().equals("Samsung"))
                .map(Phone::getModel)
                .toList();
        System.out.println(samsung);

        phoneList.stream()
                .sorted()
                .forEach(phone -> System.out.println(phone.getModel() + " - " + phone.getPrice()));
    }
}
