package domain;

public class OtraEmpresa implements StrategyEnvios {

    public long ConstantePorPeso;

    public long calcularEnvio(long Peso, long ConstantePorPeso) {
        return Peso*ConstantePorPeso;
    }
}
