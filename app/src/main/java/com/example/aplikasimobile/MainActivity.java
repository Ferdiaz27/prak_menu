import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplikasimobile.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menghubungkan tombol dengan ID dari XML layout
        Button myButton = findViewById(R.id.tombol);

        // Menambahkan aksi klik pada tombol
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi yang akan dilakukan saat tombol diklik
                // Misalnya, tampilkan pesan toast
                Toast.makeText(MainActivity.this, "Tombol diklik!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
