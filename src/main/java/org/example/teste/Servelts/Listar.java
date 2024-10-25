//Importações  - Início

package org.example.teste.Servelts;

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
            PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM usuario");
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
            getConnection().close();

        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    public List listarAdm(){
        List<Adm_> listaADM = new ArrayList<>();
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM adm");
            ResultSet rs = stmt.executeQuery();

            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");

            } else {
                System.out.println("Registros encontrados!");

            }

            // Processa os resultados do banco de dados e cria objetos Adm_
            while (rs.next()) {
                Adm_ adm = new Adm_();
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
            getConnection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaADM;
    }

    public Adm_ listarAdmID(int id){
        Adm_ adm = new Adm_();
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            conectar();
            PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM adm where id_adm = ? ");
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
            getConnection().close();

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
            String sql = "select * from powerup";  // Substitua com a sua tabela de usuários
            PreparedStatement stmt = getConnection().prepareStatement(sql);
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
            getConnection().close();

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
            String sql = "SELECT usuario.id_usuario AS usuario_id, " +
                    "usuario.nome AS nome_usuario, " +
                    "SUM(moedas.quantidade) AS total_moedas " +
                    "FROM usuario " +
                    "LEFT JOIN moedas ON usuario.id_usuario = moedas.fk_usuario " +
                    // Defina o valor desse parâmetro no pstmt
                    "GROUP BY usuario.id_usuario, usuario.nome";

            PreparedStatement pstmt = getConnection().prepareStatement(sql);

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
                moedas.setTotal_moedas(rs.getInt("total_moedas"));

                listaMoedas.add(moedas);
            }

            // Fecha os recursos do banco de dados
            rs.close();
            pstmt.close();
            getConnection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaMoedas;
    }
}//Métodos e Classe - Fim

