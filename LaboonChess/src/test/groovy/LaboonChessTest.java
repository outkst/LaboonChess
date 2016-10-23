import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

import java.io.IOException;

import entities.ChessBoard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.loadui.testfx.Assertions.assertNodeExists;
import static org.loadui.testfx.Assertions.verifyThat;

/**
 * Created by david on 9/28/16.
 */


public class LaboonChessTest extends GuiTest{
    private ChessBoard chessBoard;
    public Parent getRootNode()
    {
        Parent parent = null;
        try {
//            /Users/davidbickford/Documents/github/CS1530/LaboonChess/src/main/resources/fxml/LaboonChessDocument.fxml
            parent = FXMLLoader.load(getClass().getResource("/fxml/LaboonChessDocument.fxml"));
            return parent;
        } catch (IOException ex) {
            // TODO ...
            System.out.println(ex);
            System.exit(1);
        }
        return parent;
    }

    @Before
    public void beforeTests(){
        chessBoard = new ChessBoard();
    }

//    @Test
//    public void testLoadGame()
//    {
//        final Node b =  this.find("#btnLoadGame");
//        this.clickOn(b);
//        assertTrue(this.find("Load Game clicked").isVisible());
//    }

//    @Test
//    public void testHandleSaveGameAction(){
//        final Node b = this.find("#btnSaveGame");
//        this.clickOn(b);
//        assertTrue(this.find("Save Game clicked").isVisible());
//    }

    @Test
    public void testChessboardToFEN(){
        String FEN = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w";

        assertEquals(chessBoard.toFEN(), FEN);
    }

    @Test
    //
    public void testSanTo2DRow () {
        assertEquals(chessBoard.sanTo2DRow("a1"), 7);

    }

    @Test
    public void testSanTo2DRow2(){
        assertEquals(chessBoard.sanTo2DRow("g6"), 2);
    }

    @Test
    public void testSanTo2DRow3(){
        assertEquals(chessBoard.sanTo2DRow("h8"), 0);
    }

    @Test
    public void testSanTo2DRowOutOfBounds(){
        assertEquals(chessBoard.sanTo2DRow("a9"), -1);
    }

    @Test
    public void testSanTo2DRowOutOfBounds2(){
        assertEquals(chessBoard.sanTo2DRow("a0"), -1);
    }

    @Test
    public void testSanTo2DRowOutOfBounds3(){
        assertEquals(chessBoard.sanTo2DRow("h9"), -1);
    }

    @Test
    public void testSanTo2DRowOutOfBounds4(){
        assertEquals(chessBoard.sanTo2DRow("h0"), -1);
    }

    @Test
    public void testSanTo2DCol(){
        assertEquals(chessBoard.sanTo2DCol("a1"), 0);
    }

    @Test
    public void testSanTo2DCol2(){
        assertEquals(chessBoard.sanTo2DCol("b3"), 1);
    }

    @Test
    public void testSanTo2DCol3(){
        assertEquals(chessBoard.sanTo2DCol("e4"), 4);
    }

    @Test
    public void testSanTo2DCol4(){
        assertEquals(chessBoard.sanTo2DCol("h4"), 7);
    }

    @Test
    public void testSanTo2DColOutOfBounds(){
        assertEquals(chessBoard.sanTo2DCol("I1"), -1);
    }

    @Test
    public void testSanTo2DColOutOfBounds2(){
        assertEquals(chessBoard.sanTo2DCol("`1"), -1);
    }

    @Test
    public void testSanTo2DColOutOfBounds3(){
        assertEquals(chessBoard.sanTo2DCol("I8"), -1);
    }

    @Test
    public void testSanTo2DColOutOfBounds4(){
        assertEquals(chessBoard.sanTo2DCol("`8"), -1);
    }


//    @Test
//    public void testGetTranslate(){
//        assertEquals(AlgebraicNotationConversion.getTranslate(0,1), "a7");
//    }
//    @Test
//    public void testReverseTranslate(){
//        Square sq = AlgebraicNotationConversion.reverseTranslate("a7");
//        assertEquals(sq.column, 0);
//        assertEquals(sq.row, 1);
//    }
//    @Test
//    public void testReverseTranslate2(){
//        Square sq = AlgebraicNotationConversion.reverseTranslate("H8");
//        assertEquals(sq.column, 7);
//        assertEquals(sq.row, 0);
//    }
//    @Test
//    public void testHandleUndoMoveAction(){
//        Node a = this.find("#btnSaveGame");
//        this.clickOn(a);
//        final Node b = this.find("#mnuUndoMove");
//        this.clickOn(b);
//        assertTrue(this.find("Undo Move menu item clicked").isVisible());
//    }

//    private void handleUndoMoveAction(ActionEvent event) {
//        lblStatus.setText("Undo Move menu item clicked");
//    }
//    private void handleSaveGameAction(ActionEvent event) {
//        lblStatus.setText("Save Game clicked");
//    }
}