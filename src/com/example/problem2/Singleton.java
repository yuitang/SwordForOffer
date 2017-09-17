package com.example.problem2;

public class Singleton {
//    private static Singleton instance = null;

    private Singleton() {
    }

    private static final Singleton SINGLETON = new Singleton();

    public static Singleton getInstance(){
        return SINGLETON;
    }

//    private static class SingletonHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//
//    public static Singleton getInstance(){
//        return SingletonHolder.INSTANCE;
//    }

//    public static Singleton getInstance(){
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s2 = s;
        Singleton s3 = Singleton.getInstance();
        System.out.println(s == s2);
        System.out.println(s == s3);
    }
}
