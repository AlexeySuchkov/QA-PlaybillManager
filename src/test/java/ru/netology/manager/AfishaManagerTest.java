package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AddItem;


import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    @Test
    public void MoreFilmsThan10Set1() {
        AfishaManager manager = new AfishaManager(1);
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
        AddItem[] expected = new AddItem[]{eleventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void MoreFilmsThan10DefaultOutput() {
        AfishaManager manager = new AfishaManager(10);
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

        assertArrayEquals(expected, actual);
    }

    @Test
    public void zeroFilms() {
        AfishaManager manager = new AfishaManager(0);
        AddItem first = new AddItem(1, 1, "first");
        AddItem second = new AddItem(2, 2, "second");
        AddItem third = new AddItem(3, 3, "third");
        manager.add(first);
        manager.add(second);
        manager.add(third);

        AddItem[] actual = manager.getAll();
        AddItem[] expected = new AddItem[]{};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void lessFilmsThan10() {
        AfishaManager manager = new AfishaManager(5);
        AddItem first = new AddItem(1, 1, "first");
        AddItem second = new AddItem(2, 2, "second");
        AddItem third = new AddItem(3, 3, "third");
        manager.add(first);
        manager.add(second);
        manager.add(third);


        AddItem[] actual = manager.getAll();
        AddItem[] expected = new AddItem[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void MoreFilmsThan10Set7() {
        AfishaManager manager = new AfishaManager(7);
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
        AddItem[] expected = new AddItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void MoreFilmsThan10SetMinus10() {
        AfishaManager manager = new AfishaManager(-10);
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
        AddItem[] expected = new AddItem[]{};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void MoreFilmsThan10Set100() {
        AfishaManager manager = new AfishaManager(100);
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
        AddItem[] expected = new AddItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}