class User {
    private String login;
    public Acount acount;

    public User(String login, String password) {
        this.login = login;
        this.acount = new Acount(password);
    }
    class Acount {
        private String password; // Пароль
        public Acount(String password) {
            this.password = password;
        }
        public void displayAcount() {
            System.out.println("Вход в аккаунт успешен! Авторизоваться: " + login + "\nПароль: " + password);
        }
    }
}