//Importações  - Início

package org.example.teste.Listar;

import org.example.teste.Connection.Conexao;
import org.example.teste.Model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//Importações - Fim


//Classe - Início
public class Listar extends Conexao {

    // Métodos - Início
    public List listarUsuarioPremuim(){
        List<UsuariosPremium> listaUsuarios = new ArrayList<>();
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            PreparedStatement stmt = getConn().prepareStatement("select * from usuario join plano on plano.id_plano = usuario.fk_plano where fk_plano = 2");
            ResultSet rs = stmt.executeQuery();
            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");

            } else {
                System.out.println("Registros encontrados!");

            }

            // Processa os resultados do banco de dados e cria objetos UsuariosPremium
            while (rs.next()) {
                UsuariosPremium usuario = new UsuariosPremium();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setFk_ranking(rs.getInt("fk_ranking"));
                usuario.setFk_plano(rs.getInt("fk_plano"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setDt_nasc(rs.getDate("dt_nasc")); // Use java.sql.Date
                usuario.setNivel(rs.getInt("nivel"));
                usuario.setImagem_url(rs.getString("imagem_url"));
                usuario.setPontos(rs.getInt("pontos"));
                usuario.setDt_criacao(rs.getDate("dt_criacao")); // Use java.sql.Date

                listaUsuarios.add(usuario);
            }
            // Fecha os recursos do banco de dados
            rs.close();
            stmt.close();
            getConn().close();

        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    public List listarUsuario(){

        List<UsuariosPremium> listaUsuarios = new ArrayList<>();
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            PreparedStatement stmt = getConn().prepareStatement("select * from usuario join plano on plano.id_plano = usuario.fk_plano where fk_plano = 1");
            ResultSet rs = stmt.executeQuery();
            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");

            } else {
                System.out.println("Registros encontrados!");

            }

            // Processa os resultados do banco de dados e cria objetos UsuariosPremium
            while (rs.next()) {
                UsuariosPremium usuario = new UsuariosPremium();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setFk_ranking(rs.getInt("fk_ranking"));
                usuario.setFk_plano(rs.getInt("fk_plano"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setDt_nasc(rs.getDate("dt_nasc")); // Use java.sql.Date
                usuario.setNivel(rs.getInt("nivel"));
                usuario.setImagem_url(rs.getString("imagem_url"));
                usuario.setPontos(rs.getInt("pontos"));
                usuario.setDt_criacao(rs.getDate("dt_criacao")); // Use java.sql.Date

                listaUsuarios.add(usuario);
            }
            // Fecha os recursos do banco de dados
            rs.close();
            stmt.close();
            getConn().close();

        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }
    public UsuariosPremium listarUsuarioPremuimID(int id){
        UsuariosPremium usuarios = new UsuariosPremium();
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            PreparedStatement stmt = getConn().prepareStatement("select * from usuario join plano on plano.id_plano = usuario.fk_plano where fk_plano = 2 and id_usuario = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");

            } else {
                System.out.println("Registros encontrados!");

            }

            // Processa os resultados do banco de dados e cria objetos Adm_
            while (rs.next()) {
                usuarios.setId_usuario(rs.getInt("id_usuario"));
                usuarios.setFk_ranking(rs.getInt("fk_ranking"));
                usuarios.setFk_plano(rs.getInt("fk_plano"));
                usuarios.setNome(rs.getString("nome"));
                usuarios.setEmail(rs.getString("email"));
                usuarios.setSenha(rs.getString("senha"));
                usuarios.setDt_nasc(rs.getDate("dt_nasc")); // Use java.sql.Date
                usuarios.setNivel(rs.getInt("nivel"));
                usuarios.setImagem_url(rs.getString("imagem_url"));
                usuarios.setPontos(rs.getInt("pontos"));
                usuarios.setDt_criacao(rs.getDate("dt_criacao"));
                usuarios.setDt_validade(rs.getDate("dt_validade"));


            }
            // Fecha os recursos do banco de dados
            rs.close();
            stmt.close();
            getConn().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public List listarAdm(){
        List<Adm> listaADM = new ArrayList<>();
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            PreparedStatement stmt = getConn().prepareStatement("SELECT * FROM adm");
            ResultSet rs = stmt.executeQuery();

            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");

            } else {
                System.out.println("Registros encontrados!");

            }

            // Processa os resultados do banco de dados e cria objetos Adm_
            while (rs.next()) {
                Adm adm = new Adm();
                adm.setId_adm(rs.getInt("id_adm")); // Aqui está correto
                adm.setLogin(rs.getString("login")); // Aqui está correto
                adm.setSenha(rs.getString("senha")); // Aqui está correto
                adm.setNome(rs.getString("nome")); // Aqui está correto
                adm.setEmail(rs.getString("email")); // Aqui está correto
                adm.setData_nascimento(rs.getString("dt_nasc")); // Converte o Date para String
                adm.setImagem_url(rs.getString("imagem_url")); // Aqui está correto
                adm.setDt_criacao(rs.getString("dt_criacao")); // Converte o Date para String

                listaADM.add(adm);
            }
            // Fecha os recursos do banco de dados
            rs.close();
            stmt.close();
            getConn().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaADM;
    }
    public Powerup listarPoderPorId(int idPowerup) {
        Powerup poder = new Powerup();  // Inicializa como null para garantir que não haja valor retornado se o ID não for encontrado
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            PreparedStatement stmt = getConn().prepareStatement( "SELECT * FROM powerup WHERE id_powerup = ? AND is_deleted = false");// Usando um filtro pelo ID
            stmt.setInt(1, idPowerup);
            ResultSet rs = stmt.executeQuery();


            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado para o ID " + idPowerup);
            } else {
                System.out.println("Registro encontrado para o ID " + idPowerup);
                // Processa o resultado do banco de dados e cria o objeto Powerup
                if (rs.next()) {  // A consulta retornará no máximo um registro devido ao filtro pelo ID
                    poder.setId_powerup(rs.getInt("id_powerup"));
                    poder.setNome(rs.getString("nome"));
                    poder.setQuantidade(rs.getInt("quantidade"));
                    poder.setImagem_loja_url(rs.getString("imagem_loja_url"));
                    poder.setPreco_moedas(rs.getInt("preco_moedas"));
                    poder.setInitial_time(rs.getString("initial_time"));
                    poder.setDurucao(rs.getString("duracao"));
                    poder.setFinal_time(rs.getString("final_time"));
                }
            }

            // Fecha os recursos do banco de dados
            rs.close();
            stmt.close();
            getConn().close();

        } catch (SQLException sql) {
            sql.printStackTrace();
        }

        return poder;
    }

