package se2203.exercise3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class BeutifulFlowersApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BeutifulFlowersApplication.class.getResource("BeautifulFlowers-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.getIcons().add(new Image("file:src/main/resources/se2203/exercise3/WesternLogo.png"));
        stage.setTitle("Beautiful Flowers");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}