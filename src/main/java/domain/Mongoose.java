package domain;

public class Mongoose extends Predator {

    private String kind;

    public Mongoose(String name, int weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Mongoose() {
        this("Сobra killer",4,"just a mongoose");
    }
        

    public void Dig_a_hope() {
        System.out.println("mongoose is dig a hope...");
    }

    @Override
    public void hunt() {
        System.out.println("Mongoose hunting for a mouse,kobra,shake,insects...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Mongoose!";
    }

    @Override
    public void speak() {
        System.out.println("Hiss! Hiss!");
    }

    public void Communicate() {
        System.out.println("Hiss!Hiss! Let's go kill the cobra Hiss!Hiss....");
    }
    public void Climb() {
        System.out.println("mogoose climb");
    }
    public void Grop_in_pride() {
        System.out.println("mogoose grop in pride");
    }

    @Override
    public void eat() {
        System.out.println("mogoose eats everything is alive...");
    }
    
    
}
