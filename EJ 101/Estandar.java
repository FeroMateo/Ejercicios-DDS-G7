package domain;

interface StrategyEnvios
{
    long calcularEnvio(long Peso, long ConstantePorPeso);
}

public class Estandar implements StrategyEnvios {


    public long calcularEnvio(long Peso, long ConstantePorPeso) {
        return Peso*ConstantePorPeso;
    }
}



