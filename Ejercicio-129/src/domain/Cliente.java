package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente {
    private Integer dni;
    private String nombre;
    private String domicilio;
    private final List<Cuenta> cuentas = new ArrayList<>();


    public Boolean coincideCon(Integer dni){
        return this.dni.equals(dni);
    }

    public void agregarCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }

    public Integer cantidadDeCuentasMayoresA(Double saldo){
        return this.cuentas.stream().filter(cuenta -> cuenta.superaSaldo(saldo))
                .collect(Collectors.toList()).size();
    }
}
