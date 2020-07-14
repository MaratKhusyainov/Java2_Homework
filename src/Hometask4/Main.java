package Hometask4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("chat.fxml"));//корневой узел
        primaryStage.setTitle("Chat");
        Scene scene = new Scene(root, 300,275);//установка сцены в окне и создание сцены
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());
        primaryStage.show();
    }

    public static void main (String[] args) {
        launch(args);
    }
}
