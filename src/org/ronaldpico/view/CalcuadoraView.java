
package org.ronaldpico.view;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.ronaldpico.controller.CalculadoraController;

    public class CalcuadoraView {
 
    private VBox view;
    private Label pantalla;
    private GridPane cuadroBotones;
  
    private CalculadoraController controlador;
 
    // CONSTRUCTOR CORREGIDO: Recibe el controlador y lo asigna
    public CalcuadoraView(CalculadoraController controlador) {
        this.controlador = controlador;
 
        view = new VBox(15);
        view.setPadding(new Insets(15));
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #27BBF5;");
 
        pantalla = new Label("0");
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT);
        pantalla.setPrefSize(235, 0);
        pantalla.setStyle("-fx-background-color: white; -fx-padding: 0 10 0 0;");
 
       
     
        cuadroBotones = new GridPane();
        cuadroBotones.setHgap(12);// interlinaedo entre elementos de la cuadricula
        cuadroBotones.setVgap(12);
        cuadroBotones.setAlignment(Pos.CENTER);//alineado al centro
 
        //Primer Boton
        Button btnUno = nuevoBoton("1");
        Button btnDos =  nuevoBoton("2");
        Button btnTres = nuevoBoton("3");
        Button btnMas =  nuevoBoton("+");
        Button btnCuatro = nuevoBoton("4");
        Button btnCinco =  nuevoBoton("5");
        Button btnSeis =  nuevoBoton("6");
        Button btnMenos =  nuevoBoton("-");
        Button btnSiete = nuevoBoton("7");
        Button btnOcho =  nuevoBoton("8");
        Button btnNueve =  nuevoBoton("9");
        Button btnPor =  nuevoBoton("x");
        Button btnMasMenos =  nuevoBoton("+/-");
        Button btnCero =  nuevoBoton("0");
        Button btnPunto = nuevoBoton (".");
        Button btnIgual = nuevoBoton ("=");
        Button btnEliminarTodo = nuevoBoton ("C");
        Button btnBorrarEntrada = nuevoBoton ("CE");
        Button btnEliminarUno = nuevoBoton ("⌫");
        Button btnPorcentaje = nuevoBoton ("%");   
        Button btnRaiz = nuevoBoton ("√");
        Button btnInverso = nuevoBoton ("1/x");
        Button btnCuadrado = nuevoBoton ("x²");
        Button btnDivision = nuevoBoton ("÷");
        
        //agregarlo al cuadroBotones
        cuadroBotones.add(btnSiete, 0, 3);
        cuadroBotones.add(btnOcho, 1, 3);
        cuadroBotones.add(btnNueve, 2, 3);
        cuadroBotones.add(btnPor, 3, 3);
        cuadroBotones.add(btnCuatro, 0, 4);
        cuadroBotones.add(btnCinco, 1, 4);
        cuadroBotones.add(btnSeis, 2, 4);
        cuadroBotones.add(btnMenos, 3, 4);
        cuadroBotones.add(btnUno, 0, 5);
        cuadroBotones.add(btnDos, 1, 5);
        cuadroBotones.add(btnTres, 2, 5);
        cuadroBotones.add(btnMas, 3, 5);
         cuadroBotones.add(btnMasMenos, 0, 6);
        cuadroBotones.add(btnCero, 1, 6);
        cuadroBotones.add(btnPunto, 2, 6);
        cuadroBotones.add(btnIgual, 3, 6);
        cuadroBotones.add(btnInverso, 0, 2);
        cuadroBotones.add(btnCuadrado, 1, 2);
        cuadroBotones.add(btnRaiz, 2, 2);
        cuadroBotones.add(btnDivision, 3, 2);
        cuadroBotones.add(btnEliminarTodo, 0, 2);
        cuadroBotones.add(btnEliminarUno, 1, 2);
        cuadroBotones.add(btnBorrarEntrada, 2, 2);
        cuadroBotones.add(btnPorcentaje, 3, 2);
        view.getChildren().addAll(pantalla, cuadroBotones);
 
    }
 
    public VBox getView() {
        return view;
    }
    private Button nuevoBoton(String texto) {
        Button btn = new Button(texto);
        btn.setPrefSize(50, 50);
        btn.setFont(Font.font("Consolas", FontWeight.NORMAL, 20));
        btn.setStyle("-fx-background-color: #2791F5; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
 
        btn.setOnMousePressed(e -> {
            btn.setStyle("-fx-background-color: #273CF5; -fx-text-fill:white; -fx-background-radius:5px;");
            btn.setTranslateY(2);
        });
        btn.setOnMouseReleased(e -> {
            btn.setStyle("-fx-background-color: #2791F5; -fx-text-fill:white; -fx-background-radius:5px;");
            btn.setTranslateY(0);
        });
 
        // Ahora sí funciona porque controlador ya está inicializado
        btn.setOnAction(e -> controlador.procesoDeEntrada(texto, pantalla));
        return btn;
    }
}