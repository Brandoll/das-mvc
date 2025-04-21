package mvc01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora implements ActionListener {

    private VistaCalculadora vista;

    public ControladorCalculadora() {
        vista = new VistaCalculadora();
        vista.bcalcular.addActionListener(this);
        vista.setTitle("Calculadora MVC");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String op1 = vista.txtOp1.getText();
        String op2 = vista.txtOp2.getText();
        Validacion v = new Validacion();

        if (!v.checkDouble(op1) || !v.checkDouble(op2)) {
            vista.txtRes.setText("Entrada inválida");
            return;
        }

        double a = Double.parseDouble(op1);
        double b = Double.parseDouble(op2);
        String operacion = (String) vista.SelelectOpe.getSelectedItem();

        double resultado = 0;

        switch (operacion) {
            case "Suma": {
                ModeloSuma modelo = new ModeloSuma();
                modelo.setOp1(a);
                modelo.setOp2(b);
                modelo.calcular();
                resultado = modelo.getRes();
                break;
            }
            case "Resta": {
                ModeloResta modelo = new ModeloResta();
                modelo.setOp1(a);
                modelo.setOp2(b);
                modelo.calcular();
                resultado = modelo.getRes();
                break;
            }
            case "Multiplicación": {
                ModeloMultiplicacion modelo = new ModeloMultiplicacion();
                modelo.setOp1(a);
                modelo.setOp2(b);
                modelo.calcular();
                resultado = modelo.getRes();
                break;
            }
            case "División": {
                if (b == 0) {
                    vista.txtRes.setText("División por cero");
                    return;
                }
                ModeloDivision modelo = new ModeloDivision();
                modelo.setOp1(a);
                modelo.setOp2(b);
                modelo.calcular();
                resultado = modelo.getRes();
                break;
            }
            default:
                vista.txtRes.setText("Operación no válida");
                return;
        }

        vista.txtRes.setText(String.valueOf(resultado));
    }

    public static void main(String[] args) {
        new ControladorCalculadora();
    }
}
