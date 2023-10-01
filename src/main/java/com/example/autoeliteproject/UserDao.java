package com.example.autoeliteproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

        return null;
    }

    public List<String> getAllCarMakes() {
        List<String> carMakes = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT DISTINCT make_name FROM cardetails";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String make = resultSet.getString("make_name");
                        carMakes.add(make);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carMakes;
    }

    public List<String> getCarModelsByMake(String make) {
        List<String> carModels = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT DISTINCT model_name FROM cardetails WHERE make_name = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, make);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String model = resultSet.getString("model_name");
                        carModels.add(model);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carModels;
    }

    public List<String> getYearsByMake(String make) {
        List<String> carYears = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT DISTINCT year FROM cardetails WHERE make_name = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, make);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String year = resultSet.getString("year");
                        carYears.add(year);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carYears;
    }

    public List<String> getConditionsByMake(String make) {
        List<String> carConditions = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT DISTINCT condition_name FROM cardetails WHERE make_name = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, make);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String condition = resultSet.getString("condition_name");
                        carConditions.add(condition);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carConditions;
    }

    public List<String> getBodyTypesByMake(String make) {
        List<String> carBodyTypes = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT DISTINCT body_type_name FROM cardetails WHERE make_name = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, make);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String bodyType = resultSet.getString("body_type_name");
                        carBodyTypes.add(bodyType);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carBodyTypes;
    }

    public List<String> getTransmissionsByMake(String make) {
        List<String> carTransmissions = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT DISTINCT transmission_name FROM cardetails WHERE make_name = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, make);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String transmission = resultSet.getString("transmission_name");
                        carTransmissions.add(transmission);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carTransmissions;
    }






}

