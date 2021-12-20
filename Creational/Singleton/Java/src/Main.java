public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1 == s2); // true doner cunku s1 ve s2 aynı objeyi referans alır
        System.out.println(s2 == s3); // true doner cunku s2 ve s3 aynı objeyi referans alır
    }
}
