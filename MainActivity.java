package com.example.forassignmentonly;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   Button swapinputbutton, checkinputbutton;
    EditText FirstContent, SecondContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            checkinputbutton = findViewById(R.id.checkinput);
            checkinputbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String firstText = FirstContent.getText().toString();
                    String secondText = SecondContent.getText().toString();

                    Intent intent = new Intent(MainActivity.this, CheckerActivity.class);
                    intent.putExtra("firstContent", firstText);
                    intent.putExtra("secondContent", secondText);

                    startActivity(intent);
                }
            });

            FirstContent =findViewById(R.id.FirstContent);
            SecondContent = findViewById(R.id.SecondContent);
            swapinputbutton =findViewById(R.id.swapinput);

            swapinputbutton.setOnClickListener(new View.OnClickListener(){

                public void onClick(View view){
                   String getterforsecond = FirstContent.getText().toString();
                   FirstContent.setText(SecondContent.getText().toString());
                   SecondContent.setText(getterforsecond);
                }
            });

    }



}