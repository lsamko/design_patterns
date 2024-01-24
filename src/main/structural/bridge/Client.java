package main.structural.bridge;

import main.structural.bridge.app.Android;
import main.structural.bridge.app.App;
import main.structural.bridge.app.IOS;
import main.structural.bridge.os.Facebook;
import main.structural.bridge.os.Instagram;

public class Client {

    public static void main(String[] args) {
        App app1 = new Facebook(new IOS());
        App app2 = new Instagram(new Android());

        app1.runApp();
        app2.runApp();
    }
}
