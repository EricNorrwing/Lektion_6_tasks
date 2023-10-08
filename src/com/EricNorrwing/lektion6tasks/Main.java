package com.EricNorrwing.lektion6tasks;

public class Main {
    public static void main(String[] args) {

        //Part 0



        //part1
        /*try{
            myTest();
        } catch(Error error){
            error.printStackTrace();

        }*/

        //Part 2
        //for
        /*try {
            System.out.println("sup my dudes");
            int[] finiteArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
            for (int i = 0; i <100; i++) {
                System.out.println(finiteArray[i]);
            }
        }catch(Error error){
            error.printStackTrace();
        }*/

        //Part 3
        //Uppgift 1

        for (int i = 0; i < 100; i++){
            System.out.println(i);
        }









    }




    //Part 1
    public static void myTest(){
        int part1 = 15;
        System.out.println(part1/0);
    }
}
