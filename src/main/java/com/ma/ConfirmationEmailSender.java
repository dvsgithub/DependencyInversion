package com.ma;

public class ConfirmationEmailSender implements ConfirmationSender {

    @Override
    public void sendConfirmation(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();
        System.out.println("Send confirmation to " + name + " on " + email);
    }

}
