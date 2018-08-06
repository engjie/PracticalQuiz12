package sg.edu.rp.c346.practicalquiz12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spncat;
    WebView wvMySelection;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spncat = findViewById(R.id.spinnerCategory);

        wvMySelection=findViewById(R.id.webViewMyPage);

        spncat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        wvMySelection.loadUrl("https://www.google.com");
                        break;
                    case 1:
                        wvMySelection.loadUrl("https://www.rp.edu.sg/");
                        break;

                }
            }


        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    });
}
}






