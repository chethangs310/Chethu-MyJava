public class All_dataTypes {

        //Primitive_data_types
        int a = 5;
        double b = 6.3;
        short c = 2;
        float d = 3.4F;
        boolean e = true;
        long f = 45;
        char g = 'm';

        //wrapper data types
        Integer a1 = 40;
        Double b1 = 4.9;
        Short c1 = 5;
        Float d1 = 2.7F;
        Boolean e1 = false;
        Long f1 = 35L;


        public static void main (String[] args)
        {
            All_dataTypes d = new All_dataTypes();

            System.out.println("*********Primitive data types **********");
            System.out.println(d.a + " is Int");
            System.out.println(d.b + " is decimal");
            System.out.println(d.c + " is short");
            System.out.println(d.d + " is float");
            System.out.println(d.e + " is Boolean");
            System.out.println(d.f + " is long");
            System.out.println(d.g + " is char");

            System.out.println("************Wrapper data types ***********");
            System.out.println(d.a1 + " is Int");
            System.out.println(d.b1 + " is decimal");
            System.out.println(d.c1 + " is short");
            System.out.println(d.d1 + " is float");
            System.out.println(d.e1 + " is Boolean");
            System.out.println(d.f1 + " is long");

        }

    }
