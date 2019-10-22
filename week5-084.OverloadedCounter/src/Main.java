public class Main {
    public static void main(String[] args) {
        Counter c = new Counter(2, false);
c.decrease();
c.decrease();
c.decrease();
System.out.println(c.value());
    }
}
