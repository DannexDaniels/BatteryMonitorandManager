package com.dannextech.apps.batterymonitorandmanager;

import android.app.ActivityManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RunningTasks extends AppCompatActivity {

    private static final String TAG = "TRIAL";
    ListView listView;

    List<ActivityManager.RunningAppProcessInfo> processes;
    ActivityManager amg;

    int load = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_tasks);

        listView = findViewById(R.id.lvRunningTasks);


        ArrayList<MyModel> objects = new ArrayList<MyModel>();
        objects.add(new MyModel("System","34%"));
        objects.add(new MyModel("App Lock","8%"));
        objects.add(new MyModel("Instagram","6%"));
        objects.add(new MyModel("Facebook","5%"));
        objects.add(new MyModel("Twitter","2%"));
        objects.add(new MyModel("Whatsapp","29%"));
        objects.add(new MyModel("Videos","11%"));
        objects.add(new MyModel("Music","18%"));

        listView.setAdapter(new MyAdapter(this,objects));

    }
}
