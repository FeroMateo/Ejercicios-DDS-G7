package domain;

import java.util.ArrayList;
import java.util.List;

public class Control {

    private final List<Cliente> clientes = new ArrayList<>();

    public Integer contarCuentas(Integer dniCliente, Double saldo){
        return this.buscarCliente(dniCliente).cantidadDeCuentasMayoresA(saldo);
    }

    public Cliente buscarCliente(Integer dniCliente) {
        return this.clientes.stream().filter(cliente -> cliente.coincideCon(dniCliente))
                .findFirst().orElseThrow(() -> new ClienteNoEncontradoExcepcion("No se ha encontrado el cliente con dni: " + dniCliente));
    }
}
