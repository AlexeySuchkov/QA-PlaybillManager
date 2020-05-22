package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class AfishaRepositoryTest {
    private AfishaRepository repository = new AfishaRepository();

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
    private Film fifteenth = new Film(15, 15, "fifteenth");

    @BeforeEach
    void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
        repository.save(eleventh);
    }

    @Test
    void findAll() {
        Film[] actual = repository.findAll();
        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        assertArrayEquals(expected, actual);
    }

    @Test
    void save() {
        repository.save(new Film(15, 15, "fifteenth"));
        Film[] actual = repository.findAll();
        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, fifteenth};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findById() {
        Film actual = repository.findById(11);
        Film expected = new Film(11, 11, "eleventh");
        assertEquals(expected, actual);
    }

    @Test
    void removeById() {
        repository.removeById(1);
        Film[] actual = repository.findAll();
        Film[] expected = {second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeByIdThatNotExist() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> repository.removeById(6666) );
    }

    @Test
    void findByIdThatNotExist() {
        repository.findById(6666);
        assertNull(repository.findById(6666));
    }

    @Test
    void removeAll() {
        repository.removeAll();
        Film[] expected = {};
        Film[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}
