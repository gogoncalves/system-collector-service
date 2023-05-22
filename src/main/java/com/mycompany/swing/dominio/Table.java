package com.mycompany.swing.dominio;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;

public class Table {
    public static boolean isTableEmpty(Connection connection, String tableName) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String query = "SELECT COUNT(*) FROM " + tableName;
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            int count = resultSet.getInt(1);
            return count == 0;
        }
    }

    public static boolean notebookExistsForUser(Connection connection, int userId) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("SELECT COUNT(*) FROM notebook WHERE fkUsuario = ?")) {
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            return count > 0;
        }
    }

    public static boolean notebookExistsForUserSqlServer(JdbcTemplate jdbcTemplate, int userId) {
        String sql = "SELECT COUNT(*) FROM notebook WHERE fkUsuario = ?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, userId);
        return count != null && count > 0;
    }

}
