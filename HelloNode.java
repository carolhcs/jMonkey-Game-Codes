package jme3test.helloworld;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;

/* Como usar os nós para manipular objetos na cena.
 * Você pode girar, traduzir e dimensionar objetos, manipulando seus nós.
 * O nó raiz é especial: Somente o que está ligado ao nó raiz aparece na cena. */

public class HelloNode extends SimpleApplication {

    public static void main(String[] args){
        HelloNode app = new HelloNode();
        app.start();
    }

    @Override
    public void simpleInitApp() {

        /** cria uma caixa azul nas coordenadas (1,-1,1) */
        Box box1 = new Box(1,1,1);
        Geometry blue = new Geometry("Box", box1);
        blue.setLocalTranslation(new Vector3f(1,-1,1));
        Material mat1 = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");
        mat1.setColor("Color", ColorRGBA.Blue);
        blue.setMaterial(mat1);

        /** cria uma caixa vermelha reta, acima da azul (1,3,1) */
        Box box2 = new Box(1,1,1);
        Geometry red = new Geometry("Box", box2);
        red.setLocalTranslation(new Vector3f(1,3,1));
        Material mat2 = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");
        mat2.setColor("Color", ColorRGBA.Red);
        red.setMaterial(mat2);

        /** Criar um nó dinâmico em (0,0,0) e o anexa ao nó raiz */
        Node pivot = new Node("pivot");
        rootNode.attachChild(pivot); // colocar este nó na cena

        /** Prende as duas caixas para o nó *pivô*. (E momentaneamente ao nó raiz.) */
        pivot.attachChild(blue);
        pivot.attachChild(red);

        /** Gira o nó dinâmico */
        pivot.rotate(.4f,.4f,0f);
    }
}