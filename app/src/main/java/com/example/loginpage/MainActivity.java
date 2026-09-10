package com.example.loginpage;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private static final String DEMO_USERNAME = "admin";
    private static final String DEMO_PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextInputLayout usernameLayout = findViewById(R.id.usernameLayout);
        TextInputLayout passwordLayout = findViewById(R.id.passwordLayout);
        TextInputEditText username = findViewById(R.id.username);
        TextInputEditText password = findViewById(R.id.password);
        MaterialButton loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            String enteredUsername = getText(username);
            String enteredPassword = getText(password);

            usernameLayout.setError(null);
            passwordLayout.setError(null);

            boolean valid = true;

            if (enteredUsername.isEmpty()) {
                usernameLayout.setError("Username is required");
                valid = false;
            }

            if (enteredPassword.isEmpty()) {
                passwordLayout.setError("Password is required");
                valid = false;
            }

            if (!valid) {
                return;
            }

            if (DEMO_USERNAME.equals(enteredUsername)
                    && DEMO_PASSWORD.equals(enteredPassword)) {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
            } else {
                passwordLayout.setError("Invalid username or password");
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private String getText(TextInputEditText field) {
        return field.getText() == null ? "" : field.getText().toString().trim();
    }
}
