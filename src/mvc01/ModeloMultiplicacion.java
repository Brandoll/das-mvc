package mvc01;

public class ModeloMultiplicacion {

    private double op1;
    private double op2;
    private double res;

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public double calcular() {
        this.res = this.op1 * this.op2;
        return this.res;
    }
}
