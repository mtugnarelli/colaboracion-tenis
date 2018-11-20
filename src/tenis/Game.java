package tenis;

public class Game {

    private Puntos puntosDelSaque;
    private Puntos puntosDelReceptor;
    
    public Game() {
        
        puntosDelSaque = new Puntos();
        puntosDelReceptor = new Puntos();
    }
    
    public void anotarPuntoAlSaque() {

        if (termino()) {
            
            Error terminoElGame = new Error("No se puede anotar porque el Game ya terminó");
            throw terminoElGame;
        }
        
        puntosDelSaque.anotar();
    }
    
    public void anotarPuntoAlReceptor() {

        puntosDelReceptor.anotar();
    }
    
    public boolean ganoElSaque() {
        
        return puntosDelSaque.sonSuficientesParaGanarA(puntosDelReceptor);
    }
    
    public boolean ganoElReceptor() {
        
        return false;
    }
    
    public boolean termino() {
        
        return (ganoElSaque() || ganoElReceptor());
    }
 
    public String obtenerMarcadorDelSaque() {
        
       MarcadorDePuntosDelGame marcador = new MarcadorDePuntosDelGame();
       
       return marcador.obtenerValor(this, puntosDelSaque, puntosDelReceptor);
    }
    
    public String obtenerMarcadorDelReceptor() {
        
        return null;
    }
    
}

