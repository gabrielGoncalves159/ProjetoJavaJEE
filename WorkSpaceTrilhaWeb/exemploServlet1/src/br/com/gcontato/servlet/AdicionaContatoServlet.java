package br.com.gcontato.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AdicionaContatoServlet extends HttpServlet {
	
	private static final long serialVersionUID =1L;
	public AdicionaContatoServlet() {
		super();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("txtnome");
		String endereco = request.getParameter("txtendereco");
		String telefone = request.getParameter("txtfone");
		out.println("<h1>Dados do Formulário: </h1>");
		out.println("<h2>Nome: </h2>" + nome);
		out.println("<h2>Endereço: </h2>" + endereco);
		out.println("<h2>Telefone: </h2>" + telefone);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("txtnome");
		String endereco = request.getParameter("txtendereco");
		String telefone = request.getParameter("txtfone");
		out.println("<h1>Dados do Formulário: </h1>");
		out.println("<h2>Nome: </h2>" + nome);
		out.println("<h2>Endereço: </h2>" + endereco);
		out.println("<h2>Telefone: </h2>" + telefone);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
        PrintWriter out = response.getWriter();
        out.println("Método POST foi disparado!");
	}
}

// https://desenvolvimentoaberto.org/2014/10/13/servlet-entendendo-o-doget-e-dopost-java/#:~:text=Basicamente%20voc%C3%AA%20utiliza%20o%20m%C3%A9todo,inclu%C3%ADdos%20no%20corpo%20do%20comando.