package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int bananas = 5;
        int weightBananas = 80;
        int milk = 2;
        int weightMilk = 105;
        int iceCream = 2;
        int weightIceCream = 100;
        int eggs = 4;
        int weightEggs = 70;
        int totalWeight = bananas * weightBananas + milk * weightMilk + iceCream * weightIceCream + eggs * weightEggs;
        System.out.println("Вес завтрака " + totalWeight + " в граммах");
        float kgTotalWeight = (float) totalWeight / 1000;
        System.out.println("Вес завтрака " + kgTotalWeight + " в киллограммах");


    }
}
