public class Conversor {

    private final ConsultarAPi consulta = new ConsultarAPi();

    public double convertir(String from, String to, double cantidad) {
        Moneda moneda = consulta.buscaMoneda(from);
        Double tasa = moneda.conversion_rates().get(to);
        if (tasa == null) {
            throw new RuntimeException("No se encontró la tasa de conversión de " + from + " a " + to);
        }
        return cantidad * tasa;
    }
}