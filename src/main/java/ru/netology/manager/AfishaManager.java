package ru.netology.manager;

import ru.netology.domain.AddItem;

public class AfishaManager {
    private AddItem[] items = new AddItem[0];

    public void add(AddItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        AddItem[] tmp = new AddItem[length];
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

    public AddItem[] getAll() {
        int count = items.length;
        if (items.length > 9) {count = 10;}
        AddItem[] result = new AddItem[count];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратно
        if (items.length < 10);{
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
        } return result;
    }

}
