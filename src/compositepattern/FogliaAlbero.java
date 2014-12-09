package compositepattern;

/**
 *
 * @author Matteo Veroni
 */

public class FogliaAlbero extends ComponenteAlbero{
        
        private String nomeFoglia;
        
        private int valoreFoglia;
        
        public FogliaAlbero(String nomeFoglia, int valoreFoglia){
            
                this.nomeFoglia = nomeFoglia;
                
                this.valoreFoglia = valoreFoglia;
            
        }

        @Override
        public void infoComponente() {
            
                System.out.println("Foglia: '" + nomeFoglia + "'\t Valore foglia: '" + valoreFoglia + "'");
            
        }

}
