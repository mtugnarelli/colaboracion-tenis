package tenis;

public class Puntos {

    private int cantidad;
    
    public Puntos() {
        
        cantidad = 0;
    }
    
    public void anotar() {
        
        cantidad++;
    }
    
    public boolean sonIguales(Puntos competidor) {
        
        return (cantidad == competidor.cantidad);
    }
    
    public boolean sonMasQue(Puntos competidor) {

        return (cantidad > competidor.cantidad);
    }
    public boolean sonSuficientesParaGanarA(Puntos competidor) {
        
        return (cantidad >= 4) && (cantidad >= competidor.cantidad + 2);
    }
    
    public int obtenerCantidad() {
        
        return cantidad;
    }

}
