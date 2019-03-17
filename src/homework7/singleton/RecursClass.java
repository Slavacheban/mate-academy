package homework7.singleton;

import java.lang.reflect.Constructor;

public class RecursClass {
    public static void main(String[] args) throws Exception{
        SinglCount singlCount = SinglCount.getInstance();
        Class<SinglCount> clazz = SinglCount.class;
        Constructor<SinglCount> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SinglCount singlCount1 = constructor.newInstance();
        System.out.println(singlCount == singlCount1);
        System.out.println(singlCount.equals(singlCount1));
    }
}
