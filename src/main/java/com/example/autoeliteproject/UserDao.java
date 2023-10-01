package com.example.autoeliteproject;

import java.sql.*;

public class UserDao {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/autoelite";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public boolean createUser(User user) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO users (username, password, email, first_name, last_name, phone_number, address) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, user.getUsername());
                preparedStatement.setString(2, user.getPassword());
                preparedStatement.setString(3, user.getEmail());
                preparedStatement.setString(4, user.getFirstName());
                preparedStatement.setString(5, user.getLastName());
                preparedStatement.setString(6, user.getPhoneNumber());
                preparedStatement.setString(7, user.getAddress());

                int rowsInserted = preparedStatement.executeUpdate();

                return rowsInserted > 0; // If one or more rows were inserted, return true
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Handle the exception appropriately, e.g., log it or show an error message
        }
    }
    public User getUserByUsername(String username) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM users WHERE username = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        int userId = resultSet.getInt("user_id");
                        String password = resultSet.getString("password");
                        String email = resultSet.getString("email");
                        String firstName = resultSet.getString("first_name");
                        String lastName = resultSet.getString("last_name");
                        String phoneNumber = resultSet.getString("phone_number");
                        String address = resultSet.getString("address");

                        // Create and return a User object
                        return new User(userId, username, password, email, firstName, lastName, phoneNumber, address);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; // Return null if no user was found or an error occurred
    }

}
