package ru.netology.manager;

import ru.netology.domain.Film;
import ru.netology.repository.AfishaRepository;

public class AfishaManager {

    private AfishaRepository repository;
    private int afishaLength;
    private int defaultAfishaLength = 10;

    public AfishaManager(AfishaRepository repository, int afishalength) {
        this.repository = repository;
        this.afishaLength = afishalength;
    }

    public void add(Film item) {
        repository.save(item);
    }

    public Film[] getAll() {
        Film[] currentAfisha = repository.findAll();
        int currentAfishaLength = repository.findAll().length;
        if (afishaLength > currentAfishaLength) {
            afishaLength = currentAfishaLength;
        }
        if (afishaLength < 0) {
            afishaLength = defaultAfishaLength;
        }
        Film[] result = new Film[afishaLength];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратно

        for (int i = 0; i < result.length; i++) {
            int index = currentAfisha.length - i - 1;
            result[i] = currentAfisha[index];
        }
        return result;
    }
}
