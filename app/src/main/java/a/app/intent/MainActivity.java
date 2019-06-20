package a.app.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
         Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:98900768"));
        startActivity(i);
        }
      });

b2.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick(View v)
        {
        String url="https://www.google.com";
        Intent in=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        startActivity(in);}
    });

    }
}