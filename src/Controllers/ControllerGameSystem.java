package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGameSystem implements Initializable {


    @FXML
    private Button btnPlayComp;

    @FXML
    private Button btnPlayFriend;

    public static boolean isFriendly = false ;


    @Override
    public void initialize(URL location, ResourceBundle resources) {



    }



    @FXML
    void btnPlayCompOnAction(ActionEvent event) throws IOException {

        showStage("difficultyLevel");

    }

    @FXML
    void btnPlayFriendOnAction(ActionEvent event) throws IOException {

        isFriendly = true ;
        showStage("ticTacGame");

    }

    private void showStage(String ClassXmlName) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/View/"+ClassXmlName.concat(".fxml")));
        Main.stage.setScene(new Scene(root));
        Main.stage.centerOnScreen();
        Main.stage.show();

    }




}
