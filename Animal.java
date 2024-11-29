package Demo;

class Animal {
    void eat(){
        System.out.println("This is an generic animal");
    }
}

class Tiger extends Animal{
    //eat is part of tiger class
    void TigerFood(){
        System.out.println("This is an Tiger and It will eat meat ");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        //Can I access the eat method of Animal by using the tiger object
       // tiger.eat();
         tiger.TigerFood();
    }
}

class Lion extends Animal{
    void Lionfood(){
        System.out.println("This is an lion and it will eats Flush food");
    }

    public static void main(String[] args) {
        Lion tigerCubs = new Lion();
        tigerCubs.eat(); // Parent / super
        tigerCubs.Lionfood();// derived
        //tigerCubs.TigerFood() // subclass
    }
}
