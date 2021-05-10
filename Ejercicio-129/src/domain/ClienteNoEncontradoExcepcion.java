package domain;

public class ClienteNoEncontradoExcepcion extends RuntimeException {

    public ClienteNoEncontradoExcepcion(String message) {
        super(message);
    }
}
