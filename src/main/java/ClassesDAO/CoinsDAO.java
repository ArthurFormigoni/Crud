package ClassesDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoinsDAO {

        private Connection conn;
        private PreparedStatement pstmt;
        private ResultSet rs;

        public boolean conectar() {

            try {
                Class.forName("org.postgresql.Driver");

                conn = DriverManager.getConnection("jdbc:postgresql://pg-23037034-germinare-1db6.f.aivencloud.com:27088/dbDelfis?ssl=require&user=avnadmin&password=AVNS_IUFw8-OfVH7bf8zuL_l", "avnadmin", "AVNS_IUFw8-OfVH7bf8zuL_l");

            } catch (SQLException sqle) {
                sqle.printStackTrace();
                return false;
            } catch (ClassNotFoundException cnfe) {
                cnfe.printStackTrace();
                return false;
            }
            return true;
        }

        public void desconectar() {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                System.out.println(sqle.getMessage());
            }
        }

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
        public boolean update(String sql) {
            conectar();
            try {
                pstmt = conn.prepareStatement(sql);

                pstmt.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
            desconectar();
            return true;
        }

        //CRUD: D = DELETE - DELETE
        public boolean delete(String sql) {
            try {
                conectar();

                pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
            desconectar();
            return true;
        }

}

