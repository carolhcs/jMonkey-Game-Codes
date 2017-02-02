import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import java.util.Random;

public class mapa extends SimpleApplication {
	
	public static void main(String[] args) {
        mapa app = new mapa();
        app.start();
    }

    @Override
    public void simpleInitApp() {
    	Box b = new Box(1, 1, 1);//cria uma forma de cubo tamanho 1x1x1
        Geometry geom = new Geometry("Box", b);//cria a geometria do cubo
        Material mat = new Material(assetManager,
          "Common/MatDefs/Misc/Unshaded.j3md");//cria um material simples
        mat.setColor("Color", ColorRGBA.Blue);//define a cor azul para o material
        geom.setMaterial(mat);//aplica o material na geometria do cubo
        rootNode.attachChild(geom);//faz o cubo aparecer na cena
    }

}