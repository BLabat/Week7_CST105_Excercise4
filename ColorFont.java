/** Program: ProgrammingExercise 8 exercise 4
 * File: ColorFont.Java
 * Summary: Displays java in different colors
 * Author: Brandon Labat
 * Date: April 8, 2018
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ColorFont extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}
	@Override
	public void start(Stage arg) throws Exception{
		
		Pane HBox = new HBox(5);
		HBox.setPadding(new Insets(15));
		Label textLabel =  new Label("Java");
		
		for(int i = 0; i < 5; i++) {
		textLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		textLabel.setTextFill(new Color (Math.random(),Math.random(),Math.random(),Math.random()));
		textLabel.setRotate(90);
		HBox.getChildren().add(textLabel);
		textLabel = new Label("Java");
		}
		Scene scene = new Scene(HBox, 250, 100);
		arg.setTitle("Color and Font");
		arg.setScene(scene);
		arg.show();
		
	}
}
