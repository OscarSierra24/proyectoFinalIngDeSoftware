import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import jxl.Workbook;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

@SuppressWarnings("serial")
public class PanelBancos extends JPanel{
	JRadioButton santander = new JRadioButton();
	JRadioButton hsbc = new JRadioButton();
	JLabel Santander,Hsbc;
	JButton generar;
	Cliente cliente;
	Banco[] banco;
	
	public PanelBancos(Cliente cliente) {
		this.banco=new Banco[2];
		this.cliente=cliente;
		this.setPreferredSize(new Dimension(500,300)); 
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		this.setBackground(new Color(128,0,0));
		Santander=new JLabel();
		Hsbc=new JLabel();
		Santander.setIcon(new ImageIcon("santander.png"));
		Hsbc.setIcon(new ImageIcon("hsbc.png"));
		c.ipadx=20;
		c.gridy=0;
		this.add(Santander,c);
		this.add(santander,c);
		c.ipadx=20;
		this.add(Hsbc,c);
		this.add(hsbc,c);
		Santander.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				mouseClicked(e);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(santander.isSelected()){
					santander.setSelected(false);
				}else{
					santander.setSelected(true);
				}
			}
		});
		Hsbc.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				mouseClicked(e);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(hsbc.isSelected()){
					hsbc.setSelected(false);
				}else{
					hsbc.setSelected(true);
				}
				
			}
		});
		generar=new JButton("Generar");
		c.gridy=1;
		generar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//creates the workbook here
				try {
					if(PanelBancos.this.santander.isSelected()){
							PanelBancos.this.banco[0]=new Banco("Santander");
					}
					if(hsbc.isSelected()){
						PanelBancos.this.banco[1]=new Banco("HSBCFile");
					}
					for(int i=0;i<PanelBancos.this.banco.length;i++){
						if(PanelBancos.this.banco[i]!=null){
							PanelBancos.this.banco[i].setCliente(PanelBancos.this.cliente);
							PanelBancos.this.banco[i].writeXls();
						}
					}
				}
				catch (IOException | WriteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
				}
			}
		});
		this.add(generar,c);
	}
	
	public void getCliente(Cliente cliente){
		this.cliente=cliente;
	}
}
