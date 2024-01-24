package main.structural.bridge;

public class Facebook implements App {

    private PhoneOS os;

    public Facebook(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        os.upload("Facebook data upload");
        os.download("facebook.com");
        os.display("Facebook data download");
        System.out.println("-----------------");
    }
}
