package Home6;

import java.util.Arrays;
import java.util.HashSet;

import static Home6.Person.moreTwentyYears;
import static Home6.Person.teska;

public class homework6 {
    public static void main(String[] args) {
        Person p1 = new Person("Maria", "Semenova", 25, "women", 125);
        Person p2 = new Person("Sergey", "Petrov", 37, "men", 277);
        Person p3 = new Person("Petr", "Petrov", 32, "men", 179);
        Person p4 = new Person("Svetlana", "Selezneva", 29, "women", 189);
        Person p5 = new Person("Elena", "Agafonova", 25, "women", 119);
        Person p6 = new Person("Alexey", "Galcov", 33, "men",  177);
        Person p7 = new Person("Svetlana", "Brodnikova", 57, "women", 156);

        System.out.println(p1);  // fn:Maria ln:Semenova age:25 gender:women id:125

        System.out.println(p1 == p2);  // false
        System.out.println(p1.equals( p2 ));  // false
        System.out.println(p2.equals( p3 ));  // true

        HashSet<Person> persons = new HashSet<Person>( Arrays.asList(p1, p2, p3, p4, p5, p6, p7) );

        teska(persons);

        moreTwentyYears( persons );
    }
}

/*
Создать класс Person.
У класса должны быть поля:
1. Имя (String)
2. Фамилия (String)
3. Возраст (продумать тип)
4. Пол
5*. Придумать свои собственные поля
Для этого класса
1. Реализовать методы toString, equals и hashCode.
2*. Придумать собственные методы и реализовать их
В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
 */