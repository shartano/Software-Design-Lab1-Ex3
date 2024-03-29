package se2203.exercise3;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;
public class BeautifulFlowersController implements Initializable {
    @FXML
    private Label roseLbl, callaLilyLbl, cannaLbl, bleedingHeartLbl,
            cherryBlossomLbl;
    @FXML
    private ImageView roseImage, callaLilyImage, cannaImage, bleedingHeartImage,
            cherryBlossomImage;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // ADD LINES FOR TASK #3 HERE
        // Set the values of the five labels controls, using
        // the information provided in the table below
        roseLbl.setText("This beautiful flower and symbol of love belongs the genus Rosa. The family name of this flower is Rosaceae and it contains different other species in almost all parts of the world. The flower of rose vary in size from each other depending upon the species to which they belong. A large number of species of this flower are found in different parts of Asia.");
        callaLilyLbl.setText("One simple and common name of this beautiful flower is arum lily and this flowering plant belongs to the family known as Araceae. This flowering plant is grown well in areas which have reasonable rainfall and moderate temperatures.");
        cannaLbl.setText("This beautiful flowering plant belongs to a genus that contain around 10 species and its family is known as Cannaceae. This flower plant also provides large quantity of starch which is further used for different purposes. This flower is mostly found in tropical regions of the world. The flowers of this plant have three sepals and three petals.");
        bleedingHeartLbl.setText("The bleeding heart flower belongs to the family known as Papaveraceae. This heart shaped flower is famous all over the world due to its unique beauty and is found in great numbers in Siberia and China. Blooming season of this flower starts in spring when there spread beautiful pink heart-shaped flowers in gardens. Lady-in-a-bath is also a common name of this flower.");
        cherryBlossomLbl.setText("Cherry blossom, a beautiful flowering plant is found in different parts of the world including the Northern Hemisphere. It is found in those areas which have moderate climate. All species of this flowering plant do not produce cherries as there are special species of this flower that produce edible cherries.");

        // Set the value the five ImageView controls
        roseImage.setImage(new Image("file:src/main/resources/se2203/exercise3/Rose.gif"));
        callaLilyImage.setImage(new Image("file:src/main/resources/se2203/exercise3/Calla Lily.gif"));
        cannaImage.setImage(new Image("file:src/main/resources/se2203/exercise3/Canna.gif"));
        bleedingHeartImage.setImage(new Image("file:src/main/resources/se2203/exercise3/Bleeding Heart.gif"));
        cherryBlossomImage.setImage(new Image("file:src/main/resources/se2203/exercise3/Cherry Blossom.gif"));


    }
    @FXML
    private TabPane tabPane;

    @FXML
    void NextClick(MouseEvent event) {
        tabPane.getSelectionModel().selectNext();
    }

    @FXML
    void PrevClick(MouseEvent event) {
        tabPane.getSelectionModel().selectPrevious();
    }
}