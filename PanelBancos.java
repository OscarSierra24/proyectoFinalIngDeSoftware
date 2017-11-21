import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class PanelBancos extends JPanel{
	JRadioButton santander = new JRadioButton();
	JRadioButton hsbc = new JRadioButton();
	JLabel Santander,Hsbc;
	JButton generar;
	public PanelBancos(String bancos) {
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
				System.out.println(santander.isSelected());
				System.out.println(hsbc.isSelected());
			}
		});
		this.add(generar,c);
	}
	
}
