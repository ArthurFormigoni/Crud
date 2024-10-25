package org.example.teste.Servelts;


import org.example.teste.DAO.AdmDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "deletar_adm" ,value = "/deletar_adm")
public class DeletarAdm extends HttpServlet {
    // Método doPost que é chamado quando uma requisição POST é feita para "/deletar_adm"
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            // Obtém o parâmetro "id_adm" da requisição e converte para um inteiro (ID do administrador a ser deletado)
            int id = Integer.parseInt(request.getParameter("id_adm"));

            // Instancia o objeto AdmDAO para realizar operações no banco de dados
            AdmDAO adm2 = new AdmDAO();
            // Chama o método deleteAdm para deletar o administrador com o ID especificado
            adm2.deleteAdm(id);

            // Log para confirmação no console de que o registro foi deletado com sucesso
            System.out.println("Deletou o registro com o ID: " + id);

        } catch (Exception e) {
            // Log de erro e exibição da mensagem de exceção no console caso haja falha na exclusão
            e.printStackTrace();
            System.out.println("Erro ao deletar o registro: " + e.getMessage());
        }

        // Instancia um objeto Listar para obter a lista atualizada de administradores
        Listar mostra = new Listar();
        // A lista de administradores é adicionada como um atributo na requisição
        request.setAttribute("listaADM", mostra.listarAdm());

        // Define o tipo de conteúdo da resposta como HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Encaminha a requisição e resposta para a página JSP "crud_return_adm.jsp" que exibe o resultado
        request.getRequestDispatcher("Return_JSP/crud_return_adm.jsp").forward(request, response);
    }
}