package com.dannextech.apps.batterymonitorandmanager;

/**
 * Created by root on 2/23/18.
 */

public class MyModel {
    String app, percentage;

    public String getApp() {
        return app;
    }

    public String getPercentage() {
        return percentage;
    }

    public MyModel(String app, String percentage) {
        this.app = app;
        this.percentage = percentage;
    }
}
