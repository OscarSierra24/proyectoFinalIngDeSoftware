/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditosbancos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sun.font.FontFamily;

/**
 *
 * @author sergioalvarado
 */
public class PanelCaptura extends JPanel{
    double porcentajeDeseado;
    JTextField valorVivienda,valorDestructible,actEconomica, gastosNotariales, comisionApertura, atendidoPor, nombre,plazo,montoPrestamo;
    JLabel ValorVivienda,ValorDestructible,ActEconomica, GastosNotariales, ComisionApertura, AtendidoPor, Nombre,Plazo,MontoPrestamo;
    JButton guardar;
    public PanelCaptura(){
        this.setPreferredSize(new Dimension(900,750));
        Nombre=new JLabel("Nombre del cliente:");
        //Nombre.setFont(new Font(TOOL_TIP_TEXT_KEY, 20));
        this.add(Nombre);
        nombre=new JTextField(20);
        this.add(this.nombre);
        AtendidoPor=new JLabel("Atendido por:");
        this.add(AtendidoPor);
        atendidoPor=new JTextField(20);
        this.add(this.atendidoPor);
    }
    
}
