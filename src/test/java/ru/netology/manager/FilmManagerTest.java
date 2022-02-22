package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.FilmItem;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    private FilmManager afisha = new FilmManager();
    private FilmManager limitFilms = new FilmManager(3);
    private FilmItem first = new FilmItem(1, "image1", "name1", "genre1");
    private FilmItem second = new FilmItem(2, "image2", "name2", "genre2");
    private FilmItem third = new FilmItem(3, "image3", "name3", "genre3");
    private FilmItem fourth = new FilmItem(4, "image4", "name4", "genre4");
    private FilmItem fifth = new FilmItem(5, "image5", "name5", "genre5");
    private FilmItem sixth = new FilmItem(6, "image6", "name6", "genre6");

//addFilm

    @Test
    void addFilmOne() {
        afisha.addFilm(first);

        FilmItem[] actual = afisha.getItems();
        FilmItem[] expected = new FilmItem[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void addFilmTest() {

        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);

        FilmItem[] actual = afisha.getItems();
        FilmItem[] expected = new FilmItem[]{first, second, third, fourth};
        assertArrayEquals(expected, actual);
    }

    @Test
    void addFilmMore5() {
        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);
        afisha.addFilm(fifth);
        afisha.addFilm(sixth);

        FilmItem[] actual = afisha.getItems();
        FilmItem[] expected = new FilmItem[]{first, second, third, fourth, fifth, sixth};

        assertArrayEquals(expected, actual);
    }

    //getAll вывод в обратном порядке
    @Test
    void getAllMore3() {
        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);

        FilmItem[] actual = afisha.getAll();
        FilmItem[] expected = new FilmItem[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllLimit() {
        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);
        afisha.addFilm(fifth);

        FilmItem[] actual = afisha.getAll();
        FilmItem[] expected = new FilmItem[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllLessLimit() {
        afisha.addFilm(first);
        afisha.addFilm(second);

        FilmItem[] actual = afisha.getAll();
        FilmItem[] expected = new FilmItem[]{second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllMoreLimit() {
        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);
        afisha.addFilm(fifth);
        afisha.addFilm(sixth);

        FilmItem[] actual = afisha.getAll();
        FilmItem[] expected = new FilmItem[]{sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

}