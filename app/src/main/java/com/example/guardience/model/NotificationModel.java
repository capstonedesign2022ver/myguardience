package com.example.guardience.model;

import android.app.Notification;

import java.util.Date;

public class NotificationModel {
    public String dest;
    public Notification notification = new Notification();
    public Data data = new Data();
    public static class Notification{
        public String title;
        public String body;
    }
    public static class Data{
        public String title;
        public String body;
    }
}
