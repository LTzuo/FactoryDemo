package com.ltz.factorydemo.factory;

/**
 * 工厂类（果汁机）
 * Created by 1 on 2017/11/13.
 */
public class JuiceFactory {
    /**
     * 根据名称来生产不同的果汁
     * @param name
     * @return
     */
    public static IJuice createJuice(String name){
        IJuice iJuice = null;
        if(name.equals("apple")){
            //苹果汁
            iJuice = new AppleJuice() ;
        }else if(name.equals("orange")){
            //桔子汁
            iJuice = new OrangeJuice() ;
        }
        return iJuice ;
    }
}
