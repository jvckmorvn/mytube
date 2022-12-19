package com.mytube;

public class EmailService implements Sendable {
  public void sendEmail(User user) {
    System.out.println("Notifying " + user.getEmail() + "...");
    System.out.println("Done!\n");
  }
}
