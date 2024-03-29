package main.structural.bridge.app;

import main.structural.bridge.os.PhoneOS;

public class Android implements PhoneOS {

    @Override
    public void upload(String data) {
        System.out.println("Android uploading data: " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Android downloading from: " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("Android displaying data: " + data);
    }
}
