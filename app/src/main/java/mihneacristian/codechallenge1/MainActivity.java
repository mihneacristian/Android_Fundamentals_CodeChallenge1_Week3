package mihneacristian.codechallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText emailAddressEditText;
    private EditText phoneNumberEditText;
    private CheckBox termsCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailAddressEditText = findViewById(R.id.emailAddressEditText);
        phoneNumberEditText = findViewById(R.id.phoneEditText);
        termsCheckBox = findViewById(R.id.termsCheckBox);
    }

    public void loginOnClick(View view) {

        String email = emailAddressEditText.getText().toString();
        String phone = phoneNumberEditText.getText().toString();

        if (email.isEmpty()) {
            emailAddressEditText.setError("Please fill the email address");
        }
        if (phone.isEmpty()) {
            phoneNumberEditText.setError("Please enter the phone number");
        }
        if (termsCheckBox.isChecked() == false) {
            Toast.makeText(this, "Please accept Terms and Conditions", Toast.LENGTH_LONG).show();
        }

        if (!email.isEmpty() && !phone.isEmpty() && termsCheckBox.isChecked()) {
            Toast.makeText(this, email + " " + phone, Toast.LENGTH_LONG).show();
        }
    }
}
