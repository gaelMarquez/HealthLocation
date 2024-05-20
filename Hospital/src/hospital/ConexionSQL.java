package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLServer {

    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=TU_BASE_DE_DATOS";
    private static final String USUARIO = "TU_USUARIO";
    private static final String CONTRASENA = "TU_CONTRASENA";

    public static Connection conectar() {
        try {
            // Cargar el controlador JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            return conexion;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
