package main.structural.bridge;

public class Instagram implements App {

    private PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        os.display("cached data");
        os.upload("Instagram data upload");
        os.download("instagram.com");
        os.display("Instagram fresh data");
        System.out.println("-----------------");
    }
}
