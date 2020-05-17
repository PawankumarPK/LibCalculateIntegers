package ai.handypawan.libcalculateintegers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import ai.handypawan.myutils.CalculateIntegers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int sum = (int) CalculateIntegers.division(80,40);
        Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();

    }
}
