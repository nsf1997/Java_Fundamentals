package day04.Case;

/**
 * @program: Java_Fundamentals
 * @description: 案例分析1
 * @author: Sam
 * @create: 2020-07-26 17:56
 */
class Address{
    private String country;
    private String city;
    private String province;
    private String street;
    private int postcode;

    public Address(){
        //简单JAVA类一定要有无参构造
    }
    public Address(String country,String province, String city, String street, int postcode){
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
    public void setProvince(String province){
        this.province = province;
    }
    public String getProvince(){
        return this.province;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String getStreet(){
        return this.street;
    }
    public void setPostcode(int postcode){
        this.postcode = postcode;
    }
    public int getPostcode(){
        return this.postcode;
    }
    public String getInfo(){
        return "国家："+this.country+
                "\t省份："+this.province+
                "\t城市："+this.city+
                "\t街道："+this.street+
                "\t邮政编码："+this.postcode;
    }

}
public class Case01 {
    public static void main(String[] args) {
        System.out.println(new Address("中国","江苏","苏州","长桥街道",215100).getInfo());

    }
}
