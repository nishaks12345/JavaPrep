package com.prep;

    import java.lang.Cloneable;

    // By implementing Cloneable interface
// we make sure that instances of class A
// can be cloned.
    class PrototypePattern implements Cloneable {
        int i;
        String s;

        // A class constructor
        public PrototypePattern(int i, String s)
        {
            this.i = i;
            this.s = s;
        }

        // Overriding clone() method
        // by simply calling Object class
        // clone() method.
        @Override
        protected Object clone()
                throws CloneNotSupportedException
        {
            return super.clone();
        }
    }



