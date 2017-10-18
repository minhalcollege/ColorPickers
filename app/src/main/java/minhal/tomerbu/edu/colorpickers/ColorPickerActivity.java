package minhal.tomerbu.edu.colorpickers;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class ColorPickerActivity extends AppCompatActivity {
    SeekBar sbRed, sbGreen, sbBlue; //Null
    //properties:    //Views
    Button myBtnTst;
    EditText etRed, etGreen, etBlue;//Also Null
    TextView tvResult;
    //Statements (No method calls (Except for new Init)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker);        //Choose the xml file to inflate (Load)
        tvResult = (TextView) findViewById(R.id.tvResult);
        myBtnTst = (Button) findViewById(R.id.btnToast);
        etRed = (EditText) findViewById(R.id.etRed);
        etGreen = (EditText) findViewById(R.id.etGreen);
        etBlue = (EditText) findViewById(R.id.etBlue);
        sbRed = (SeekBar) findViewById(R.id.sbRed);
        sbGreen = (SeekBar) findViewById(R.id.sbGreen);
        sbBlue = (SeekBar) findViewById(R.id.sbBlue);
        myBtnTst.setOnClickListener(new View.OnClickListener() {        //after find view by id we can work:
            @Override
            public void onClick(View view) {
                int redProgress = sbRed.getProgress(); //123
                etRed.setText(String.valueOf(redProgress));

                int greenProgress = sbGreen.getProgress();
                etGreen.setText(String.valueOf(greenProgress)); //129

                int blueProgress = sbBlue.getProgress();
                etBlue.setText(String.valueOf(blueProgress)); //0

                int totalColor = Color.rgb(redProgress, greenProgress, blueProgress);
                tvResult.setBackgroundColor(totalColor);

                String hexColor = Integer.toHexString(totalColor);
                tvResult.setText(String.format("#%s", hexColor.toUpperCase()));

                //
            }
        });
    }
}
