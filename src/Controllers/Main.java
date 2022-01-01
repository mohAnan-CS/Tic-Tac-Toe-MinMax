package Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage stage ;

    @Override
    public void start(Stage primaryStage) throws Exception{

        stage = primaryStage ;
        Parent root = FXMLLoader.load(getClass().getResource("/View/gameSystem.fxml"));
        primaryStage.setTitle("Tic-Tac");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/ticTacLogoRed.png")));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.centerOnScreen();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
