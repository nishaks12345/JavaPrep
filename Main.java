package com.prep;

public class Main
{

        public static void main(String[] args)
                throws CloneNotSupportedException
        {
            PrototypePattern a = new PrototypePattern(20, "GeeksForGeeks");
            // cloning 'a' and holding
            // new cloned object reference in b

            // down-casting as clone() return type is Object
            PrototypePattern b = (PrototypePattern)a.clone();

            System.out.println(b.i);
            System.out.println(b.s);
        }

}
