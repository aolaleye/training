package com.synechron.thisdemo.entrypoint;

import com.synechron.thisdemo.bean.User;

public class ApplicationMain {

   public static void main(String[] args) {
   // User user = new User();
      //user.displayUserDetails();

      User user1 = new User(1, "Ari");
      System.out.println(user1.getCount());
      User user2 = new User(2, "Ari1");
      System.out.println(user2.getCount());
      User user3 = new User(3, "Ari2");
      System.out.println(user3.getCount());
   }
}