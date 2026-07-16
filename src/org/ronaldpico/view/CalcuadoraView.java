
package org.ronaldpico.view;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
 

public class CalcuadoraView {
 
    private VBox view;
    private Label pantalla;
    private GridPane cuadroBotones;
 
    public CalcuadoraView() {
        view = new VBox(15);
        view.setPadding(new Insets(15));
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #8EF527;");
 
        pantalla = new Label("0");
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT);
        pantalla.setPrefSize(235, 50);
 
        cuadroBotones = new GridPane();
        cuadroBotones.setHgap(12);// interlinaedo entre elementos de la cuadricula
        cuadroBotones.setVgap(12);
        cuadroBotones.setAlignment(Pos.CENTER);//alineado al centro
 
        //Primer Boton
        Button btnUno = new Button("1");
        btnUno.setPrefSize(50, 50);
        btnUno.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        
        
        btnUno.setOnMousePressed(e -> {
           btnUno.setStyle("-fx-background-color: #388E3C;"); 
        });
        
        btnUno.setOnMouseReleased( e -> {
            btnUno.setStyle("-fx-background-color: #688E23;");
        });
        
        btnUno.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
          Button btnDos = new Button("2");
        btnDos.setPrefSize(50, 50);
        btnDos.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        
        
        btnDos.setOnMousePressed(e -> {
           btnDos.setStyle("-fx- background-color; #388E3C;"); 
        });
        
        btnDos.setOnMouseReleased( e -> {
            btnDos.setStyle("-fx- background-color; #688E23;");
        });
        
        btnDos.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
        
        
         Button btnTres = new Button("3");
        btnTres.setPrefSize(50, 50); // Corregido: antes decía btnUno
         btnTres.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnTres.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnTres.setOnMousePressed(e -> {
           btnTres.setStyle("-fx- background-color; #111C29;"); 
        });
            btnTres.setTranslateY(0);
        
        btnTres.setOnMouseReleased( e -> {
            btnTres.setStyle("-fx- background-color; #111C29;");
            btnTres.setLayoutY(0);
        });
        
        Button btnMas = new Button("+");
        btnMas.setPrefSize(50, 50); // Corregido: antes decía btnU
         btnMas.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnMas.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnMas.setOnMousePressed(e -> {
           btnMas.setStyle("-fx- background-color; #111C29;"); 
        });
            btnMas.setTranslateY(0);
        
        btnMas.setOnMouseReleased( e -> {
            btnMas.setStyle("-fx- background-color; #111C29;");
            btnMas.setLayoutY(0);
        });
        
        Button btnCuatro = new Button("4");
        btnCuatro.setPrefSize(50, 50); // Corregido: antes decía btnUno
         btnCuatro.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnCuatro.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnCuatro.setOnMousePressed(e -> {
           btnTres.setStyle("-fx- background-color; #111C29;"); 
        });
            btnCuatro.setTranslateY(0);
        
        btnCuatro.setOnMouseReleased( e -> {
            btnCuatro.setStyle("-fx- background-color; #111C29;");
            btnCuatro.setLayoutY(0);
        });
        
        Button btnCinco = new Button("5");
        btnCinco.setPrefSize(50, 50); // Corregido: antes decía btnUno
         btnCinco.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnCinco.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnCinco.setOnMousePressed(e -> {
           btnCinco.setStyle("-fx- background-color; #111C29;"); 
        });
            btnCinco.setTranslateY(0);
        
        btnCinco.setOnMouseReleased( e -> {
            btnCinco.setStyle("-fx- background-color; #111C29;");
            btnCinco.setLayoutY(0);
        });
        
        Button btnSeis = new Button("6");
        btnSeis.setPrefSize(50, 50); // Corregido: antes decía btnUno
         btnSeis.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnSeis.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnSeis.setOnMousePressed(e -> {
           btnSeis.setStyle("-fx- background-color; #111C29;"); 
        });
            btnSeis.setTranslateY(0);
        
