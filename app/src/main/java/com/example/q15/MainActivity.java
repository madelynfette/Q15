package com.example.q15;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;

public class MainActivity extends AppCompatActivity {

    private TextView callInfoTextView;
    String phoneNumber;
    private CallReciever callReceiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callInfoTextView = findViewById(R.id.callinfoTV);
        phoneNumber = getIntent().getStringExtra("number");


    }

    public void showNumber(View v){
        callInfoTextView.setText(phoneNumber);
    }
}

