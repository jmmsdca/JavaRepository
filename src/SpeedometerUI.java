package jmmsdca.github.spdmtr;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SpeedometerUI extends Application{
	
	Stage window;
	Scene scene1, scene2;
	Speedometer spdmtr = new Speedometer();
	Label speedLabel = new Label();
	Button button;
	
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		primaryStage.setTitle("Speedometer!");
		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		});
		
		button = new Button("Accelerate");
		button.setOnAction(e -> {			
			speedLabel.setText(Double.toString(spdmtr.getSpeed()));
			spdmtr.accelerate();			
		});
		VBox layout = new VBox();
		layout.getChildren().addAll(speedLabel, button);
		Scene scene = new Scene(layout, 300,300);
		
		window.setScene(scene);
		window.show();
		
		
	}
	
	private void closeProgram() {
		boolean answer = ConfirmBox.display("Confirm", "Are you sure?");
		if(answer)
			window.close();
		
	}

}

