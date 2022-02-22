package ru.netology.manager;

import ru.netology.FilmItem;

import java.awt.event.ItemEvent;

public class FilmManager {

    private FilmItem[] items = new FilmItem[0];
    private int limit = 5;

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {
    }

    public FilmItem[] getItems() {
        return items;
    }

    public void addFilm(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {
        return items;
    }

    public FilmItem[] getAll() {
        FilmItem[] items = findAll();
        int resultLength = 0;
        if (items.length <= limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            if (items.length <= limit) {
            }
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}