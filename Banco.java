import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Banco {
	String bankName;
	Cliente cliente;
	WritableWorkbook wworkBook;
	
	public Banco(String bankName) throws IOException{
		this.bankName=bankName;
		this.wworkBook=Workbook.createWorkbook(new File(bankName+".xls"));
	}
	
	public String getBankName(){
		return this.bankName;
	}
	public void setCliente(Cliente cliente){
		this.cliente=cliente;
	}
	public void writeXls() throws IOException, WriteException{
		//creates sheet
		WritableSheet wsheet=wworkBook.createSheet(this.bankName,0);
		Label[] label=new Label[15];
		//cliente
		label[0]=new Label(0,2,"Cliente: ");
		label[1]=new Label(0,3,this.cliente.getNombre());
		
		//atendido por
		label[2]=new Label(1,2,"Atendido por:");
		label[3]=new Label(1,3,this.cliente.getAtendidoPor());
		
		//Valor de la vivienda
		label[4]=new Label(0,6,"Valor de la vivienda");
		label[5]=new Label(0,7,this.cliente.getValorVivienda()+"");
		
		//Valor destructible
		label[6]=new Label(0,8,"Valor destructible");
		label[7]=new Label(0,9,this.cliente.getValorDestructible()+"");
		
		//Porcentaje deseado
		label[8]=new Label(0,10,"Porcentaje deseado");
		label[9]=new Label(0,11,this.cliente.getPorcentajeDeseado()+"");
		
		//etc...
		
		label[10]=new Label(9,0,"Resultados del Banco:");
		label[11]=new Label(9,1,"Porcentaje ofrecido:");
		label[12]=new Label(9,2,"15%");
		
		for(int i=0;i<label.length;i++){
			if(label[i]!=null){
				wsheet.addCell(label[i]);				
			}
		}
		
		wworkBook.write();
		wworkBook.close();
	}
}
