package cn.kenny.spring.test;

/**
 * @author kenny_peng
 * @created 2019/9/11 15:18
 */
public class Test {

    public static void main(String[] args) {
        new Thread(()-> System.out.println("test")).start();

        Number i =0;
        Number m = 1;
        Double v = m.doubleValue();
        Double v1 = i.doubleValue();

        String fileName = "1111111111";
        String[] names = fileName.split("_");
        System.out.println(names[0]);


    }

    /**
     *　　　　　　　 ┏┓       ┏┓+ +
     *　　　　　　　┏┛┻━━━━━━━┛┻┓ + +
     *　　　　　　　┃　　　　　　 ┃
     *　　　　　　　┃　　　━　　　┃ ++ + + +
     *　　　　　　 █████━█████  ┃+
     *　　　　　　　┃　　　　　　 ┃ +
     *　　　　　　　┃　　　┻　　　┃
     *　　　　　　　┃　　　　　　 ┃ + +
     *　　　　　　　┗━━┓　　　 ┏━┛
      　　　　　　　　　┃　　　┃　Code is far away from     bug with the animal protecting
     *　　　　　　　　　┃　　　┃ + 　　　　         神兽保佑,代码无bug
     *　　　　　　　　　┃　 　 ┗━━━┓ + +
     *　　　　　　　　　┃ 　　　　　┣┓
     *　　　　　　　　　┃ 　　　　　┏┛
     *　　　　　　　　　┗┓┓┏━━━┳┓┏┛ + + + +
     *　　　　　　　　　 ┃┫┫　 ┃┫┫
     *　　　　　　　　　 ┗┻┛　 ┗┻┛+ + + +
     */


}
