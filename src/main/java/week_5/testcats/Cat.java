/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_5.testcats;

/**
 *
 * @author business
 */
class Cat {
    String name;

    public Cat(String name) 
    {
        this.name = name;
    }

    public void comm() 
    {
        System.out.println(name + " says: Meow!");
    }

    public void hunt() 
    {
        System.out.println(name + " is purring.");
    }
}
