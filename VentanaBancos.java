import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaBancos extends JFrame{
	public VentanaBancos(Cliente cliente){
		super("Bancos");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.add(new PanelBancos(cliente));
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
