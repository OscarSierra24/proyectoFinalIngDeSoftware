/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.GridBagLayout;

/**
 *
 * @author sergioalvarado
 */
public class Ventana extends JFrame{
    public Ventana(){
        super("Calculador de Creditos");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new PanelCaptura());
		this.pack();
        this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
	public static void main(String[] args) {
		Ventana ventana = new Ventana();		
	}
}