        btnSeis.setOnMouseReleased( e -> {
            btnSeis.setStyle("-fx- background-color; #111C29;");
            btnSeis.setLayoutY(0);
        });
        
        Button btnMenos = new Button("-");
        btnMenos.setPrefSize(50, 50); // Corregido: antes decía btnUn
         btnMenos.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnMenos.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnMenos.setOnMousePressed(e -> {
           btnMenos.setStyle("-fx- background-color; #111C29;"); 
        });
            btnMenos.setTranslateY(0);
        
        btnMenos.setOnMouseReleased( e -> {
            btnMenos.setStyle("-fx- background-color; #111C29;");
            btnMenos.setLayoutY(0);
        });
        
         Button btnSiete = new Button("7");
        btnSiete.setPrefSize(50, 50); // Corregido: antes decía btnUno
         btnSiete.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnSiete.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnSiete.setOnMousePressed(e -> {
           btnSiete.setStyle("-fx- background-color; #111C29;"); 
        });
            btnSiete.setTranslateY(0);
        
        btnSiete.setOnMouseReleased( e -> {
            btnSiete.setStyle("-fx- background-color; #111C29;");
            btnSiete.setLayoutY(0);
        });
        
        Button btnOcho = new Button("8");
        btnOcho.setPrefSize(50, 50); // Corregido: antes decía btnUn
         btnOcho.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnOcho.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnOcho.setOnMousePressed(e -> {
           btnOcho.setStyle("-fx- background-color; #111C29;"); 
        });
            btnOcho.setTranslateY(0);
        
        btnOcho.setOnMouseReleased( e -> {
            btnOcho.setStyle("-fx- background-color; #111C29;");
            btnOcho.setLayoutY(0);
        });
        
          
         Button btnNueve = new Button("9");
        btnNueve.setPrefSize(50, 50); // Corregido: antes decía btnUno
         btnNueve.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnNueve.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnNueve.setOnMousePressed(e -> {
           btnNueve.setStyle("-fx- background-color; #111C29;"); 
        });
            btnSiete.setTranslateY(0);
        
        btnNueve.setOnMouseReleased( e -> {
            btnNueve.setStyle("-fx- background-color; #111C29;");
            btnNueve.setLayoutY(0);
        });
        
        Button btnPor = new Button("x");
        btnPor.setPrefSize(50, 50); // Corregido: antes decía btnUn
         btnPor.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnPor.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnPor.setOnMousePressed(e -> {
           btnPor.setStyle("-fx- background-color; #111C29;"); 
        });
            btnPor.setTranslateY(0);
        
        btnPor.setOnMouseReleased( e -> {
            btnPor.setStyle("-fx- background-color; #111C29;");
            btnPor.setLayoutY(0);
        });
        
          Button btnMasMenos = new Button("+/-");
        btnMasMenos.setPrefSize(50, 50); // Corregido: antes decía btnUno
         btnMasMenos.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnMasMenos.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnMasMenos.setOnMousePressed(e -> {
           btnMasMenos.setStyle("-fx- background-color; #111C29;"); 
        });
            btnMasMenos.setTranslateY(0);
        
        btnMasMenos.setOnMouseReleased( e -> {
            btnMasMenos.setStyle("-fx- background-color; #111C29;");
            btnMasMenos.setLayoutY(0);
        });
        
        Button btnCero = new Button("0");
        btnCero.setPrefSize(50, 50); // Corregido: antes decía btnUn
         btnCero.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnCero.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnCero.setOnMousePressed(e -> {
           btnCero.setStyle("-fx- background-color; #111C29;"); 
        });
            btnCero.setTranslateY(0);
        
        btnCero.setOnMouseReleased( e -> {
            btnCero.setStyle("-fx- background-color; #111C29;");
            btnCero.setLayoutY(0);
        });
        
