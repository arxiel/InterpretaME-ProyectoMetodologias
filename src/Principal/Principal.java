package Principal;

import com.jfoenix.controls.JFXTextField;

public class Principal {

    JFXTextField idTextFieldFrase;

    private void ingresarFrase(java.awt.event.KeyEvent evento){
        char c = evento.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            idTextFieldFrase.setEditable(true);
        }else{
            idTextFieldFrase.setEditable(false);
        }
    }

    private void simbolo1(){
        String texto = idTextFieldFrase.getText();
        idTextFieldFrase.setText(texto + "»");
    }

    private void simbolo2(){
        String texto = idTextFieldFrase.getText();
        idTextFieldFrase.setText(texto + "«");
    }

    private void simbolo3(){
        String texto = idTextFieldFrase.getText();
        idTextFieldFrase.setText(texto + "...");
    }

    private void simbolo4(){
        String texto = idTextFieldFrase.getText();
        idTextFieldFrase.setText(texto + "\"");
    }

    private void simbolo5(){
        String texto = idTextFieldFrase.getText();
        idTextFieldFrase.setText(texto + "\"");
    }

    private void simbolo6(){
        String texto = idTextFieldFrase.getText();
        idTextFieldFrase.setText(texto + "'");
    }

    private void simbolo7(){
        String texto = idTextFieldFrase.getText();
        idTextFieldFrase.setText(texto + "'");
    }

}
