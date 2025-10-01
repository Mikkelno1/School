package org.example;

//Denne klasse holder information om barnet, såsom dets lommepenge og navn.
public class Child
{
    public NameHolder nameHolder;
    public int pocketMoney;

    //Constructor for barneklassen, tager en parameter, en forælder (parent)
    //og sætter barnets information ud fra forælderen
    public Child(Parent parent)
    {
        nameHolder = parent.nameHolderForChild;
        pocketMoney = parent.pocketMoney;
    }

    //denne metoder ændrer barnets navn
    public void changeName(String newName)
    {
        nameHolder.childsName = newName;
    }

    //denne metode ændrer barnets lommepenge
    public void moreMoneyPlease(int newPocketMoney)
    {
        pocketMoney = newPocketMoney;
    }
}
