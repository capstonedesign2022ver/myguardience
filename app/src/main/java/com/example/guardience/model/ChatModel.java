package com.example.guardience.model;

import java.util.HashMap;
import java.util.Map;

public class ChatModel {
    public Map<String,String> users = new HashMap<>();
    public Map<String,String> messages = new HashMap<>();

    public static class Message{
        public String uid;
        public String msg;
        public String msgtype;
        public Object timestamp;
        public Map<String, Object> readUsers = new HashMap<>();
    }
    public static class FileInfo{
        public String filename;
        public String filesize;
    }
}
