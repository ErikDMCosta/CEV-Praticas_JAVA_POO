package aula06b;
public class Aula06b {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        //c.ligar();
        //c.volume = 80;      // Não consegue por estar encapusulado
        //c.setVolume(50);    // Não consegue por estar encapusulado
        c.maisVolume();
        c.menosVolume();
        //c.ligarMudo();
        c.desligarMudo();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
