package fresh.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btnSignIn;

    @FXML
    private Button btnSignUp;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnBooks;

    @FXML
    private Button btnCode;

    @FXML
    private Button btnAbout;

    @FXML
    private Button btnLogout;

    @FXML
    private GridPane pnUser;

    @FXML
    private GridPane pnAbout;

    @FXML
    private GridPane pnBlank;

    @FXML
    private Pane pnlStatus;

    @FXML
    private Label lblStatus;

    @FXML
    private Label lblStatusMini;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void handleClicks(ActionEvent event) throws IOException {

        if (event.getSource() == btnSignIn || event.getSource() == btnSignUp) {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();

            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../fxml/Home.fxml")));
            stage.setScene(scene);
            stage.show();
        }

        if (event.getSource() == btnDashboard) {
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(41, 128, 185), CornerRadii.EMPTY, Insets.EMPTY)));
            lblStatus.setText("Dashboard");
            lblStatusMini.setText("/home/dashboard");
            pnUser.toFront();
        } else if (event.getSource() == btnBooks) {
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(26, 188, 156), CornerRadii.EMPTY, Insets.EMPTY)));
            lblStatus.setText("Books");
            lblStatusMini.setText("/home/books");
            pnBlank.toFront();
        } else if (event.getSource() == btnCode) {
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(230, 126, 34), CornerRadii.EMPTY, Insets.EMPTY)));
            lblStatus.setText("Code");
            lblStatusMini.setText("/home/code");
            pnBlank.toFront();
        } else if (event.getSource() == btnAbout) {
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(231, 76, 60), CornerRadii.EMPTY, Insets.EMPTY)));
            lblStatus.setText("About");
            lblStatusMini.setText("/home/about");
            pnAbout.toFront();
        } else if (event.getSource() == btnLogout) {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();

            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../fxml/Login.fxml")));
            stage.setScene(scene);
            stage.show();
        }

    }
}
