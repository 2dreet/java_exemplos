package orientacaoObjeto.models;

public class Carro {

    final public Motor motor;

    public Carro(){
        this.motor = new Motor(this);
    }


    public void acelerar() {
        if(motor.fatorInjecao < 3) {
            motor.fatorInjecao += 0.5;
        }
    }

    public void frear() {
        if(motor.fatorInjecao >= 0.5) {
            motor.fatorInjecao -= 0.5;
        }
    }

    public void ligar() {
        motor.ligado = true;
    }

    public void desligar() {
        motor.ligado = false;
    }

    public boolean estaLigado() {
        return motor.ligado;
    }

}
