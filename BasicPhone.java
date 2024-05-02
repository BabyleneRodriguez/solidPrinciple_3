public class BasicPhone implements SmartPhone
{
    public void makeCall (String number) 
    {
        System.out.println("Basic Phone dialing the number.... ");
    }

     public void sendSMS (String number, String messages) 
    { 
        System.out.println("Number: " + number);
        System.out.println("Message: " + messages);
    }

    public void browseWeb (String url)
    {
        System.out.println("URL: " + url);
    }

    public void takePicture ()
    {
        System.out.println("Basic Phone include the capability to take a picture");
    }
    
}