package morimoto.ethan;

import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUIDriver extends Application {
	int totalSum = 0;
	
	@Override
	public void start(Stage stage) throws Exception {
		Die d1 = new Die();
		Die d2 = new Die();
		boolean gameOver = false;
		
		VBox vbox = new VBox(10);
		
		// Create and display the title
		Label title = new Label("Shut The Box");
		vbox.getChildren().add(title);
		
		HBox tileBox = new HBox(10);
		
		Button[] tileBtns = new Button[9];
		Tile[] tiles = new Tile[9];
		
		for (int i=0; i<tileBtns.length; i++) {
			tileBtns[i] = new Button(String.valueOf(i+1));
			tiles[i] = new Tile(i+1);
			tileBox.getChildren().add(tileBtns[i]);
		}
		tileBox.setAlignment(Pos.CENTER);
		vbox.getChildren().add(tileBox);
		
		Button btnRollDouble = new Button("ROLL 2 DICE");
		Button btnRoll = new Button("ROLL DICE");
		Button tileChecker = new Button("END TURN");
		Label result = new Label("Result");
		Label lblValue = new Label(); // output of results
		vbox.getChildren().addAll(btnRollDouble,result,lblValue);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox,500,200);
		stage.setScene(scene);
		
		stage.show();
		
		
		btnRollDouble.setOnAction(e -> {
			lblValue.setText(String.valueOf(d1.roll() + d2.roll()));
		});
		
		for (int i = 0; i<tiles.length; i++) {
			
				totalSum += Integer.valueOf(tileBtns[i].getText());
			
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
