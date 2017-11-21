import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaBancos extends JFrame{
	public VentanaBancos(String bancos){
		super("Bancos");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.add(new PanelBancos(""));
		this.pack();
		this.setVisible(true);
	}
}
