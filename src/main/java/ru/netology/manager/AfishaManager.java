package ru.netology.manager;

import ru.netology.domain.Film;

public class AfishaManager {
    private int afishaLength = 10;

    public AfishaManager(int afishaLength) {
        if (afishaLength < 0) {
            afishaLength = 0;
        }
        this.afishaLength = afishaLength;
    }


    private Film[] items = new Film[0];


    public void add(Film item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Film[] getAll() {
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
