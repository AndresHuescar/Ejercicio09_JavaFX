package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Etiqueta donde se mostrará el texto introducido por el usuario
        Label etiqueta = new Label("Aquí aparecerá el texto introducido");

        // Campo de texto donde el usuario escribe
        TextField campoTexto = new TextField();
        campoTexto.setPromptText("Escribe un texto");

        // Botón que mostrará el texto y después limpiará el campo
        Button boton = new Button("Mostrar y limpiar");

        // Evento que se ejecuta al pulsar el botón
        boton.setOnAction(event -> {
            String textoIntroducido = campoTexto.getText();

            // Muestro el texto escrito en la etiqueta
            etiqueta.setText(textoIntroducido);

            // Limpio el campo de texto después de pulsar el botón
            campoTexto.clear();
        });

        // VBox organiza los elementos en vertical
        VBox root = new VBox(15);
        root.getChildren().addAll(etiqueta, campoTexto, boton);

        // Estilo para centrar los elementos y mejorar la presentación
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        // Limito el ancho del campo de texto
        campoTexto.setMaxWidth(250);

        // Creo la escena principal
        Scene scene = new Scene(root, 450, 250);

        // Configuro y muestro la ventana
        stage.setTitle("Ejercicio 9 - JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}