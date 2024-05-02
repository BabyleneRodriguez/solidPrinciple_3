package applyingISP;

public class Smartphone 
{
    public static void main(String[] args) 
    {

        System.out.println(">>>>> IPHONE <<<<<\n");

        Iphone iphone = new Iphone();

        iphone.makeCall("09999999999");
        iphone.sendSMS("09999999999", "Hi!");
        iphone.browseWeb("www.example.com");
        iphone.takePicture();


        System.out.println("\n\n>>>>> SAMSUNG <<<<<\n");

        Samsung samsung = new Samsung();

        samsung.makeCall("09999999999");
        samsung.sendSMS("09999999999", "Hi!");
        samsung.browseWeb("www.example.com");
        samsung.takePicture();


        System.out.println("\n\n>>>>> BASIC PHONE <<<<<\n");

        BasicPhone basicPhone = new BasicPhone();

        basicPhone.makeCall("09999999999");
        basicPhone.sendSMS("09999999999", "Hi!");
       
    }
}
