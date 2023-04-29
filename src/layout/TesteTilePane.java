package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class TesteTilePane extends TilePane {
	
	public TesteTilePane() {
		List<Quadrado> quadrados = new ArrayList<Quadrado>();
		
		/*  Método para povoar a lista */ 
		for (int i = 1; i < 10; i++) {
			quadrados.add(new Quadrado(i * 10));
		}
		
		setTileAlignment(Pos.BOTTOM_RIGHT);
		setVgap(10);
		setHgap(10);
		getChildren().addAll(quadrados);
		
	}

}
