package LectureStuff;

public class TempConversion {
    final static double CELC_FAHR_RATIO = 9.0 / 5;
    final static int FAHREN_EQUIL_POINT = 32;

    static double celsToFahr(double tempInCelsius) {
        return tempInCelsius * CELC_FAHR_RATIO + FAHREN_EQUIL_POINT;
    }

    static double fahrToCels(double tempInFahrenheit) {
        return (tempInFahrenheit - FAHREN_EQUIL_POINT) / CELC_FAHR_RATIO;
    }
}