    public Adm listarAdmID(int id){
        Adm adm = new Adm();
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            PreparedStatement stmt = getConn().prepareStatement("SELECT * FROM adm where id_adm = ? ");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");

            } else {
                System.out.println("Registros encontrados!");

            }

            // Processa os resultados do banco de dados e cria objetos Adm_
            while (rs.next()) {
                adm.setId_adm(rs.getInt("id_adm")); // Aqui está correto
                adm.setLogin(rs.getString("login")); // Aqui está correto
                adm.setSenha(rs.getString("senha")); // Aqui está correto
                adm.setNome(rs.getString("nome")); // Aqui está correto
                adm.setEmail(rs.getString("email")); // Aqui está correto
                adm.setData_nascimento(rs.getString("dt_nasc")); // Converte o Date para String
                adm.setImagem_url(rs.getString("imagem_url")); // Aqui está correto
                adm.setDt_criacao(rs.getString("dt_criacao")); // Converte o Date para String


            }
            // Fecha os recursos do banco de dados
            rs.close();
            stmt.close();
            getConn().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adm;
    }
    public List listarPoderes(){
        List<Powerup> listaPoderes = new ArrayList<>();
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            String sql = "select * from powerup where is_deleted is false";  // Substitua com a sua tabela de usuários
            PreparedStatement stmt = getConn().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");
            } else {
                System.out.println("Registros encontrados!");
            }

            // Processa os resultados do banco de dados e cria objetos UsuariosPremium
            while (rs.next()) {
                Powerup poderes = new Powerup();
                poderes.setNome(rs.getString("nome"));
                poderes.setQuantidade(rs.getInt("quantidade"));
                poderes.setImagem_loja_url(rs.getString("imagem_loja_url"));
                poderes.setId_powerup(rs.getInt("id_powerup"));
                poderes.setPreco_moedas(rs.getInt("preco_moedas"));
                poderes.setInitial_time(rs.getString("initial_time"));
                poderes.setDurucao(rs.getString("duracao")); // Use java.sql.Date
                poderes.setFinal_time(rs.getString("final_time"));


                listaPoderes.add(poderes);
            }
            // Fecha os recursos do banco de dados
            rs.close();
            stmt.close();
            getConn().close();

        } catch (SQLException sql) {
            sql.printStackTrace();
        }
        return listaPoderes;
    }


    public List<Usuario_Moedas> listarMoedas() {
        List<Usuario_Moedas> listaMoedas = new ArrayList<>();
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            // Consulta SQL corrigida
            String sql = "SELECT usuario.id_usuario AS usuario_id, \n" +
                    "       usuario.nome AS nome_usuario, \n" +
                    "       moedas.id_moedas, \n" +
                    "       moedas.quantidade \n" +
                    "FROM usuario \n" +
                    "LEFT JOIN moedas ON usuario.id_usuario = moedas.fk_usuario \n" +
                    "ORDER BY usuario.id_usuario, moedas.id_moedas;";

            PreparedStatement pstmt = getConn().prepareStatement(sql);

            // Definir o parâmetro "?" na query



            ResultSet rs = pstmt.executeQuery();

            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");
            } else {
                System.out.println("Registros encontrados!");
            }

            // Processa os resultados do banco de dados e cria objetos Usuario_Moedas
            while (rs.next()) {
                Usuario_Moedas moedas = new Usuario_Moedas();
                moedas.setId_usuario(rs.getInt("usuario_id"));
                moedas.setNome(rs.getString("nome_usuario"));
                moedas.setId_moedas(rs.getInt("id_moedas"));
                moedas.setTotal_moedas(rs.getInt("quantidade"));

                listaMoedas.add(moedas);
            }

            // Fecha os recursos do banco de dados
            rs.close();
            pstmt.close();
            getConn().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaMoedas;
    }

    public Usuario_Moedas listarMoedasId(int id) {
        Usuario_Moedas moedas = new Usuario_Moedas();
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            // Consulta SQL corrigida
            String sql = "SELECT usuario.id_usuario AS usuario_id, usuario.nome AS nome_usuario, moedas.id_moedas,moedas.quantidade FROM usuario LEFT JOIN moedas ON usuario.id_usuario = moedas.fk_usuario where usuario.id_usuario = ? ORDER BY usuario.id_usuario, moedas.id_moedas ;";

            PreparedStatement pstmt = getConn().prepareStatement(sql);
            pstmt.setInt(1, id);

            // Definir o parâmetro "?" na query



            ResultSet rs = pstmt.executeQuery();

            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");
            } else {
                System.out.println("Registros encontrados!");
            }

            // Processa os resultados do banco de dados e cria objetos Usuario_Moedas
            while (rs.next()) {
                moedas.setId_usuario(rs.getInt("usuario_id"));
                moedas.setNome(rs.getString("nome_usuario"));
                moedas.setId_moedas(rs.getInt("id_moedas"));
                moedas.setTotal_moedas(rs.getInt("quantidade"));

            }

            // Fecha os recursos do banco de dados
            rs.close();
            pstmt.close();
            getConn().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return moedas;
    }
}//Métodos e Classe - Fim

