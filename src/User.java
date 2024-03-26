public class User {
    private String login;
    private Acount acount;

    public User(String login, String password) {
        this.login = login;
        this.acount = new Acount(password);
    }
    private class Acount{
        private String password;

        public Acount(String password) {
            this.password = password;
    }
        public void displayAccount() {
            System.out.println("Вход в аккаунт успешен! "+ login + "\nПароль " + password);
        }
    }
    public void displayAccount() {
        acount.displayAccount();
    }
}
