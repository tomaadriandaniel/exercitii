package exercitii;

import javafx.application.Application;
import javafx.stage.Stage;
public class JavFXversion extends Application {
    public static void main(String[] args) { launch(args); }
    @Override public void start(Stage stage) {
        System.out.println("javafx.runtime.version: " + System.getProperty("javafx.runtime.version"));
        System.exit(0);
    }
}