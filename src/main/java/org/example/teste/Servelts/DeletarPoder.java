package org.example.teste.Servelts;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.teste.DAO.PowerupDAO;
import org.example.teste.Listar.Listar;

@WebServlet(name = "deletar_poder", value = "/deletar_poder")
public class DeletarPoder extends HttpServlet {

    // Método que lida com requisições POST para deletar um administrador
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            // Captura o ID do administrador enviado no request e tenta deletá-lo do banco de dados
            int id = Integer.parseInt(request.getParameter("id_powerup"));
            PowerupDAO pdao = new PowerupDAO();
            pdao.delete(id);
            System.out.println("Deletou o registro com o ID: " + id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar o registro: " + e.getMessage());
        }

        // Após deletar, prepara e redireciona para uma página com a lista atualizada de administradores
        Listar mostra = new Listar();
        request.setAttribute("listaPoderes", mostra.listarPoderes());
        response.setContentType("text/html");
        request.getRequestDispatcher("Return_JSP/crud_return_poderes.jsp").forward(request, response);
    }
}