package domain;

public class Cuenta {

    private Double saldo;

    public Boolean superaSaldo(Double unSaldo){
        return this.saldo > unSaldo;
    }
}
