package day03.thisKeyword;

/**
 * @program: Java_Fundamentals
 * @description:简单java类
 * @author: Sam
 * @create: 2020-07-25 21:45
 */

/**
 * 核心开发结构：
 * 类名称一定要有意义，可以明确的描述某一事物；
 * 类之中的所有属性都必须使用private进行封装；
 * 类之中可以提供有无数多个构造方法，但是必须保留有无参构造方法；
 * 类之中不允许出现任何的输出语句，所有内容的获取必须返回；
 * 【非必须】可以提供有一个获取对象详细信息的方法，暂时将此方法名称定义为getinfo()；
 */
class Dept{
    private long deptno;
    private String dname;
    private String loc;
    public Dept(){//必须提供有无参构造
    }
    public Dept(long deptno,String dname, String loc){
        this.deptno=deptno;
        this.dname=dname;
        this.loc=loc;
    }
    public String getInfo(){
        return "部门编号"+this.deptno+"部门名称"+this.dname+"部门位置"+this.loc;
    }
    public void setDeptno(long deptno){
        this.deptno =deptno;
    }
    public long getdeptno(){
        return this.deptno;
    }
    public void setDname(String dname){
        this.dname = dname;
    }
    public String getDname(){
        return this.dname;
    }
    public void setLoc(String loc){
        this.loc = loc;
    }
    public String getloc(String loc){
        return this.loc;
    }

}
public class SimpleJavaClass {
    public static void main(String[] args) {
        Dept dept = new Dept(10,"技术部","北京");
        dept.getInfo();
    }
}
