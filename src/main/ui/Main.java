package ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import superawesomepackage.DataHandler;
import superawesomepackage.StringAnalyzer;
import superawesomepackage.StringGenerator;
import superawesomepackage.StringOperator;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

    private Stage stage;
    private Scene scene;
    private TextArea input = new TextArea();
    private TextArea output = new TextArea();
    private Label titleLabel = new Label("Text Analyzer");
    private Label inputLabel = new Label("Input");
    private Label outputLabel = new Label("Output");
    private Label analyzeLabel = new Label("Count");
    private Label mutatorLabel = new Label("Modify");
    private Label generateLabel = new Label("Generate");
    private BorderPane borderPane = new BorderPane();
    private GridPane titlePane = new GridPane();
    private GridPane mainButtonPane = new GridPane();
    private VBox textBoxPane = new VBox();
    private GridPane dataPane = new GridPane();
    private Button save = new Button("Save");
    private Button load = new Button("Load");
    private Button clear = new Button("Clear");
    private Button delete = new Button("Delete");
    private ArrayList<Button> mainButtons = new ArrayList<>(15);


    public static void main(String[] args) throws IOException {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        setUpTextPaneAndTitle();

        initializeButtonsList();
        setUpButtonTextAndSize();
        setUpButtonStyle();
        setUpButtonAction();

        setUpMainButtonPane();

        setUpDataPane1();
        setUpDataPane2();
        setUpDataPane3();
        setUpDataPane4();
        setUpDataPane5();

        setUpStage(primaryStage);

        stage.show();
    }

    private void setUpDataPane1() {
        save.setOnAction(e -> {
            try {
                if (input.getText().matches("[a-zA-Z0-9!@#$%^&]*")) {
                    DataHandler.save(output.getText(), input.getText());
                } else {
                    output.appendText("Invalid File name, ");
                    output.appendText("please use only alphanumerics, or ! @ # $ % ^ &\n\n");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

    private void setUpDataPane2() {
        load.setOnAction(e -> {
            try {
                output.appendText(DataHandler.load(input.getText()));
            } catch (IOException e1) {
                output.appendText("Error: File location could not be found\n\n");
            }
        });
        clear.setOnAction(e -> {
            try {
                DataHandler.clear(input.getText());
            } catch (IOException e1) {
                output.appendText("Error: File location could not be found\n\n");
            }
        });
    }

    private void setUpDataPane3() {
        delete.setOnAction(e -> {
            try {
                DataHandler.delete(input.getText());
            } catch (IOException e1) {
                output.appendText("Error: File location could not be found\n\n");
            }
        });
        save.setStyle("-fx-background-color: #1adb44; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;");
        load.setStyle("-fx-background-color: #1adb44; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;");
        clear.setStyle("-fx-background-color: #bfd420; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;");
        delete.setStyle("-fx-background-color: #d41111; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;");
    }

    private void setUpDataPane4() {
        save.setCursor(Cursor.HAND);
        save.setOnMouseEntered(e -> save.setStyle("-fx-background-color: #229c3d; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;"));
        save.setOnMouseExited(e -> save.setStyle("-fx-background-color: #1adb44; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;"));
        load.setCursor(Cursor.HAND);
        load.setOnMouseEntered(e -> load.setStyle("-fx-background-color: #229c3d; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;"));
        load.setOnMouseExited(e -> load.setStyle("-fx-background-color: #1adb44; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;"));
        clear.setCursor(Cursor.HAND);
        clear.setOnMouseEntered(e -> clear.setStyle("-fx-background-color: #97a62b; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;"));
        clear.setOnMouseExited(e -> clear.setStyle("-fx-background-color: #bfd420; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;"));
    }

    private void setUpDataPane5() {
        delete.setCursor(Cursor.HAND);
        delete.setOnMouseEntered(e -> delete.setStyle("-fx-background-color: #912929; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;"));
        delete.setOnMouseExited(e -> delete.setStyle("-fx-background-color: #d41111; -fx-font-family: Verdana;"
                + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;"));
        dataPane.add(save,1,0);
        dataPane.add(load,2,0);
        dataPane.add(clear,3,0);
        dataPane.add(delete,4,0);
        dataPane.setAlignment(Pos.CENTER);
        dataPane.setHgap(30);
        save.setPrefSize(110,40);
        load.setPrefSize(110,40);
        clear.setPrefSize(110,40);
        delete.setPrefSize(110,40);
    }

    private void setUpStage(Stage primaryStage) {
        borderPane.setCenter(textBoxPane);
        borderPane.setRight(mainButtonPane);
        borderPane.setTop(titlePane);
        borderPane.setBottom(dataPane);
        borderPane.setPadding(new Insets(10,10,10,10));
        borderPane.setStyle("-fx-background-color: #191c1c; ");

        scene = new Scene(borderPane, 1080,580);

        stage = primaryStage;
        stage.setScene(scene);
        stage.setTitle("Text Analyzer");
    }

    private void setUpTextPaneAndTitle() {
        titleLabel = new Label("Text Analyzer");
        titleLabel.setStyle("-fx-font-family: Verdana; -fx-font-weight: bold; "
                + "-fx-text-fill: #1323b0; -fx-font-size: 50;");
        titlePane.add(titleLabel,0,0);
        titlePane.setAlignment(Pos.CENTER);

        inputLabel.setStyle("-fx-font-family: Verdana; -fx-font-weight: bold; -fx-text-fill: #ffffff;");
        outputLabel.setStyle("-fx-font-family: Verdana; -fx-font-weight: bold; -fx-text-fill: #ffffff;");

        input.setPrefHeight(150);
        input.setStyle("-fx-control-inner-background:#1a1818; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; "
                + "-fx-highlight-text-fill: #000000; -fx-text-fill: #ffffff; ");

        output.setPrefHeight(300);
        output.setStyle("-fx-control-inner-background:#1a1818; -fx-font-family: Consolas; "
                + "-fx-highlight-fill: #00ff00; -fx-highlight-text-fill: #000000; -fx-text-fill: #00ff00; ");
        output.setEditable(false);

        textBoxPane = new VBox();
        textBoxPane.getChildren().addAll(inputLabel, input, outputLabel, output);
        textBoxPane.setPadding(new Insets(10,10,10,10));
        textBoxPane.setSpacing(10);
    }

    private void setUpMainButtonPane() {
        analyzeLabel.setStyle("-fx-font-family: Verdana; -fx-font-weight: bold; -fx-text-fill: #ffffff;");
        mutatorLabel.setStyle("-fx-font-family: Verdana; -fx-font-weight: bold; -fx-text-fill: #ffffff;");
        generateLabel.setStyle("-fx-font-family: Verdana; -fx-font-weight: bold; -fx-text-fill: #ffffff;");
        mainButtonPane.add(analyzeLabel,1,0);
        mainButtonPane.add(mutatorLabel,2,0);
        mainButtonPane.add(generateLabel,3,0);
        int index = 0;
        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= 5; k++) {
                mainButtonPane.add(mainButtons.get(index), i, k);
                index++;
            }
        }
        mainButtonPane.setVgap(10);
        mainButtonPane.setHgap(10);
        mainButtonPane.setAlignment(Pos.CENTER);
    }

    private void initializeButtonsList() {
        Button button;
        for (int i = 0; i < 15; i++) {
            button = new Button();
            mainButtons.add(button);
        }
    }

    private void setUpButtonTextAndSize() {
        mainButtons.get(0).setText("Characters");
        mainButtons.get(1).setText("Letters");
        mainButtons.get(2).setText("Numbers");
        mainButtons.get(3).setText("Spaces");
        mainButtons.get(4).setText("Punctuation");
        mainButtons.get(5).setText("Reverse");
        mainButtons.get(6).setText("Shuffle");
        mainButtons.get(7).setText("Capitalize");
        mainButtons.get(8).setText("Uncapitalize");
        mainButtons.get(9).setText("Alternate");
        mainButtons.get(10).setText("String");
        mainButtons.get(11).setText("Letters");
        mainButtons.get(12).setText("Lowercase");
        mainButtons.get(13).setText("Uppercase");
        mainButtons.get(14).setText("Numbers");
        for (Button b: mainButtons) {
            b.setPrefSize(110,40);
        }
    }

    private void setUpButtonAction() {
        mainButtons.get(0).setOnAction(e -> output.appendText(StringAnalyzer.characterCount(input.getText()) + "\n\n"));
        mainButtons.get(1).setOnAction(e -> output.appendText(StringAnalyzer.letterCount(input.getText()) + "\n\n"));
        mainButtons.get(2).setOnAction(e -> output.appendText(StringAnalyzer.numberCount(input.getText()) + "\n\n"));
        mainButtons.get(3).setOnAction(e -> output.appendText(StringAnalyzer.spaceCount(input.getText()) + "\n\n"));
        mainButtons.get(4).setOnAction(e -> output.appendText(
                StringAnalyzer.punctuationCount(input.getText()) + "\n\n"));
        mainButtons.get(5).setOnAction(e -> output.appendText(StringOperator.reverse(input.getText()) + "\n\n"));
        mainButtons.get(6).setOnAction(e -> output.appendText(StringOperator.shuffle(input.getText()) + "\n\n"));
        mainButtons.get(7).setOnAction(e -> output.appendText(StringOperator.captilize(input.getText()) + "\n\n"));
        mainButtons.get(8).setOnAction(e -> output.appendText(StringOperator.uncaptilize(input.getText()) + "\n\n"));
        mainButtons.get(9).setOnAction(e -> output.appendText(StringOperator.alternate(input.getText()) + "\n\n"));
        mainButtons.get(10).setOnAction(e -> output.appendText(StringGenerator.randomString() + "\n\n"));
        mainButtons.get(11).setOnAction(e -> output.appendText(StringGenerator.randomLetters() + "\n\n"));
        mainButtons.get(12).setOnAction(e -> output.appendText(StringGenerator.randomLowercase() + "\n\n"));
        mainButtons.get(13).setOnAction(e -> output.appendText(StringGenerator.randomUppercase() + "\n\n"));
        mainButtons.get(14).setOnAction(e -> output.appendText(StringGenerator.randomNumbers() + "\n\n"));
    }

    private void setUpButtonStyle() {
        for (Button b: mainButtons) {
            b.setStyle("-fx-background-color: #db0f0f; -fx-font-family: Verdana;"
                    + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;");
            b.setCursor(Cursor.HAND);
            b.setOnMouseEntered(e -> b.setStyle("-fx-background-color: #963838; -fx-font-family: Verdana;"
                    + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;"));
            b.setOnMouseExited(e -> b.setStyle("-fx-background-color: #db0f0f; -fx-font-family: Verdana;"
                    + " -fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #000000;"));
        }
    }

}
