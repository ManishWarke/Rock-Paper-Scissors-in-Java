package com.manish.rps;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	static void Results(String playerMove, String computerMove) {
		//System.out.println(playerMove);
		if (playerMove.equals(computerMove)) {
	        System.out.println("The game was a tie!");
	      }
	      else if (playerMove.equals("rock")) {
	        if (computerMove.equals("paper")) {
	          System.out.println("You lose!");
	          
	        } else if (computerMove.equals("scissors")) {
	          System.out.println("You win!");
	        }
	      }
	      
	      else if (playerMove.equals("paper")) {
	        if (computerMove.equals("rock")) {
	          System.out.println("You win!");
	          
	        } else if (computerMove.equals("scissors")) {
	          System.out.println("You lose!");
	        }
	      }
	      
	      else if (playerMove.equals("scissors")) {
	        if (computerMove.equals("paper")) {
	          System.out.println("You win!");
	          
	        } else if (computerMove.equals("rock")) {
	          System.out.println("You lose!");
	        }
	      }
	
	}
	public static void main(String[] args) {  
	    
	    Scanner scanner = new Scanner(System.in);
	    //String[] rps = {"rock", "paper", "scissors"};
	    String playerMove;
	    {
	    	System.out.println("Welcome to rps");
	    }
	    while(true) {
	 // input from Player
	    while(true) {
	        System.out.println("Please enter your move (rock, paper, or scissors)");
	        playerMove = scanner.nextLine();
	        if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
	          break;
	        }
	        System.out.println(playerMove + " is not a valid move.");
	      }
	 // input from computer
	    Random random = new Random();
	    int randomNumber = random.nextInt(3);
	        
	    String computerMove;
	    if (randomNumber == 0) {
	        computerMove = "rock";
	    } else if (randomNumber == 1) {
	        computerMove = "paper";
	    } else {
	        computerMove = "scissors";
	    }
	    System.out.println("Computer played: " + computerMove);
	    Results(playerMove,computerMove);
	    System.out.println("Play again? (y/n)");
	      String playAgain = scanner.nextLine();
	      if (!playAgain.equals("y")) {
	          break;
	        }
	    }
	}
}
