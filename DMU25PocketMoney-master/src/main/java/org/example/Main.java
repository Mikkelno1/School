package org.example;

public class Main
{
    public static void main(String[] args)
    {
        //Her skal i, ved hjælp af constructorerne i parent og child klasserne,
        // o tilføje nogle værdier til
        //deres instans variabler
        Parent mom = new Parent("Karen", 500);
        Child child = new Child(mom);

        System.out.println("Parent childsName " + mom.nameHolderForChild.childsName);
        System.out.println("Parent pocketmoney " + mom.pocketMoney);
        System.out.println("Child childsName " + child.nameHolder.childsName);
        System.out.println("Child pocketmoney " + child.pocketMoney);

        child.changeName("Kristine");
        child.moreMoneyPlease(800);

        System.out.println("The childs new name is: " + child.nameHolder.childsName);
        System.out.println("The new amount of pocket money is: " + child.pocketMoney);



        //Her skal i, ved brug af child classen, ændre navn og lommepenge

    }
}