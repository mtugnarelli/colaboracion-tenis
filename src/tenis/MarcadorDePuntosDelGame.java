package tenis;

public class MarcadorDePuntosDelGame {

    public String obtenerValor(Game game, Puntos puntos, Puntos puntosDelCompetidor) {

        String valor;

        switch (puntos.obtenerCantidad()) {

            case 0:
                valor = obtenerValorPara0();
                break;
    
            case 1:
                valor = obtenerValorPara1();
                break;
    
            case 2:
                valor = obtenerValorPara2();
                break;
    
            default:
                valor = obtenerValorPara3OMas(game, puntos, puntosDelCompetidor);
        }

        return valor;
    }

    private String obtenerValorPara0() {

        return "0";
    }

    private String obtenerValorPara1() {

        return "15";
    }

    private String obtenerValorPara2() {

        return "30";
    }

    private String obtenerValorPara3OMas(Game game, Puntos puntos, Puntos puntosDelCompetidor) {

        String valor;

        if (puntosDelCompetidor.sonMasQue(puntos)) {
        
            valor = "";
        
        } else if ((puntos.obtenerCantidad() == 3) || puntos.sonIguales(puntosDelCompetidor)) {
        
            valor = "40";
        
        } else if (game.termino()) {
            
            valor = "Game";
            
        } else {

            valor = "AD";
        }

        return valor;
    }

}
