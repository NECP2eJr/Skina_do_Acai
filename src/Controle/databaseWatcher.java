package Controle;

import java.util.logging.Level;
import java.util.logging.Logger;

public class databaseWatcher implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                //TODO; Implementar consulta ao banco e preenchimento das informações na interface

                //Este arquivo seria usado para fazer a requisição no banco para puxar as informações que seria colocado na tela cozinha de tempos em tempos.
                //Como a tela cozinha precisa ficar aberta, de tempos em tempos(10 segundos por exemplo) seria feito uma requisição ao banco para verificar se tem pedido, 
                //novo com o status "Cozinha" e recarregar a tela da cozinha com esse pedido inserido lá
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(databaseWatcher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
