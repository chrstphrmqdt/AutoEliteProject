package com.example.autoeliteproject;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {
    // Simulated user database (replace with your actual database interactions)
    private final Map<String, String> userDatabase = new HashMap<>();

    public AuthenticationService() {
        // Initialize the user database with sample user credentials (username, password)
        userDatabase.put("user1", "password1");
        userDatabase.put("user2", "password2");
    }

    public boolean authenticate(String username, String password) {
        // Check if the username exists in the database
        if (!userDatabase.containsKey(username)) {
            return false; // Username doesn't exist
        }

        try {
            // Get the stored password for the username
            String storedPassword = userDatabase.get(username);

            // Check if the provided password matches the stored password
            if (storedPassword != null && storedPassword.equals(password)) {
                return true; // Authentication successful
            }
        } catch (NullPointerException e) {
            // Handle unexpected null values or errors
            e.printStackTrace();
        }

        return false; // Authentication failed
    }
}
