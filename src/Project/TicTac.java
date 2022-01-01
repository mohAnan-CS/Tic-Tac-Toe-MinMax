package Project;



public class TicTac {

    public static void main(String[] args) {

//        char[][] board = new char[3][3];
//        fillTowDimitionalArray(board);
//        //printTable(board);
//        easyComputerGameplay(board , true , "00");
//        easyComputerGameplay(board , false , "00");
//        easyComputerGameplay(board , true , "02");
//        easyComputerGameplay(board , false , "00");
//        //easyComputerGameplay(board , true , "00");
//        printTable(board);


    }

    //Player1 = x
    //Player2 = o

    public int friendlyGameplay(char[][] board, boolean turnPlayer1, String location) {

        int firstNum = Integer.parseInt(location.substring(0, 1));
        int secondNum = Integer.parseInt(location.substring(1));

        if (turnPlayer1) {
            board[firstNum][secondNum] = 'x';
        } else {
            board[firstNum][secondNum] = 'o';
        }
        int result1 = checkResult(board);

        if (result1 == 1)
            return 1;
        else if (result1 == -1)
            return -1;
        else if (result1 == 0)
            return 0;
        else
            return 2;

    }

    public int easyComputerGameplay(char[][] board, boolean turnPlayer1, String location) {

        if (turnPlayer1) {
            int firstNum = Integer.parseInt(location.substring(0, 1));
            int secondNum = Integer.parseInt(location.substring(1));
            board[firstNum][secondNum] = 'x';
        } else {

            boolean checkEmpty = false;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == '-' && checkEmpty == false) {
                        board[i][j] = 'o';
                        checkEmpty = true;
                        break;
                    }
                }
            }
        }
        int result1 = checkResult(board);

        if (result1 == 1)
            return 1;
        else if (result1 == -1)
            return -1;
        else if (result1 == 0)
            return 0;
        else
            return 2;


    }

    public String hardGamePlay(char[][] board) {

        char[][] testBoard = new char[3][3];
        fillTestBoard(board, testBoard);

        int score = 0, bestScore = -1;
        String location = "";

        for (int i = 0; i < testBoard.length; i++) {
            for (int j = 0; j < testBoard[i].length; j++) {
                if (String.valueOf(testBoard[i][j]).equalsIgnoreCase("-")) {
                    testBoard[i][j] = 'x';
                    score = minMax(testBoard, true);
                    testBoard[i][j] = '-';
                    if (score > bestScore) {
                        bestScore = score;
                        location += i;
                        location += j;
                    }
                }
            }
        }
        return location;

    }

    private int minMax(char[][] testBoard, boolean turnPlayer) {

        int result1 = checkResult(testBoard);

        if (result1 == 1)
            return 1;
        else if (result1 == -1)
            return -1;
        else if (result1 == 0)
            return 0;
        else {

            if (turnPlayer) {

                int bestScore = 1, score = 0;
                for (int i = 0; i < testBoard.length; i++) {
                    for (int j = 0; j < testBoard[i].length; j++) {
                        if (String.valueOf(testBoard[i][j]).equalsIgnoreCase("-")) {
                            testBoard[i][j] = 'o';
                            score = minMax(testBoard, false);
                            testBoard[i][j] = '-';
                            if (score > bestScore) {
                                bestScore = score;
                            }
                        }
                    }
                }

                return bestScore;

            } else {

                int bestScore = -1, score = 0;
                for (int i = 0; i < testBoard.length; i++) {
                    for (int j = 0; j < testBoard[i].length; j++) {
                        if (String.valueOf(testBoard[i][j]).equalsIgnoreCase("-")) {
                            testBoard[i][j] = 'x';
                            score = minMax(testBoard, true);
                            testBoard[i][j] = '-';
                            if (score > bestScore) {
                                bestScore = score;
                            }
                        }
                    }
                }

                return bestScore;

            }

        }


    }

    public void fillTestBoard(char[][] board, char[][] testBoard) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                testBoard[i][j] = board[i][j];
            }
        }

    }

    public int checkResult(char[][] board) {

        //2 -> stillContinue
        // 1 -> x wining
        // -1 -> o wining
        // 0 -> tie

        ////////////////////            Check if x is wining        ///////////////

        //horizontalTop
        if (String.valueOf(board[0][0]).equals("x") && String.valueOf(board[0][1]).equals("x")
                && String.valueOf(board[0][2]).equals("x")) {
            System.out.println("ht x");
            return 1;
        }
        //horizontalMiddle
        else if (String.valueOf(board[1][0]).equals("x") && String.valueOf(board[1][1]).equals("x")
                && String.valueOf(board[1][2]).equals("x")) {
            System.out.println("hm x");
            return 1;
        }
        //horizontalLast
        else if (String.valueOf(board[2][0]).equals("x") && String.valueOf(board[2][1]).equals("x")
                && String.valueOf(board[2][2]).equals("x")) {
            System.out.println("hl x");
            return 1;
        }

        //verticalLeft
        if (String.valueOf(board[0][0]).equals("x") && String.valueOf(board[1][0]).equals("x")
                && String.valueOf(board[2][0]).equals("x")) {
            System.out.println("vl x");
            return 1;
        }
        //verticalMiddle
        else if (String.valueOf(board[0][1]).equals("x") && String.valueOf(board[1][1]).equals("x")
                && String.valueOf(board[2][1]).equals("x")) {
            System.out.println("vm x");
            return 1;
        }
        //verticalRight
        else if (String.valueOf(board[0][2]).equals("x") && String.valueOf(board[1][2]).equals("x")
                && String.valueOf(board[2][2]).equals("x")) {
            System.out.println("vr x");
            return 1;
        }
        //sloping 1
        else if (String.valueOf(board[0][0]).equals("x") && String.valueOf(board[1][1]).equals("x")
                && String.valueOf(board[2][2]).equals("x")) {
            System.out.println("s x");
            return 1;
        }
        //sloping 2
        else if (String.valueOf(board[0][2]).equals("x") && String.valueOf(board[1][1]).equals("x")
                && String.valueOf(board[2][0]).equals("x")) {
            return 1;
        }

        ////////////////////            Check o wining             //////////////////

        //horizontalTop
        if (String.valueOf(board[0][0]).equals("o") && String.valueOf(board[0][1]).equals("o")
                && String.valueOf(board[0][2]).equals("o")) {
            return -1;
        }
        //horizontalMiddle
        else if (String.valueOf(board[1][0]).equals("o") && String.valueOf(board[1][1]).equals("o")
                && String.valueOf(board[1][2]).equals("o")) {
            return -1;
        }
        //horizontalLast
        else if (String.valueOf(board[2][0]).equals("o") && String.valueOf(board[2][1]).equals("o")
                && String.valueOf(board[2][2]).equals("o")) {
            return -1;
        }

        //verticalLeft
        if (String.valueOf(board[0][0]).equals("o") && String.valueOf(board[1][0]).equals("o")
                && String.valueOf(board[2][0]).equals("o")) {
            return -1;
        }
        //verticalMiddle
        else if (String.valueOf(board[0][1]).equals("o") && String.valueOf(board[1][1]).equals("o")
                && String.valueOf(board[2][1]).equals("o")) {
            return -1;
        }
        //verticalRight
        else if (String.valueOf(board[0][2]).equals("o") && String.valueOf(board[1][2]).equals("o")
                && String.valueOf(board[2][2]).equals("o")) {
            return -1;
        }
        //sloping 1
        else if (String.valueOf(board[0][0]).equals("o") && String.valueOf(board[1][1]).equals("o")
                && String.valueOf(board[2][2]).equals("o")) {
            return -1;
        }
        //sloping 2
        else if (String.valueOf(board[0][2]).equals("o") && String.valueOf(board[1][1]).equals("o")
                && String.valueOf(board[2][0]).equals("o")) {
            return 1;
        } else {

            //stillContinue
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (String.valueOf(board[i][j]).equalsIgnoreCase("-")) {
                        return 2;
                    }
                }
            }
            //tie
            return 0;
        }


    }

    public void fillTowDimitionalArray(char[][] table) {

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = '-';
            }
        }

    }

    public void printTable(char[][] table) {

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }

}
