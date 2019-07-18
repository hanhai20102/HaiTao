package Muyuxi;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Muyuxi
 * @Date 2019/7/16
 * @Describtion
 */
public class TestGuava {

    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("5.20");
        BigDecimal b1 = new BigDecimal("0.2");
        System.out.println("加法的结果： "+bigDecimal.add(b1));
        System.out.println("减法的结果： "+bigDecimal.subtract(b1));
        System.out.println("乘法的结果： "+bigDecimal.multiply(b1));
        System.out.println("除法的结果： "+bigDecimal.divide(b1,2,RoundingMode.HALF_UP));

        testGuava();


    }

    /**
     * @Author Muyuxi
     * @Description //TODO
     * @Date 2019/7/17
     * @return void
     */
    public static void testGuava() {

        //字符串连接器  Joiner 实例是不可变的，对其的每个操作都返回一个新的实例，joiner实例是线程安全的
        Joiner joiner = Joiner.on(";").skipNulls();
        Joiner joiner1 = Joiner.on(",").useForNull("EMPTY");
        String res = joiner.join(Arrays.asList("Muyuxi","jjj",null,"zzz"));
        String res1 = joiner1.join(Arrays.asList("Muyuxi","jjj",null,"zzz"));
        System.out.println(res);
        System.out.println(res1);


        //Java字符串连接方式
/*        StringBuilder sb = new StringBuilder();
        ArrayList<String> strs = Lists.newArrayList("Muyuxi", " ", "jjj", , "lalala");
        for (String str: strs) {
            sb.append(str);
        }
        System.out.println(sb.toString());*/

        //拆分器
        Splitter splitter = Splitter.on(",").trimResults().omitEmptyStrings();
        List<String> split = splitter.splitToList("foo,bar,,   qux");
        System.out.println(split);
        for (String str : split) {
            System.out.println(str);
        }



    }
}
