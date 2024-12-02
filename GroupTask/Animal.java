package JavaGrpTask;

abstract class Animal1

    {
        abstract  void sound();
    }

    class Dog1 extends Animal1
    {
        @Override
        void sound()
        {
            System.out.println("dog barks");
        }
    }

    class Birds extends Animal1
    {
        @Override
        void sound()
        {
            System.out.println("the bird fly in the sky");
        }
    }

    class  Fish extends Animal1
    {
        @Override
        void sound()
        {
            System.out.println("fish swims in water");

        }
    }
    class Abstract
    {
        public static void main(String[] args) {
            Animal1 dog = new Dog1();
            dog.sound();
            Animal1 bird = new Birds();
            bird.sound();
            Animal1 fish = new Fish();
            fish.sound();
        }
    }


