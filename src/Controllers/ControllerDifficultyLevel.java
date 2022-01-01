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

public class ControllerDifficultyLevel implements Initializable {

    @FXML
    private Button btnEasy;

    @FXML
    private Button btnHard;

    @FXML
    private Button btnBack;

    public static boolean isHard = false  , isEasy = false ;


    @Override
    public void initialize(URL location, ResourceBundle resources) {





    }



    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {

        showStage("gameSystem");

    }

    @FXML
    void btnEasyOnAction(ActionEvent event) throws IOException {

        setGameSystem("easy");
        showStage("ticTacGame");


    }

    @FXML
    void btnHardOnAction(ActionEvent event) throws IOException {

        setGameSystem("hard");
        showStage("ticTacGame");

    }

    private void showStage(String ClassXmlName) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/View/"+ClassXmlName.concat(".fxml")));
        Main.stage.setScene(new Scene(root));
        Main.stage.centerOnScreen();
        Main.stage.show();

    }

    private void setGameSystem(String typeGameSystem ){

        if ( typeGameSystem.equalsIgnoreCase("hard")){

            isHard = true ;
            isEasy = false ;
            ControllerGameSystem.isFriendly = false ;

        }else if ( typeGameSystem.equalsIgnoreCase("easy")){

            isEasy = true ;
            isHard = false ;
            ControllerGameSystem.isFriendly = false ;

        }else {

            isEasy = false ;
            isHard = false ;
            ControllerGameSystem.isFriendly = true ;

        }

    }




}

