package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AddItem;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    @Test
    public void lessFilmsThan10() {
        AfishaManager manager = new AfishaManager();
        AddItem first = new AddItem(1, 1, "first");
        AddItem second = new AddItem(2, 2, "second");
        AddItem third = new AddItem(3, 3, "third");
        manager.add(first);
        manager.add(second);
        manager.add(third);



        AddItem[] actual = manager.getAll();
        AddItem[] expected = new AddItem[]{third, second, first};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void MoreFilmsThan10() {
        AfishaManager manager = new AfishaManager();
        AddItem first = new AddItem(1, 1, "first");
        AddItem second = new AddItem(2, 2, "second");
        AddItem third = new AddItem(3, 3, "third");
        AddItem fourth = new AddItem(4, 4, "fourth");
        AddItem fifth = new AddItem(5, 5, "fifth");
        AddItem sixth = new AddItem(6, 6, "sixth");
        AddItem seventh = new AddItem(7, 7, "seventh");
        AddItem eighth = new AddItem(8, 8, "eighth");
        AddItem ninth = new AddItem(9, 9, "ninth");
        AddItem tenth = new AddItem(10, 10, "tenth");
        AddItem eleventh = new AddItem(11, 11, "eleventh");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        AddItem[] actual = manager.getAll();
        AddItem[] expected = new AddItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        // assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }
}