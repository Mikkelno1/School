package org.example;

//denne klasse holder information om en forælder, såsom et navn til deres barn
public class Parent
{
    public NameHolder nameHolderForChild = new NameHolder();
    public int pocketMoney;

    //constructor for forælderklassen, tager et navn (string) til barnet og lommepenge (en int) til barnet
    public Parent(String nameOfChild, int pocketMoney)
    {
        this.nameHolderForChild.childsName = nameOfChild;
        this.pocketMoney = pocketMoney;
    }
}
