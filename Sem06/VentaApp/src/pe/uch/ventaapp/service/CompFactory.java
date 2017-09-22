package pe.uch.ventaapp.service;

public final class CompFactory {
    
    public static final String FACTURA = "FACTURA";
    public static final String BOLETA = "BOLETA";

    private CompFactory() {
    }
    
    public static CompAbstract obtenerComp(String tipo){
        CompAbstract comp = null;
        switch(tipo){
            case FACTURA:
                comp = new FacturaService();
                break;
            case BOLETA:
                comp = new BoletaService();
                break;                
        }
        return comp;
    }
      
    public static String[] obtenerTipos(){
        String tipos[] = {FACTURA, BOLETA};
        return tipos;
    }
}
