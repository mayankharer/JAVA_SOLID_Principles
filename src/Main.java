package solidprinciples;

import solid_principles.dependancyInversionPrinciple.EmailService;
import solid_principles.dependancyInversionPrinciple.MessageService;
import solid_principles.dependancyInversionPrinciple.Notification;
import solid_principles.interfaceSegregationPrinciple.SimplePrinter;
import solid_principles.liskovPrinciple.Rectangle;
import solid_principles.openClosedPrinciple.Discount;
import solid_principles.openClosedPrinciple.PercentageDiscount;
import solid_principles.singleResponsibilityPrinciple.*;
import solid_principles.singleResponsibilityPrinciple.*;
import solid_principles.singleResponsibilityPrinciple.*;
import solid_principles.singleResponsibilityPrinciple.*;
import solid_principles.singleResponsibilityPrinciple.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 Running SOLID Principles Examples 🚀");
        Invoice invoice = new Invoice("Football",2,1000);
        new InvoicePrinter().printInvoice(invoice);

        Discount discount =  new PercentageDiscount(10);
        System.out.println("Discounted Price: " + discount.applyDiscount(5000));

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        MessageService emailService = new EmailService();
        new Notification(emailService).notifyUser("Welcome Email!");

        new SimplePrinter().print();

    }
}