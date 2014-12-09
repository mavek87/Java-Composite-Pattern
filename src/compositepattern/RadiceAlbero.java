package compositepattern;

import java.util.ArrayList;

/**
 *
 * @author Matteo Veroni
 */

public class RadiceAlbero extends ComponenteAlbero{
    
        private String nomeRadice;
    
        private ArrayList<ComponenteAlbero> componentiAlbero;
        
        public RadiceAlbero(String nomeRadice){
            
                this.nomeRadice = nomeRadice;
                
                componentiAlbero = new ArrayList<>();
                
        }
        
        @Override
        public void aggiungi(ComponenteAlbero nuovoComponente) { 
        
                componentiAlbero.add(nuovoComponente);
            
        }

        @Override
        public void infoComponente() {
            
                System.out.println("Radice: '" + nomeRadice + "'");
                
                for (ComponenteAlbero componenteAlberoCheStoVisitando : componentiAlbero) 
                    
                    componenteAlberoCheStoVisitando.infoComponente();
            
        }

}
