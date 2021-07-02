
public class InteresMensual implements VisitorInteres{

    public Double visitarTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){
        return tarjetaDeCredito.saldo*0.5;
    }

    public Double visitarCuentaCorriente(CuentaCorriente cuentaCorriente){
        return 0.0;
        //comportamiento de la cuenta corriente
    }

    public Double visitarCajaDeAhorro(CajaDeAhorro cajaDeAhorro){
        return 0.0;
        //comportamiento de la caja de ahorro
    }
}
