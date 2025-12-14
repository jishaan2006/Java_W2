package lec19;

 class Voting_age {
     public static void main(String[] args) {
         try {
             voteAge(15);

         } catch (Exception e) {
             System.out.println(e);
         }
         try {
             voteAge(19);
         } catch (Exception e) {
             System.out.println(e);
         }
     }

     static void voteAge(int age) {
         System.out.println("Check for voting eligibility");
         if (age < 18) {
             throw new IllegalArgumentException("You cannot vote.");
         }else{
             System.out.println("You can vote");
         }
     }
 }

