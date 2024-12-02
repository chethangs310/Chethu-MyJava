package JavaGrpTask;

   abstract class Vehicle2
    {
        abstract  void start();
        abstract  void stop();
    }
    class Car1 extends Vehicle2
    {
        @Override
        void start()
        {
            System.out.println("car starts with key");

        }

        @Override
        void stop()
        {
            System.out.println("car stopes");

        }
    }

    class Bike extends Vehicle2
    {
        @Override
        void start()
        {
            System.out.println("bike strarts with kick");
        }

        @Override
        void stop()
        {
            System.out.println("bike stops");
        }
    }

    class Truck extends Vehicle2
    {
        @Override
        void start()
        {
            System.out.println("truck starts with key");
        }

        @Override
        void stop()
        {
            System.out.println("truck stopes");

        }
    }
       class Abstract2
    {
        public  static void main(String[] args)
        {
            Vehicle2 car1=new Car1();
            car1.start();
            car1.stop();
            Vehicle2 bike=new Bike();
            bike.start();
            bike.stop();
            Vehicle2 truck=new Truck();
            truck.start();
            truck.stop();
        }
    }


