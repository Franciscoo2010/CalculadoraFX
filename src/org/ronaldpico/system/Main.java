package org.ronaldpico.system;
 
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class Main extends Application {

    private static void launch(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    public void start(Stage escenarioPrincipal) throws Exception {
 
        VBox raiz = new VBox(10);
 
        Scene escena = new Scene(raiz, 400, 300);
 
        raiz.setAlignment(Pos.CENTER);
 
        escenarioPrincipal.setTitle("Calculadora pico");
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}