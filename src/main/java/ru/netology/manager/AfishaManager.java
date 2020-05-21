package ru.netology.manager;

import ru.netology.domain.Film;
import ru.netology.repository.AfishaRepository;

public class AfishaManager {

    private AfishaRepository repository = new AfishaRepository();
    private int afishaLength;

    public AfishaManager(int afishaLength) {
        if (afishaLength < 0) {
            afishaLength = 0;
        }
        this.afishaLength = afishaLength;
    }

    private Film[] items = new Film[0];

    public void add(Film item) {
        repository.save(item);
    }

    public Film[] getAll() {
        Film[] items = repository.findAll();
        if (afishaLength > 0) {
            int defaultLength = items.length;
            if (afishaLength > items.length) {
                afishaLength = defaultLength;
            }
            if (items.length > 9) {
                defaultLength = afishaLength;
            }
            Film[] result = new Film[defaultLength];
            // перебираем массив в прямом порядке
            // но кладём в результаты в обратно

            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
        return new Film[afishaLength];
    }
}
