package src;

public enum LibraryTopFilms {
    ЗеленаяМиля("Зеленая миля"),
    ПобегИзШоушенка("Побег из Шоушенка"),
    Начало("Начало"),
    Матрица("Матрица"),
    Терминатор("Терминатор");


    private String filmName;


    LibraryTopFilms(String filmName) {
        this.filmName = filmName;
    }


    public String toString() {
        return filmName;
    }

    public static void showFilmName(LibraryTopFilms libraryTopFilms) {
        for (LibraryTopFilms filmName : LibraryTopFilms.values()) {
            System.out.println(filmName.name());
        }
    }

    static void showfilm(LibraryTopFilms filmName) {
        switch (filmName) {
            case ЗеленаяМиля:
                System.out.println("Ви обрали фільм" + filmName.toString());
                return;
            case ПобегИзШоушенка:
                System.out.println("Ви обрали фільм" + filmName.toString());
                return;
            case Начало:
                System.out.println("Ви обрали фільм" + filmName.toString());
                return;
            case Матрица:
                System.out.println("Ви обрали фільм" + filmName.toString());
                return;
            case Терминатор:
                System.out.println("Ви обрали фільм" + filmName.toString());
                return;

        }
    }
}



