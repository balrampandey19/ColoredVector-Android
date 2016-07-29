package co.coloredvector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import co.library.DrawableHelper;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imageView=(ImageView)findViewById(R.id.image);
        imageView2=(ImageView)findViewById(R.id.image2);

        imageView3=(ImageView)findViewById(R.id.image3);

        imageView4=(ImageView)findViewById(R.id.image4);

        imageView5=(ImageView)findViewById(R.id.image5);

        imageView6=(ImageView)findViewById(R.id.image6);

        imageView7=(ImageView)findViewById(R.id.image7);

        imageView8=(ImageView)findViewById(R.id.image8);

        DrawableHelper
                .withContext(this)
                .withColor(R.color.colorAccent)
                .withDrawable(R.drawable.placeholder)
                .tint()
                .applyTo(imageView);

        DrawableHelper
                .withContext(this)
                .withColor(R.color.maroon)
                .withDrawable(R.drawable.placeholder)
                .tint()
                .applyTo(imageView2);

        DrawableHelper
                .withContext(this)
                .withColor(R.color.purple)
                .withDrawable(R.drawable.placeholder)
                .tint()
                .applyTo(imageView3);

        DrawableHelper
                .withContext(this)
                .withColor(R.color.olive)
                .withDrawable(R.drawable.placeholder)
                .tint()
                .applyTo(imageView4);

        DrawableHelper
                .withContext(this)
                .withColor(R.color.gray)
                .withDrawable(R.drawable.placeholder)
                .tint()
                .applyTo(imageView5);

        DrawableHelper
                .withContext(this)
                .withColor(R.color.silver)
                .withDrawable(R.drawable.placeholder)
                .tint()
                .applyTo(imageView);

        DrawableHelper
                .withContext(this)
                .withColor(R.color.red)
                .withDrawable(R.drawable.placeholder)
                .tint()
                .applyTo(imageView6);

        DrawableHelper
                .withContext(this)
                .withColor(R.color.fuchsia)
                .withDrawable(R.drawable.placeholder)
                .tint()
                .applyTo(imageView7);

        DrawableHelper
                .withContext(this)
                .withColor(R.color.yellow)
                .withDrawable(R.drawable.placeholder)
                .tint()
                .applyTo(imageView8);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
