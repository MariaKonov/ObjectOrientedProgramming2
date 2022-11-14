public class Main {
    public static void main(String[] args) {
        Post poster = new Post();

        poster.name = "Иван";
        poster.passport = "4444 № 44444444";
        poster.patronymic = "Иванович";
        poster.phone = "+7 (999)-999-99-99";
        poster.surname = "Иванов";
        poster.subscription = true;

        poster.birthday = new FormDate();
        poster.birthday.day = 13;
        poster.birthday.month = 6;
        poster.birthday.year = 1999;
    }
}
