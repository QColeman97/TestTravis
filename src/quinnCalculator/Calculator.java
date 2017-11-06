package quinnCalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.*;
//import javafx.scene.control.Button;

import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;

//import java.awt.Insets;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculator extends Application{
	
	// Static Instance Variables
	static Operation op;
	static OperationFactory opFactory;
	static int operandOne;
	static int operandTwo;
	static boolean userIsTyping;
	
	// UI Variables
	Text display;
	Text errorDisplay;
	Button zeroButton;
	Button oneButton;
	Button twoButton;
	Button threeButton;
	Button fourButton;
	Button fiveButton;
	Button sixButton;
	Button sevenButton;
	Button eightButton;
	Button nineButton;
	Button addButton;
	Button minusButton;
	Button multButton;
	Button divButton;
	Button equalButton;
	Button clearButton;
	
	@Override
 	public void start(Stage primaryStage) throws Exception {
 		// UI Setup
		primaryStage.setTitle("Calculator");
 		
 		display = new Text("0");
 		errorDisplay = new Text("");
 		errorDisplay.setFill(Color.FIREBRICK);
 		
 		zeroButton = new Button("0");
 		oneButton = new Button("1");
 		twoButton = new Button("2");
 		threeButton = new Button("3");
 		fourButton = new Button("4");
 		fiveButton = new Button("5");
 		sixButton = new Button("6");
 		sevenButton = new Button("7");
 		eightButton = new Button("8");
 		nineButton = new Button("9");
 		addButton = new Button("+");
 		minusButton = new Button("-");
 		multButton = new Button("x");
 		divButton = new Button("/");
 		equalButton = new Button("=");
 		clearButton = new Button("C");
 		
 		// Format calculator buttons and screen in grid
 		GridPane grid = new GridPane();
 		grid.setAlignment(Pos.CENTER);
 		grid.setHgap(10);
 		grid.setVgap(10);
 		
 		display.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
 		HBox hbTitle = new HBox();
 		hbTitle.setAlignment(Pos.BOTTOM_RIGHT);
 		hbTitle.getChildren().add(display);
 		
 		errorDisplay.setFont(Font.font("Tahoma", FontWeight.NORMAL, 10));
 		HBox hbError = new HBox();
 		hbError.setAlignment(Pos.CENTER);
 		hbError.getChildren().add(errorDisplay);
 		
 		grid.add(hbTitle, 0, 0, 4, 1);
 		grid.add(hbError, 0, 5, 4, 1);
 		
 		grid.add(clearButton, 0, 4);
 		grid.add(zeroButton, 1, 4);
 		grid.add(oneButton, 0, 3);
 		grid.add(twoButton, 1, 3);
 		grid.add(threeButton, 2, 3);
 		grid.add(fourButton, 0, 2);
 		grid.add(fiveButton, 1, 2);
 		grid.add(sixButton, 2, 2);
 		grid.add(sevenButton, 0, 1);
 		grid.add(eightButton, 1, 1);
 		grid.add(nineButton, 2, 1);
 		
 		grid.add(addButton, 3, 4);
 		grid.add(minusButton, 3, 3);
 		grid.add(multButton, 3, 2);
 		grid.add(divButton, 3, 1);
 		grid.add(equalButton, 2, 4);
 		
 	 	Scene scene = new Scene(grid, 300, 275);
 	 	primaryStage.setScene(scene);
 		primaryStage.show();
 		
 		// Handle button events
 		// Number Buttons
 		zeroButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 	 				// Convert from int to String
 					String num = Integer.toString(0); 
 	 				String currentText = display.getText();
 	 				display.setText(currentText + num);
 	 			} else {
 	 				String num = Integer.toString(0); 
 	 				display.setText(num);
 	 			}
 	 			userIsTyping = true;
 	 		}
 		});
 		
 		oneButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 	 				String num = Integer.toString(1); 
 	 				String currentText = display.getText();
 	 				display.setText(currentText + num);
 	 			} else {
 	 				String num = Integer.toString(1); 
 	 				display.setText(num);
 	 			}
 	 			userIsTyping = true;
 	 		}
 		});

 		twoButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 	 				String num = Integer.toString(2); 
 	 				String currentText = display.getText();
 	 				display.setText(currentText + num);
 	 			} else {
 	 				String num = Integer.toString(2); 
 	 				display.setText(num);
 	 			}
 	 			userIsTyping = true;
 	 		}
 		});

 		threeButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 	 				String num = Integer.toString(3); 
 	 				String currentText = display.getText();
 	 				display.setText(currentText + num);
 	 			} else {
 	 				String num = Integer.toString(3); 
 	 				display.setText(num);
 	 			}
 	 			userIsTyping = true;
 	 		}
 		});

 		fourButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 	 				String num = Integer.toString(4); 
 	 				String currentText = display.getText();
 	 				display.setText(currentText + num);
 	 			} else {
 	 				String num = Integer.toString(4); 
 	 				display.setText(num);
 	 			}
 	 			userIsTyping = true;
 	 		}
 		});

 		fiveButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 	 				String num = Integer.toString(5); 
 	 				String currentText = display.getText();
 	 				display.setText(currentText + num);
 	 			} else {
 	 				String num = Integer.toString(5); 
 	 				display.setText(num);
 	 			}
 	 			userIsTyping = true;
 	 		}
 		});

 		sixButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 	 				String num = Integer.toString(6); 
 	 				String currentText = display.getText();
 	 				display.setText(currentText + num);
 	 			} else {
 	 				String num = Integer.toString(6); 
 	 				display.setText(num);
 	 			}
 	 			userIsTyping = true;
 	 		}
 		});

 		sevenButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 	 				String num = Integer.toString(7); 
 	 				String currentText = display.getText();
 	 				display.setText(currentText + num);
 	 			} else {
 	 				String num = Integer.toString(7); 
 	 				display.setText(num);
 	 			}
 	 			userIsTyping = true;
 	 		}
 		});

 		eightButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 	 				String num = Integer.toString(8); 
 	 				String currentText = display.getText();
 	 				display.setText(currentText + num);
 	 			} else {
 	 				String num = Integer.toString(8); 
 	 				display.setText(num);
 	 			}
 	 			userIsTyping = true;
 	 		}
 		});

 		nineButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 	 				String num = Integer.toString(9); 
 	 				String currentText = display.getText();
 	 				display.setText(currentText + num);
 	 			} else {
 	 				String num = Integer.toString(9); 
 	 				display.setText(num);
 	 			}
 	 			userIsTyping = true;
 	 		}
 		});

 		// Operation Buttons
 		addButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 					if (operandOne < 0) {
 						op = opFactory.getOp("ADD");
 						// Init operandOne - convert from String to int
 						operandOne = Integer.parseInt(display.getText());
 					} else {
 						errorDisplay.setText("Sorry, I only support 2 operands");
 					}
 					userIsTyping = false;
 				}
 			}
		});
 		
 		minusButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 					if (operandOne < 0) {
 						op = opFactory.getOp("SUB");
 						// Init operandOne - convert from String to int
 						operandOne = Integer.parseInt(display.getText());
 					} else {
 						errorDisplay.setText("Sorry, I only support 2 operands");
 					}
 					userIsTyping = false;
 				}
 			}
		});
 		
 		multButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 					if (operandOne < 0) {
 						op = opFactory.getOp("MULT");
 						// Init operandOne - convert from String to int
 						operandOne = Integer.parseInt(display.getText());
 					} else {
 						errorDisplay.setText("Sorry, I only support 2 operands");
 					}
 					userIsTyping = false;
 				}
 			}
		});
 		
 		divButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				if (userIsTyping) {
 					if (operandOne < 0) {
 						op = opFactory.getOp("DIV");
 						// Init operandOne - convert from String to int
 						operandOne = Integer.parseInt(display.getText());
 					} else {
 						errorDisplay.setText("Sorry, I only support 2 operands");
 					}
 					userIsTyping = false;
 				}
 			}
		});
 		
 		equalButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				errorDisplay.setText("");
 				if (userIsTyping) {
 		
 					if (operandOne >= 0 && operandTwo < 0) {
 						operandTwo = Integer.parseInt(display.getText());
 						int answer = op.operate(operandOne, operandTwo);
 						String strAns = Integer.toString(answer);
						display.setText(strAns);
 						
 					} else if (operandOne < 0) {
 						operandOne = Integer.parseInt(display.getText());
 						display.setText(Integer.toString(operandOne));
 					}
 					// reset vars
 					operandOne = -1;
					operandTwo = -1;
 					userIsTyping = false;
 				}
 			}
		});
 		
 		clearButton.setOnAction(new EventHandler<ActionEvent>() {
 			public void handle(ActionEvent event) {
 				// reset vars and display
 				operandOne = -1;
 				operandTwo = -1;
 				userIsTyping = false;
 				display.setText("0");
 			}
		});
 	}
	
	public static void main(String[] args) {
        // Initialize vars and launch
		opFactory = new OperationFactory();
        operandOne = -1;
        operandTwo = -1;
        userIsTyping = false;
		launch(args);
    }
}