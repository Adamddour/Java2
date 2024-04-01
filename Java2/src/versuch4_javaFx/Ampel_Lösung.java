package versuch4_javaFx;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.shape.*;


public class Ampel_Lösung extends Application{
    private Circle c1;
    private Circle c2;
    private Circle c3;
    int phase = 0;

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage st) throws Exception{
        BorderPane borderp = new BorderPane();
        StackPane stackp = new StackPane();
        HBox hbox = new HBox();
        Button nextb = new Button("Weiter>");
        Button exitb = new Button("Exit");
        c1 = new Circle(175,75,25);
        c2 = new Circle(175,135,25);
        c3 = new Circle(175,195,25);
        Rectangle lightbox = new Rectangle(135,40,80,190);
        Rectangle stand = new Rectangle(170,230,10,190);
        Group ampel = new Group(lightbox,stand, c1, c2, c3);

        lightbox.setFill(Color.GRAY);
        c1.setFill(Color.RED);
        c2.setFill(Color.LIGHTGRAY);
        c3.setFill(Color.LIGHTGRAY);

        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setPadding(new Insets(15));
        hbox.setSpacing(10);
        hbox.getChildren().addAll(nextb,exitb);

        stackp.getChildren().add(ampel);

        borderp.setCenter(stackp);
        borderp.setBottom(hbox);
        Scene szene = new Scene(borderp,350,550);

        nextb.setOnAction(e->{
            nextPhase(phase);
            if(phase<3) {phase++;}else {phase=0;}
        });
        exitb.setOnAction(e->{
            st.close();
        });

        st.setTitle("Ampel");
        st.setScene(szene);
        st.show();
    }
    public void nextPhase(int aktPhase) {
        c1.setFill(Color.LIGHTGRAY);
        c2.setFill(Color.LIGHTGRAY);
        c3.setFill(Color.LIGHTGRAY);
        switch (aktPhase){
            case 0:
                c1.setFill(Color.RED);
                c2.setFill(Color.YELLOW);
                break;
            case 1:
                c3.setFill(Color.GREEN);
                break;
            case 2:
                c2.setFill(Color.YELLOW);
                break;
            case 3:
                c1.setFill(Color.RED);
        }

    }


}