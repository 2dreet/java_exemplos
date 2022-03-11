package bancoDadosRelacional;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexaoJDBC {

    public Connection getConexao() throws SQLException {
        Properties properties = this.getPropiedadeConexao();
        String url = "jdbc:mysql://" + properties.getProperty("db.host")
                + "?verifyServerCertificate=fase"
                +"&useSSL=true";

        final String usuario = properties.getProperty("db.user");
        final String senha = properties.getProperty("db.password");

        return DriverManager.getConnection(url, usuario, senha);
    }

    private Properties getPropiedadeConexao() {
        Properties properties = new Properties();
        try {
            properties.load(FabricaConexaoJDBC.class.getResourceAsStream("/config.ini"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
