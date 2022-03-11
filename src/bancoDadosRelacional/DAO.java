package bancoDadosRelacional;

import java.sql.*;

public class DAO extends FabricaConexaoJDBC{

    // aqui o Object ... vai receber um array
    public int inserir(String sql, Object ... atributos) {
        // aqui o RETURN_GENERATED_KEYS vai retornar os ids gerados
        Connection connection = null;
        try {
            connection = this.getConexao();

            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            adicionarAtributos(preparedStatement, atributos);

            // aqui executamos e verificamos se teve sucesso
            if (preparedStatement.executeUpdate() > 0) {
                // aqui retornamos o id gerado
                ResultSet idResult = preparedStatement.getGeneratedKeys();
                if (idResult.next()) {
                    return idResult.getInt(1);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {

            }
        }

        return 0;
    }

    private void adicionarAtributos(PreparedStatement preparedStatement, Object[] atributos) throws SQLException {
        for (int i = 0; i < atributos.length; i++) {
            preparedStatement.setObject(i + 1, atributos[i]);
        }
    }

}
