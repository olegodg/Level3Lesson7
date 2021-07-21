package ru.geekbrains.level3.lesson7;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Class justClassClass = JustClass.class;
        Object testObj = justClassClass.newInstance();
        Method[] methods = justClassClass.getDeclaredMethods();
        ArrayList<Method> al = new ArrayList<>();
        Method beforeMethod = null;
        Method afterMethod = null;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < methods.length; j++) {
                if (methods[j].getAnnotation(Test.class) != null) {
                    if (methods[j].getAnnotation(Test.class).priority() == j) {
                        al.add(methods[j]);
                    }
                }
            }
        }
        if (beforeMethod != null) beforeMethod.invoke(testObj, null);
        for (Method o : al) o.invoke(testObj, null);
        if (afterMethod != null) afterMethod.invoke(testObj, null);
    }
}
