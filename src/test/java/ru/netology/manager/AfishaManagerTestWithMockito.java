package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Film;
import ru.netology.repository.AfishaRepository;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class AfishaManagerTestWithMockito {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager = new AfishaManager(repository, 10);
    Film first = new Film(767, 187, "Mockito");
    Film second = new Film(768, 188,"Mockito1");
    Film third = new Film(769, 189,"Mockito2");
    @Test
    void saveFilmWithMock() {
        Film[] returned = new Film[]{first, second, third};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(third);
        manager.add(third);
        Film[] expected = new Film[]{first, second, third};
        Film[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}
