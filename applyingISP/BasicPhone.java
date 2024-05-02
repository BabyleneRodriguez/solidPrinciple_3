package applyingISP;

public class BasicPhone implements Call, Sms
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
}
