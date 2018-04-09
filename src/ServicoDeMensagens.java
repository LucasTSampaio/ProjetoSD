import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicoDeMensagens extends UnicastRemoteObject implements Mensagem_IF{

	private String mensagem = "Não há nenhuma mensagem";
	public ServicoDeMensagens() throws RemoteException{}
	@Override
	public String getMensagem() throws RemoteException {
		System.out.println("Chamou o método GET: " +this.mensagem);
		return mensagem;
	}
	@Override
	public void setMensagem(String mensagem) throws RemoteException {
		System.out.println("Chamou o método SET: " + this.mensagem);
		this.mensagem = mensagem;
	}
	
	
	
}
