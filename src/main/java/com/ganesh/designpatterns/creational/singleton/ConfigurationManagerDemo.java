package com.ganesh.designpatterns.creational.singleton;
class ConfigurationManager{
    private static final ConfigurationManager instance = new ConfigurationManager();
    public ConfigurationManager(){
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }

    private String ApplicationDetails ="port123";
    private String DataBase = "dataBase";
    public String getApplicationDetails(){
        return ApplicationDetails;
    }
    public String getDataBase(){
        return DataBase;
    }


}
public class ConfigurationManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager obj1 = ConfigurationManager.getInstance();
        ConfigurationManager obj2 = ConfigurationManager.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.getApplicationDetails());
        System.out.println(obj2.getApplicationDetails());
    }
}
