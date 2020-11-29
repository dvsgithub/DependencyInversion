package com.ma;

public class ConfirmationSmsSender implements ConfirmationSender {

    @Override
    public void sendConfirmation(Order order) {
        String name = order.getCustomerName();
        String phone = order.getPhoneNumber();
        System.out.println("Send confirmation to " + name + " on " + phone);
    }
}
