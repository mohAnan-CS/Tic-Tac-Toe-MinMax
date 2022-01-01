package Controllers;
import javafx.scene.media.*;
import Project.TicTac;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerTicTacGame implements Initializable {

    @FXML
    private Text textCompOrPlayer;

    @FXML
    private Text textResultFirst;

    @FXML
    private Text textResultMid;

    @FXML
    private Text textResultLast;

    @FXML
    private Button btn3;

    @FXML
    private Button btn6;

    @FXML
    private Button btn9;

    @FXML
    private Button btn5;

    @FXML
    private Button btn2;

    @FXML
    private Button btn1;

    @FXML
    private Button btn4;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Text xoTurn;

    public int gameSystem = 5;
    public boolean turnPlayer1 = true ;
    public char[][] board = new char[3][3];

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttonsTextFillEmpty();
        startGame();
        gameSystem = checkGameSystem();



    }

    private void startGame(){

        TicTac ticTac = new TicTac();
        ticTac.fillTowDimitionalArray(board);
    }

    public void buttonsTextFillEmpty(){

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");


    }

    public void reverseTurn(){

        if (xoTurn.getText().equalsIgnoreCase("x")){
            turnPlayer1 = false ;
            xoTurn.setText("o");
        }else{
            turnPlayer1 = true ;
            xoTurn.setText("x");
        }

    }

    @FXML
    void btn1OnAction(ActionEvent event) throws MalformedURLException {

        if (gameSystem == 0 ) {

            playFriendly(board, turnPlayer1, "00");
            if (turnPlayer1) {
                btn1.setText("x");
                playSound("xSound");
            } else {
                btn1.setText("o");
                playSound("oSound");
            }
            btn1.setDisable(true);
            reverseTurn();

        }else if ( gameSystem == 1 ){

            playEasyComputer(board, turnPlayer1, "00");
            if (turnPlayer1) {
                btn1.setText("x");
                playSound("xSound");
            }
            btn1.setDisable(true);
            reverseTurn();
            computerPressButton();
            playEasyComputer(board , turnPlayer1 , "00");
            reverseTurn();

        }else {


            if (turnPlayer1) {
                btn1.setText("x");
                playSound("xSound");
            }
            btn1.setDisable(true);
            reverseTurn();
            computerPressButton();
            playEasyComputer(board , turnPlayer1 , "00");
            reverseTurn();

        }

    }

    @FXML
    void btn2OnAction(ActionEvent event) throws MalformedURLException {

        if (gameSystem == 0 ) {
            playFriendly(board, turnPlayer1, "01");
            if (turnPlayer1) {
                btn2.setText("x");
                playSound("xSound");
            } else {
                btn2.setText("o");
                playSound("oSound");
            }
            btn2.setDisable(true);
            reverseTurn();
        }else if ( gameSystem == 1 ){

            playEasyComputer(board, turnPlayer1, "01");
            if (turnPlayer1) {
                btn2.setText("x");
                playSound("xSound");
            }
            btn2.setDisable(true);
            reverseTurn();
            computerPressButton();
            playEasyComputer(board , turnPlayer1 , "00");
            reverseTurn();

        }

    }

    @FXML
    void btn3OnAction(ActionEvent event) throws MalformedURLException {

        if (gameSystem == 0 ) {
            playFriendly(board, turnPlayer1, "02");
            if (turnPlayer1) {
                btn3.setText("x");
                playSound("xSound");
            } else {
                btn3.setText("o");
                playSound("oSound");
            }
            btn3.setDisable(true);
            reverseTurn();
        }else if ( gameSystem == 1 ){

            playEasyComputer(board, turnPlayer1, "02");
            if (turnPlayer1) {
                btn3.setText("x");
                playSound("xSound");
            }
            btn3.setDisable(true);
            reverseTurn();
            computerPressButton();
            playEasyComputer(board , turnPlayer1 , "00");
            reverseTurn();

        }

    }

    @FXML
    void btn4OnAction(ActionEvent event) throws MalformedURLException {

        if (gameSystem == 0 ) {
            playFriendly(board, turnPlayer1, "10");
            if (turnPlayer1) {
                btn4.setText("x");
                playSound("xSound");
            } else {
                btn4.setText("o");
                playSound("oSound");
            }
            btn4.setDisable(true);
            reverseTurn();
        }else if ( gameSystem == 1 ){

            playEasyComputer(board, turnPlayer1, "10");
            if (turnPlayer1) {
                btn4.setText("x");
                playSound("xSound");
            }
            btn4.setDisable(true);
            reverseTurn();
            computerPressButton();
            playEasyComputer(board , turnPlayer1 , "00");
            reverseTurn();

        }

    }

    @FXML
    void btn5OnAction(ActionEvent event) throws MalformedURLException {

        if (gameSystem == 0 ) {
            playFriendly(board, turnPlayer1, "11");
            if (turnPlayer1) {
                btn5.setText("x");
                playSound("xSound");
            } else {
                btn5.setText("o");
                playSound("oSound");
            }
            btn5.setDisable(true);
            reverseTurn();
        }else if ( gameSystem == 1 ){

            playEasyComputer(board, turnPlayer1, "11");
            if (turnPlayer1) {
                btn5.setText("x");
                playSound("xSound");
            }
            btn5.setDisable(true);
            reverseTurn();
            computerPressButton();
            playEasyComputer(board , turnPlayer1 , "00");
            reverseTurn();

        }

    }

    @FXML
    void btn6OnAction(ActionEvent event) throws MalformedURLException {

        if (gameSystem == 0 ) {
            playFriendly(board, turnPlayer1, "12");
            if (turnPlayer1) {
                btn6.setText("x");
                playSound("xSound");
            } else {
                btn6.setText("o");
                playSound("oSound");
            }
            btn6.setDisable(true);
            reverseTurn();
        }else if ( gameSystem == 1 ){

            playEasyComputer(board, turnPlayer1, "12");
            if (turnPlayer1) {
                btn6.setText("x");
                playSound("xSound");
            }
            btn6.setDisable(true);
            reverseTurn();
            computerPressButton();
            playEasyComputer(board , turnPlayer1 , "00");
            reverseTurn();

        }

    }

    @FXML
    void btn7OnAction(ActionEvent event) throws MalformedURLException {

        if (gameSystem == 0 ) {
            playFriendly(board, turnPlayer1, "20");
            if (turnPlayer1) {
                btn7.setText("x");
                playSound("xSound");
            } else {
                btn7.setText("o");
                playSound("oSound");
            }
            btn7.setDisable(true);
            reverseTurn();
        }else if ( gameSystem == 1 ){

            playEasyComputer(board, turnPlayer1, "20");
            if (turnPlayer1) {
                btn7.setText("x");
                playSound("xSound");
            }
            btn7.setDisable(true);
            reverseTurn();
            computerPressButton();
            playEasyComputer(board , turnPlayer1 , "00");
            reverseTurn();

        }

    }

    @FXML
    void btn8OnAction(ActionEvent event) throws MalformedURLException {

        if (gameSystem == 0 ) {
            playFriendly(board, turnPlayer1, "21");
            if (turnPlayer1) {
                btn8.setText("x");
                playSound("xSound");
            } else {
                btn8.setText("o");
                playSound("oSound");
            }
            btn8.setDisable(true);
            reverseTurn();
        }else if ( gameSystem == 1 ){

            playEasyComputer(board, turnPlayer1, "21");
            if (turnPlayer1) {
                btn8.setText("x");
                playSound("xSound");
            }
            btn8.setDisable(true);
            reverseTurn();
            computerPressButton();
            playEasyComputer(board , turnPlayer1 , "00");
            reverseTurn();

        }

    }

    @FXML
    void btn9OnAction(ActionEvent event) throws MalformedURLException {

        if (gameSystem == 0 ) {
            playFriendly(board, turnPlayer1, "22");
            if (turnPlayer1) {
                btn9.setText("x");
                playSound("xSound");
            } else {
                btn9.setText("o");
                playSound("oSound");
            }
            btn9.setDisable(true);
            reverseTurn();
        }else if ( gameSystem == 1 ){

            playEasyComputer(board, turnPlayer1, "22");
            if (turnPlayer1) {
                btn9.setText("x");
                playSound("xSound");
            }
            btn9.setDisable(true);
            reverseTurn();
            computerPressButton();
            playEasyComputer(board , turnPlayer1 , "00");
            reverseTurn();

        }

    }

    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {

        showStage("gameSystem");

    }

    @FXML
    void btnRestartOnAction(ActionEvent event) {

        buttonsTextFillEmpty();
        enableAllButton();
        TicTac ticTac = new TicTac();
        ticTac.fillTowDimitionalArray(board);
        textResultMid.setText("0");
        textResultLast.setText("0");
        textResultFirst.setText("0");


    }

    @FXML
    void btnPlayAgainOnAction(ActionEvent event) {

        buttonsTextFillEmpty();
        enableAllButton();
        TicTac ticTac = new TicTac();
        ticTac.fillTowDimitionalArray(board);

    }

    private void computerPressButton() throws MalformedURLException {

        int location = getComputerLocation() ;

        if (location == 1 ) {
            btn1.setText("o");
            btn1.setDisable(true);
            playSound("oSound");
        }else if (location == 2){
            btn2.setText("o");
            btn2.setDisable(true);
            playSound("oSound");
        }else if ( location == 3 ){
            btn3.setText("o");
            btn3.setDisable(true);
            playSound("oSound");
        }else if ( location == 4 ){
            btn4.setText("o");
            btn4.setDisable(true);
            playSound("oSound");
        }else if ( location == 5 ){
            btn5.setText("o");
            btn5.setDisable(true);
            playSound("oSound");
        }else if ( location == 6) {
            btn6.setText("o");
            btn6.setDisable(true);
            playSound("oSound");
        }else if ( location == 7 ){
            btn7.setText("o");
            btn7.setDisable(true);
            playSound("oSound");
        }else if ( location == 8) {
            btn8.setText("o");
            btn8.setDisable(true);
            playSound("oSound");
        }else if ( location == 9 ){
            btn9.setText("o");
            btn9.setDisable(true);
            playSound("oSound");
        }

    }

    private int getComputerLocation(){
        String location = "" ;
        boolean checkEmpty = false;

        for (int i = 0 ; i < board.length ; i++ ){
            for (int j =0 ; j < board[i].length ; j++){
                if (board[i][j] == '-' && checkEmpty == false ){
                    location = String.valueOf(i) ;
                    location += String.valueOf(j);
                    checkEmpty = true ;
                    break;
                }
            }
        }

        int compLoc = getButtonPressed(location);
        return compLoc;
    }

    private int getButtonPressed (String location){

        if (location.equalsIgnoreCase("00")){
            return 1 ;
        }else if (location.equalsIgnoreCase("01")){
            return 2 ;
        }else if (location.equalsIgnoreCase("02")){
            return 3 ;
        }else if (location.equalsIgnoreCase("10")){
            return 4 ;
        }else if ( location.equalsIgnoreCase("11")){
            return 5 ;
        }else if (location.equalsIgnoreCase("12")){
            return 6 ;
        }else if ( location.equalsIgnoreCase("20")){
            return 7 ;
        }else if ( location.equalsIgnoreCase("21")){
            return 8 ;
        }else {
            return 9 ;
        }

    }

    private void playHardComputer(char[][] board , boolean turnPlayer1 , String location ) throws MalformedURLException {



    }

    private void playFriendly(char[][] board , boolean turnPlayer1 , String location ) throws MalformedURLException {

        // 1   x wining , -1  o wining  , 0  tie ,  2 continue

        TicTac ticTac = new TicTac();
        int result = ticTac.friendlyGameplay(board,turnPlayer1,location);
        if (result == 1 ){

            playSound("winSound");
            System.out.println("x wining");
            int txtResult = Integer.parseInt(textResultFirst.getText().trim());
            txtResult += 1 ;
            textResultFirst.setText(String.valueOf(txtResult));
            disableAllButton();

        }else if ( result == -1 ){

            playSound("winSound");
            System.out.println("o wining");
            int txtResult = Integer.parseInt(textResultLast.getText().trim());
            txtResult += 1 ;
            textResultLast.setText(String.valueOf(txtResult));
            disableAllButton();


        }else if ( result == 0 ){

            System.out.println("tie");
            int txtResult = Integer.parseInt(textResultMid.getText().trim());
            txtResult += 1 ;
            textResultMid.setText(String.valueOf(txtResult));
            disableAllButton();

        }

        ticTac.printTable(board);

    }

    private void playEasyComputer(char[][] board , boolean turnPlayer1 , String location ) throws MalformedURLException {

        TicTac ticTac = new TicTac();
        int result = ticTac.easyComputerGameplay(board,turnPlayer1,location);
        if (result == 1 ){

            playSound("winSound");
            System.out.println("x wining");
            int txtResult = Integer.parseInt(textResultFirst.getText().trim());
            txtResult += 1 ;
            textResultFirst.setText(String.valueOf(txtResult));
            disableAllButton();

        }else if ( result == -1 ){

            playSound("winSound");
            System.out.println("o wining");
            int txtResult = Integer.parseInt(textResultLast.getText().trim());
            txtResult += 1 ;
            textResultLast.setText(String.valueOf(txtResult));
            disableAllButton();


        }else if ( result == 0 ){

            System.out.println("tie");
            int txtResult = Integer.parseInt(textResultMid.getText().trim());
            System.out.println(textResultMid.getText() + "                result tie");
            txtResult += 1 ;
            textResultMid.setText(String.valueOf(txtResult));
            disableAllButton();

        }

        ticTac.printTable(board);
    }

    private void showStage(String ClassXmlName) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/View/"+ClassXmlName.concat(".fxml")));
        Main.stage.setScene(new Scene(root));
        Main.stage.centerOnScreen();
        Main.stage.show();

    }

    private int checkGameSystem(){

        // 0 --> friendly
        // 1 --> computer easy
        // 2 --> computer hard

        boolean isFriendly = ControllerGameSystem.isFriendly , isHard = ControllerDifficultyLevel.isHard
                  , isEasy = ControllerDifficultyLevel.isEasy ;
        if (isFriendly){
            textCompOrPlayer.setText("PLAYER2 (O)");
            return 0;
        }else if (isEasy){
            textCompOrPlayer.setText("COMPUTER (O)");
            return 1;
        }else{
            textCompOrPlayer.setText("COMPUTER (O)");
            return 2;
        }


    }

    private void disableAllButton(){

        btn1.setDisable(true);
        btn2.setDisable(true);
        btn3.setDisable(true);
        btn4.setDisable(true);
        btn5.setDisable(true);
        btn6.setDisable(true);
        btn7.setDisable(true);
        btn8.setDisable(true);
        btn9.setDisable(true);

    }

    private void enableAllButton(){

        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);

    }

    private void playSound(String soundName) throws MalformedURLException {

        Media sound = new Media(getClass().getResource("/Sound/"+soundName+".mp3").toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

    }

}

