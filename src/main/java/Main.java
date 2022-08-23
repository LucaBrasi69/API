public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иннокентий";
        post.passport = "1408 № 777769";
        post.patronymic = "Русланович";
        post.phone = "+7(999)007-69-69";
        post.surname = "Жмышенко";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 27;
        post.birthday.month = 4;
        post.birthday.year = 1994;
    }
}
