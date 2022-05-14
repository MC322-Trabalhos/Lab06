package src.pt.c40task.l05wumpus.componentes;

import src.pt.c40task.l05wumpus.utils.Interacao;

public class Fedor extends Componente {

    public Fedor(){
        tipo = 'f';
    }
    
    @Override
    public Interacao interage(Player jogador) {
		return new Interacao("Voce sente um cheiro de carne podre!", 0);
    	
    }
}
