package edu.orangecoastcollege.cs273.mpaulding.hellogoodbye;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView greetingTextView;
    private boolean isHelloDisplayed = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Step 1: Inflate the main screen layout used by the app and restore any saved state
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Establish references to the widgets needed in the source code
        greetingTextView = (TextView) findViewById(R.id.greetingTextView);

        initializeGreeting();

        Button exclamationButton = (Button) findViewById(R.id.button);

        if (exclamationButton != null) {
            exclamationButton.setOnClickListener(toggleGreeting);
        }
    }

private final View.OnClickListener toggleGreeting = new View.OnClickListener() {

    public void onClick(View button)
    {
        if (isHelloDisplayed) {
            greetingTextView.setText(R.string.goodbye);
            isHelloDisplayed = false;
        }
        else {
            greetingTextView.setText(R.string.hello);
            isHelloDisplayed = true;
        }
    }
};
    private void initializeGreeting() {
        isHelloDisplayed = true;
    }
}
