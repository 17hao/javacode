package xyz.shiqihao.advanced.reflection;

import xyz.shiqihao.advanced.reflection.resource.MyClass;

import java.lang.reflect.Constructor;

/**
 * access constructor by reflection
 */
public class MyTest3 {
    public static void main(String[] args) {
        Class<MyClass> aClass = MyClass.class;
        Constructor<?>[] constructors = aClass.getConstructors();
        try {
            Constructor<?> constructor = aClass.getConstructor(String.class, String.class);
            System.out.println(constructor.getParameterCount());
            MyClass obj = (MyClass) constructor.newInstance("MyClass", "str2");
            System.out.println(obj.method2("this ", "is ", "method2"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}