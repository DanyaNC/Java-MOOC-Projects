import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private String password;
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.password = "";
    }

    public String createPassword() {
        this.password = "";
        for(int i = 0; i < this.length; i++) {
            int number = this.random.nextInt(26);
            this.password += "abcdefghijklmnopqrstuvwxyz".charAt(number);
        }
        return this.password;
    }
}
