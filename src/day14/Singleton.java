package day14;

/**
 * @ClassName Singleton
 * @Deacription: 单例模式
 * @Author zzx
 * @Date 2020/8/28 13:59
 **/

public class Singleton {
    private static volatile Singleton singleton;

    public static Singleton getSingleton(){
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}
