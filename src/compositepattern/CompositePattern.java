package compositepattern;

/**
 *
 * @author Matteo Veroni
 */

public class CompositePattern {

    public static void main(String[] args) {
        
            ComponenteAlbero radicePrincipale = new RadiceAlbero("Radice Principale");
            
            ComponenteAlbero radiceSinistra = new RadiceAlbero("Radice Sinistra");
            ComponenteAlbero radiceDestra = new RadiceAlbero("Radice Destra");
            
            radicePrincipale.aggiungi(radiceSinistra);
            radicePrincipale.aggiungi(radiceDestra);
            
            ComponenteAlbero foglia1RadiceSinistra = new FogliaAlbero("Foglia 1 radice Sinistra", 1);
            ComponenteAlbero foglia2RadiceSinistra = new FogliaAlbero("Foglia 2 radice Sinistra", 2);
            
            radiceSinistra.aggiungi(foglia1RadiceSinistra);
            radiceSinistra.aggiungi(foglia2RadiceSinistra);
            
            radicePrincipale.infoComponente();
        
    }
    
}
