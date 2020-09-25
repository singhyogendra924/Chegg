package in.maiddo.chegg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class AndroidTask extends AppCompatActivity {

    String lifecycle = "MainActivity:\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_task);
        TopFragment top = new TopFragment();
        BottomFragment bottomFragment = new BottomFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.topFragment, top,"topfragment").replace(R.id.bottomFragment, bottomFragment,"bottom").commit();

        lifecycle +=getResources().getString(R.string.onCreate);


        BottomFragment fragment = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.bottomFragment);
        if (fragment!=null)
        fragment.update(lifecycle);


    }

    @Override
    protected void onStart() {
        super.onStart();
        lifecycle +=getResources().getString(R.string.onStart);

        BottomFragment fragment = (BottomFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
        fragment.update(lifecycle);
    }

    @Override
    protected void onStop() {
        super.onStop();
        lifecycle +=getResources().getString(R.string.onStop);

        BottomFragment fragment = (BottomFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
        fragment.update(lifecycle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lifecycle +=getResources().getString(R.string.onDestroy);

        BottomFragment fragment = (BottomFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
        fragment.update(lifecycle);
    }

    @Override
    protected void onPause() {
        super.onPause();
        lifecycle +=getResources().getString(R.string.onPause);

        BottomFragment fragment = (BottomFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
        fragment.update(lifecycle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lifecycle +=getResources().getString(R.string.onResume);

        BottomFragment fragment = (BottomFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
        fragment.update(lifecycle);
    }
}