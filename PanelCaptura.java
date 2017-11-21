/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author sergioalvarado
 */
public class PanelCaptura extends JPanel{
	private static final long serialVersionUID = 1L;
	double porcentajeDeseado;
	JTextField valorVivienda,valorDestructible, gastosNotariales, atendidoPor, nombre,montoPrestamo;
    JLabel ValorVivienda,ValorDestructible, GastosNotariales,Producto ,AtendidoPor,Plazo, Nombre,MontoPrestamo;
    JComboBox<String> producto,plazo;
    JButton guardar;
    Image logo2;
    boolean bancos=false;
    
    public PanelCaptura(){
        this.setPreferredSize(new Dimension(900,750)); 
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        this.setBackground(new Color(255,255,255));
        this.logo2=new ImageIcon("saludp.png").getImage();
        Font fuente = new Font("Lantinghei SC", 0,30);
        Nombre=new JLabel("Nombre del cliente:");
        Nombre.setFont(fuente);
        Nombre.setForeground(Color.WHITE);
        c.gridx = 0;
		c.gridy =0;
        this.add(Nombre,c);
        nombre=new JTextField(10);
        nombre.setToolTipText("Selecciona aqui para ingresar nombre del cliente");
        c.gridx = 1;
		c.gridy =0;
        this.add(this.nombre,c);
        AtendidoPor=new JLabel("Atendido por:");
        AtendidoPor.setFont(fuente);
        AtendidoPor.setForeground(Color.WHITE);
        c.gridx = 2;
		c.gridy =0;
        this.add(AtendidoPor,c);
        atendidoPor=new JTextField(10);
        c.gridx = 3;
		c.gridy =0;
        this.add(this.atendidoPor,c);
        this.porcentajeDeseado = 0.;
		this.valorVivienda = new JTextField(10);
		valorVivienda.setToolTipText("Valor de la viviendo");
		this.valorDestructible = new JTextField(10);
		valorDestructible.setToolTipText("Valor calculado que tomaría destruir la propiedad");
		this.Producto = new JLabel("Producto:");
		Producto.setFont(fuente);
		Producto.setForeground(Color.WHITE);
		this.gastosNotariales =new JTextField(10);
		gastosNotariales.setToolTipText("Porcentaje calculado de gastos notariales");
		this.Plazo = new JLabel("Plazo:");
		Plazo.setFont(fuente);
		Plazo.setForeground(Color.WHITE);
		this.montoPrestamo = new JTextField(10);
		montoPrestamo.setToolTipText("Cantidad que desea solicitar");
		ValorVivienda = new JLabel("Valor de la vivienda:");
		ValorVivienda.setForeground(Color.WHITE);
		ValorVivienda.setFont(fuente);
		ValorDestructible = new JLabel("Valor destructible:");
		ValorDestructible.setFont(fuente);
		ValorDestructible.setForeground(Color.WHITE);
		String[] product={"Adquisición","Pago de hipoteca", "Liquidez","Infonavit","Cofinavit","Alia2","Respalda2"};
		producto = new JComboBox<>(product);
		GastosNotariales = new JLabel("Gastos Notariales:");
		GastosNotariales.setForeground(Color.WHITE);
		GastosNotariales.setFont(fuente);
		String[] plazos={"10","15","20"};
		plazo = new JComboBox<>(plazos);
		MontoPrestamo = new JLabel("Cantidad deseada:");
		MontoPrestamo.setForeground(Color.WHITE);
		MontoPrestamo.setFont(fuente);	
		this.guardar = new JButton("Capturar");	
		c.gridwidth=0;
		c.gridx=0;
		c.gridy = 1;
		JLabel separar=new JLabel("\n");
		this.add(separar, c);
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth=1;
		this.add(Producto, c);
		c.gridx = 1;
		c.gridy = 2;
		this.add(producto, c);
		c.gridx = 0;
		c.gridy = 3;
		this.add(ValorVivienda,c);
		c.gridx = 1;
		c.gridy = 3;
		this.add(valorVivienda,c);
		c.gridx = 0;
		c.gridy = 4;
		this.add(ValorDestructible,c);
		c.gridx = 1;
		c.gridy = 4;
		this.add(valorDestructible,c);
		c.gridx = 0;
		c.gridy =5;
		c.gridwidth=1;
		this.add(GastosNotariales,c);
		c.gridx = 1;
		c.gridy =5;
		this.add(gastosNotariales,c);
		c.gridx = 0;
		c.gridy =6;
		this.add(Plazo,c);
		c.gridx = 1;
		c.gridy =6;
		this.add(plazo,c);
		c.gridx = 0;
		c.gridy =7;
		this.add(MontoPrestamo,c);
		c.gridx = 1;
		c.gridy =7;
		this.add(montoPrestamo,c);
		guardar.addActionListener(new ActionListener() {
			VentanaBancos ventana = null;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!bancos){
					ventana=new VentanaBancos("");
					ventana.setVisible(true);
					bancos=true;
				}
				else{
					ventana.toFront();
				}
				if(!ventana.isShowing()){
					bancos =false;
				}
			}
		});
		c.gridy=8;
		this.add(new JLabel("\n"),c);
		c.fill=GridBagConstraints.BOTH;
		c.weightx = 0.0;
		c.gridwidth = 4;
		c.gridx = 0;
		c.gridy =9;	
		guardar.setFont(new Font("Lantinghei SC", 0,15));
		this.add(guardar,c);
    }
    public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(logo2, this.getWidth()/2-logo2.getWidth(this)/2, this.getHeight()/15, logo2.getWidth(this), logo2.getHeight(this), this);
		g.setColor(new Color(128, 0, 0));
		g.fillRoundRect(10, this.getHeight()/15+logo2.getHeight(this)+20, this.getWidth()-20, this.getHeight()-(this.getHeight()/15+logo2.getHeight(this)+20)-20, 50, 50);
    }
}
