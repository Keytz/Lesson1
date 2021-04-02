package Lesson5;

public class Cat extends Animal {
    public Cat(){
        this.runLimit=200;
        this.jumpLimit= 2;
        this.swimLimit=0;
    }

    @Override
    public void jump(float distance) {
        if(this.jumpLimit>=distance){
            System.out.println("Cat jumps!");
        }
    }

    @Override
    public void run(float distance) {
        if(this.runLimit>=distance){
            System.out.println("Cat runs!");
        }
    }

    @Override
    public void swim(float distance) {
        System.out.println("Cat can't swim!");
    }

}