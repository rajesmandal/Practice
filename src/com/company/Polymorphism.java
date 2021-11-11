package com.company;

public class Polymorphism {

        public Polymorphism()
        {

            System.out.println("i am poly");

        }

        public Polymorphism(int a)
        {
            System.out.println("I am int a");
        }

        void t1()
        {
            System.out.println("Hi i am 1");
        }



    }
    class B extends Polymorphism
    {
        @Override
        void t1()
        {
            System.out.println("Hi i am class b");
            super.t1();
        }

    }
