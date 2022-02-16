package test;

import domain.Mongoose;

public class TestAnimal {

    public static void main(String[] args) {
        Mongoose mongoose = new Mongoose("Alex",8,"Reddish mongoose");
        System.out.println(mongoose);
        mongoose.hunt();
        mongoose.eat();
        mongoose.speak();
        mongoose.Communicate();
        mongoose.Climb();
        mongoose.Grop_in_pride();
        mongoose.Dig_a_hope();
    }
}
