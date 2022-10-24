package task5;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.concurrent.atomic.AtomicInteger;


public class FootballGUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setWidth(600);
        primaryStage.setHeight(500);

        var ref1 = new Object() {
            final Label label1 = new Label("Result: 0 X 0");
        };
        ref1.label1.relocate(210,50);
        ref1.label1.setScaleX(2);
        ref1.label1.setScaleY(2);
        var ref2 = new Object() {
            final Label label2 = new Label("Last Scorer: AC Milan/Manchester United");
        };
        ref2.label2.relocate(190,100);
        ref2.label2.setScaleX(2);
        ref2.label2.setScaleY(2);
        var ref3 = new Object() {
            final Label label3 = new Label("Winner: ");
        };
        ref3.label3.relocate(190,150);
        ref3.label3.setScaleX(2);
        ref3.label3.setScaleY(2);

        Button button1 = new Button("AC Milan");
        button1.relocate(140,200);
        button1.setPrefSize(80,20);

        AtomicInteger click1 = new AtomicInteger(0);
        AtomicInteger click2 = new AtomicInteger(0);

        button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                click1.getAndIncrement();
                ref1.label1.setText("Result: " + click1 + " X " + click2);
                ref2.label2.setText("Last Scorer: AC Milan.");
                if (click1.get() > click2.get())
                    ref3.label3.setText("Winner: AC Milan");
                else{
                    if (click1.get() != click2.get())
                        ref3.label3.setText("Winner: Manchester United");
                    else ref3.label3.setText("Winner: AC Milan / Manchester United");
                }

            }
        });

        Button button2 = new Button("Manchester United");
        button2.setPrefSize(80,20);
        button2.relocate(270,200);

        button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                click2.getAndIncrement();
                ref1.label1.setText("Result: " + click1 + " X " + click2);
                ref2.label2.setText("Last Scorer: Manchester United");
                if (click1.get() > click2.get())
                    ref3.label3.setText("Winner: AC Milan");
                else {
                    if (click1.get() != click2.get())
                        ref3.label3.setText("Winner: Manchester United");
                    else ref3.label3.setText("Winner: AC Milan / Manchester United");
                }

            }
        });

        Group root = new Group();
        root.getChildren().addAll(ref1.label1, ref2.label2, ref3.label3, button1, button2);
        Scene scene = new Scene(root, 600, 500, Color.PALETURQUOISE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
