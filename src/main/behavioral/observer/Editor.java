package main.behavioral.observer;

public class Editor {

    public EventManager events = new EventManager("open", "save");

    String file = "";

    void openFile(String fileName) {
        this.file = fileName;
        events.notify("open", file);
    }

    void safeFile() {
        if (file != "") {
            events.notify("save", file);
        }
    }
}
