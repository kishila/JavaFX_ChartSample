package application;

import chartComponent.ResetButton;
import chartComponent.SampleChart;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");

        BorderPane pane = new BorderPane();
        pane.setCenter(SampleChart.lineChart);
        pane.setBottom(ResetButton.button);

        Scene scene  = new Scene(pane,1200,600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
