package com.qoobico.getparty;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import static com.qoobico.getparty.R.menu.menu;

/**
 * Created by George Omega on 07.01.2018.
 */

public class MainActivity extends AppCompatActivity {
    private static final int LAYOUT=R.layout.activity_main;

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initToolbar();
        initNavigationView();
    }

    private void initNavigationView()
    {
        drawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);


    };
    private void initToolbar()
    {
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });
        toolbar.inflateMenu(menu);
    }
}
