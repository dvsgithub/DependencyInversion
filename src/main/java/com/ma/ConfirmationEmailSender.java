package com.ma;

public class ConfirmationEmailSender {

    public void sendConfirmationEmail(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();
        System.out.println("Send confirmation to " + name + " on " + email);
    }

}
