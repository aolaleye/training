package com.synechron.thisdemo.bean;

public class User {
   // Instance Variable
   private int userId; // lower camelcase
   private String username;
   // Class level - sharable variable
   private static int count;

   static {
      User.count = 0;
   }

   // Class Level Variable


   public User() {
      User.count++;
   }

   public User(int userId, String username) {
      User.count++;
      this.setUserId(userId);
      this.username = username;
   }

   public void displayUserDetails() {
      // Local variable
      int userId = 1;
      String greetings = "Hello";
      System.out.println(greetings);
      System.out.println("Instance variable value " + this.getUserId());
      System.out.print("Local user id " + userId);
   }

   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public int getCount() {
      return count;
   }

   
}
