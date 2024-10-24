package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

    public class UsuariosPremuimDAO extends Conexao {

        private Connection conn;
        private PreparedStatement pstmt;




        //CRUD: C = CREATE - INSERT
        public boolean insert(String sql) {
            conectar();
            try {
                pstmt = conn.prepareStatement(sql);
                pstmt.execute();
            } catch (SQLException sqe) {
                sqe.printStackTrace();
                return false;
            }
            desconectar();
            return true;
        }

        //CRUD: R = READ - SELECT
        public ResultSet select(String sql) {
            conectar();
            ResultSet rset = null;
            try {

                pstmt = conn.prepareStatement(sql);
                rset = pstmt.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            desconectar();
            return rset;
        }

        //CRUD: U = UPDATE - UPDATE
        public boolean AddPremiumUser(int userId) {
            try {
                conectar();
                pstmt = getConn().prepareStatement("update usuario set fk_plano = 2 where id_usuario = ?");
                pstmt.setInt(1, userId);
                pstmt.execute();
            }catch (Exception e){
                e.printStackTrace();
                desconectar();
                return false;
            }
            desconectar();
            return true;
        }

        //CRUD: D = DELETE - DELETE
        public boolean delete(int userId) {
            try {
                conectar();
                pstmt = getConn().prepareStatement("update usuario set fk_plano = 1 where id_usuario = ?");
                pstmt.setInt(1, userId);
                pstmt.execute();
            }catch (Exception e){
                e.printStackTrace();
                desconectar();
                return false;
            }
            desconectar();
            return true;

        }
        public boolean deleteUser(int userId) {
            try {
                conectar();
                pstmt = getConn().prepareStatement("update usuario set fk_plano = 1\n" +
                        "where id_usuario = ?");
                pstmt.setInt(1, userId);
                pstmt.execute();
            }catch (Exception e){
                e.printStackTrace();
                desconectar();
                return false;
            }
            desconectar();
            return true;
        }

        public boolean listarUsuarios(int userId) {
            try {
                conectar();
                pstmt = getConn().prepareStatement("select * from adm = ?")  ;
                pstmt.setInt(1, userId);
                pstmt.execute();
            }catch (Exception e){
                e.printStackTrace();
                desconectar();
                return false;
            }
            desconectar();
            return true;
        }
    }

