import java.rmi.Naming;

import javax.swing.JOptionPane;

public class Cliente {

	public static void main(String[] args) {
		
		try {
			
			Mensagem_IF obj = (Mensagem_IF) Naming.lookup("rmi://localhost/servidormsg");
			
			while(true) {
				String m = JOptionPane.showInputDialog("Digite uma mensagem para o Servidor: " );
				obj.setMensagem(m);
				
				JOptionPane.showMessageDialog(null, obj.getMensagem());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
