package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class AfishaManagerTest {
    AfishaManager manager = new AfishaManager(1);
    private Film first = new Film(1, 1, "first");
    private Film second = new Film(2, 2, "second");
    private Film third = new Film(3, 3, "third");
    private Film fourth = new Film(4, 4, "fourth");
    private Film fifth = new Film(5, 5, "fifth");
    private Film sixth = new Film(6, 6, "sixth");
    private Film seventh = new Film(7, 7, "seventh");
    private Film eighth = new Film(8, 8, "eighth");
    private Film ninth = new Film(9, 9, "ninth");
    private Film tenth = new Film(10, 10, "tenth");
    private Film eleventh = new Film(11, 11, "eleventh");
    @Test
    public void moreFilmsThan10Set1() {
        AfishaManager manager = new AfishaManager(1);
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


        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{eleventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void moreFilmsThan10DefaultOutput() {
        AfishaManager manager = new AfishaManager(10);
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


        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void zeroFilms() {
        AfishaManager manager = new AfishaManager(0);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void lessFilmsThan10() {
        AfishaManager manager = new AfishaManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);


        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void moreFilmsThan10Set7() {
        AfishaManager manager = new AfishaManager(7);
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


        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void moreFilmsThan10SetMinus10() {
        AfishaManager manager = new AfishaManager(-10);
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


        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void moreFilmsThan10Set100() {
        AfishaManager manager = new AfishaManager(100);
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


        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}