/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tyler
 */
public class AnimalInput  {
    
    private ArrayList<Talkable>zoo;
    InputTypeVerfier it = new InputTypeVerfier();
    public AnimalInput()
    {
        
        zoo = new ArrayList<Talkable>();
        
    }

    public ArrayList<Talkable> getZoo() {
        return zoo;
    }
    
    public void prompt (ArrayList<Talkable> zoo)
    {
       
    
        System.out.println("Which are you looking for Cat, Dog, or Student? ");
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine().toLowerCase();
        int t = Integer.MAX_VALUE;
       
        switch(words)
        {
            case "cat":
                String cName;
                String mCaught;
                System.out.println("Enter a name for your cat: ");
                cName = scan.nextLine();
                System.out.println("Enter the amount of mice your cat has caught: ");
                mCaught = scan.nextLine();
                while(t == Integer.MAX_VALUE)
                {
                    try{
                   it.checkInt(mCaught);
                   t = 0;
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Please enter a number: ");
                        mCaught = scan.nextLine();
                    }
                }
                zoo.add(new Cat(it.checkInt(mCaught), cName));
                break;
                
            case "dog":
                String dName;
                boolean nice;
                char cFriendly;
                System.out.println("Whats the name of your dog? ");
                dName = scan.nextLine();
                System.out.println("Is your dog a friendly dog to others? (Y/N) ");
                cFriendly = scan.next().charAt(0);
                nice = checkNice(cFriendly);
                zoo.add(new Dog(nice, dName));
                break;
                
            case "student":
                String sName;
                String age;
                System.out.println("Whats the Students name? ");
                sName = scan.nextLine();
                System.out.println("Whats the Students age? ");
                age = scan.nextLine();
                while(t == Integer.MAX_VALUE)
                 {
                    try{
                   it.checkInt(age);
                   t = 0;
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Please enter a number: ");
                        age = scan.nextLine();
                    }
                }
                zoo.add(new Student(it.checkInt(age), sName));
        }

        
    }
    // convert the char  from Dog into a boolean
    public boolean checkNice(char cFriendly)
    {
     Scanner scan = new Scanner(System.in);
     boolean nice = false;
        switch(cFriendly)
        {
            case 'Y':
            case'y':
                return true;
            case'N':
            case'n':
                return false;
            default:
                System.out.println("Please enter a (Y/N");
                cFriendly = scan.next().charAt(0);
        }
       return nice;
    }
    
     
}
