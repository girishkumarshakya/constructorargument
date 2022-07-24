package core.car.java;

import java.beans.ConstructorProperties;

public class Arguments {
    private String message;
    private String email;
    private int age;



    @Override
    public String toString() {
        return "Arguments{" +
                "message='" + message + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @ConstructorProperties({"message","email","age"})
    public Arguments(String message, String email, int age) {
        this.message = message;
        this.email = email;
        this.age = age;
    }
}