        Button btnPunto = new Button(".");
        btnPunto.setPrefSize(50, 50); // Corregido: antes decía btnUno
         btnPunto.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnPunto.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnPunto.setOnMousePressed(e -> {
           btnPunto.setStyle("-fx- background-color; #111C29;"); 
        });
            btnPunto.setTranslateY(0);
        
        btnPunto.setOnMouseReleased( e -> {
            btnPunto.setStyle("-fx- background-color; #111C29;");
            btnPunto.setLayoutY(0);
        });
        
        Button btnIgual = new Button("=");
        btnIgual.setPrefSize(50, 50); // Corregido: antes decía btnUn
         btnIgual.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnIgual.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnIgual.setOnMousePressed(e -> {
           btnIgual.setStyle("-fx- background-color; #111C29;"); 
        });
            btnIgual.setTranslateY(0);
        
        btnIgual.setOnMouseReleased( e -> {
            btnIgual.setStyle("-fx- background-color; #111C29;");
            btnIgual.setLayoutY(0);
        });
        
        Button btnRaiz = new Button("√");
        btnRaiz.setPrefSize(50, 50); // Corregido: antes decía btnUno
         btnRaiz.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnRaiz.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnRaiz.setOnMousePressed(e -> {
           btnRaiz.setStyle("-fx- background-color; #111C29;"); 
        });
            btnRaiz.setTranslateY(0);
        
        btnRaiz.setOnMouseReleased( e -> {
            btnRaiz.setStyle("-fx- background-color; #111C29;");
            btnRaiz.setLayoutY(0);
        });
        
        Button btnInverso = new Button("1/x");
        btnInverso.setPrefSize(50, 50); // Corregido: antes decía btnUn
         btnInverso.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnInverso.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnInverso.setOnMousePressed(e -> {
           btnInverso.setStyle("-fx- background-color; #111C29;"); 
        });
            btnInverso.setTranslateY(0);
        
        btnInverso.setOnMouseReleased( e -> {
            btnInverso.setStyle("-fx- background-color; #111C29;");
            btnInverso.setLayoutY(0);
        });
        
        Button btnCuadrado = new Button("x²");
        btnCuadrado.setPrefSize(50, 50); // Corregido: antes decía btnUno
         btnCuadrado.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnCuadrado.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnCuadrado.setOnMousePressed(e -> {
           btnCuadrado.setStyle("-fx- background-color; #111C29;"); 
        });
            btnCuadrado.setTranslateY(0);
        
        btnCuadrado.setOnMouseReleased( e -> {
            btnCuadrado.setStyle("-fx- background-color; #111C29;");
            btnCuadrado.setLayoutY(0);
        });
        
        Button btnDivision = new Button("÷");
        btnDivision.setPrefSize(50, 50); // Corregido: antes decía btnUn
         btnDivision.setStyle("-fx-background-color: #688E23; -fx-text-fill:white; -fx-background-radius:5px; -fx-cursor: hand;");
        btnDivision.setFont(Font.font("consolas", FontWeight.BOLD,20));
        
         btnDivision.setOnMousePressed(e -> {
           btnDivision.setStyle("-fx- background-color; #111C29;"); 
        });
            btnDivision.setTranslateY(0);
        
        btnDivision.setOnMouseReleased( e -> {
            btnDivision.setStyle("-fx- background-color; #111C29;");
            btnDivision.setLayoutY(0);
        });
        
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
        view.getChildren().addAll(pantalla, cuadroBotones);
 
    }
 
    public VBox getView() {
        return view;
    }
    
    private Button nuevoBoton (String texto){
        Button btn = new Button(texto);
        btn.setPrefSize(50,50);
        btn.setStyle("");
        
        btn.setOnMousePressed(e -> {
           btn.setStyle("-fx- background-color; #111C29;"); 
        });
            btn.setTranslateY(0);
        
        btn.setOnMouseReleased( e -> {
            btn.setStyle("-fx- background-color; #111C29;");
            btn.setLayoutY(0);
        });
        //Configuracion de boton
        //tamaño, el estilo, sus funciones 
        
        return btn;
    }
}