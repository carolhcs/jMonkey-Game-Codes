package geracaomapa;
import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import java.util.Random;
/**
 * Geração automatica de mapas
 * @author carolhcs
 */
public class mapa02 extends SimpleApplication {
    public static void main(String[] args) {
        mapa app = new mapa();
        app.start();
    }
    @Override
    public void simpleInitApp() {
        gerarSolo(10,0.5f,10);
        int m[][] = new int[20][20];
        Random gerador = new Random();
        for (int aux = 0; aux < 20; aux++){
            for (int auz = 0; auz < 20; auz++){
                int gerado = gerador.nextInt(4);
                if(aux == 0 || auz == 0 || aux == 19 || auz == 19){
                    gerarParede(aux, 1, auz);
                } else if (gerado == 1){
                    gerarParede(aux, 1, auz);
                } else if (gerado == 2){
                    gerarPedra01(aux, 1, auz);
                } else if (gerado == 3){
                    gerarPedra02(aux, 1, auz);
                } else {
                    //--- Posição Vazia
                }
            }
        }
        
    }
    public void gerarSolo(float x, float y, float z){
        Box b = new Box(10, 0.2f, 10);
        Geometry geom = new Geometry("Box", b);
        geom.setLocalTranslation(new Vector3f(x,y,z));
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Red);
        geom.setMaterial(mat);
        rootNode.attachChild(geom);
    }    
    public void gerarParede(int x, int y, int z){
        Box b = new Box(0.5f, 0.5f, 0.5f);
        Geometry geom = new Geometry("Box", b);
        geom.setLocalTranslation(new Vector3f(x,y,z));
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Black);
        geom.setMaterial(mat);
        rootNode.attachChild(geom);
    }
    public void gerarPedra01(int x, int y, int z){
        Box b = new Box(0.2f, 0.5f, 0.2f);
        Geometry geom = new Geometry("Box", b);
        geom.setLocalTranslation(new Vector3f(x,y,z));
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Gray);
        geom.setMaterial(mat);
        rootNode.attachChild(geom);
    }
    public void gerarPedra02(int x, int y, int z){
        Box b = new Box(0.2f, 0.5f, 0.2f);
        Geometry geom = new Geometry("Box", b);
        geom.setLocalTranslation(new Vector3f(x,y,z));
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        geom.setMaterial(mat);
        rootNode.attachChild(geom);
    }

////Os comandos extras não usados anteriormente foram:

//Matriz inteira de tamanho 20 por 20
int m[][] = new int[20][20];

//Instanciando e utilizando o Random para gerar números aleatórios
Random gerador = new Random();
int gerado = gerador.nextInt(4);

//Estrutura de repetição
for (int aux = 0; aux < 20; aux++){}

//Estrutura condicional
if(aux == 0 || auz == 0 || aux == 19 || auz == 19){
} else if (gerado == 1){
} else {}

//Define a posição X, Y e Z do objeto criado
geom.setLocalTranslation(new Vector3f(x,y,z));
}