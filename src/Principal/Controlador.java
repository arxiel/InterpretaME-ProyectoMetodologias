package Principal;

import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.TitledPane;

public class Controlador {
    //Elementos gráficos
    public JFXTextField fraseTF;
    public JFXTextField expresionTF;
    public TitledPane simbolosTP;
    public TitledPane opcionesTP;

    private String frase;
    private String expresion;

    public void initialize(){
        simbolosTP.getStyleClass().set(0,"titled-pane");
        simbolosTP.setExpanded(false);
        opcionesTP.getStyleClass().set(0,"titled-pane");
        opcionesTP.setExpanded(false);
    }
}
