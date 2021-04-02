package Lesson5;

public class Horse extends Animal {
    public Horse(){
        this.runLimit=1500;
        this.jumpLimit= 3;
        this.swimLimit=100;
    }

    @Override
    public void jump(float distance) {
        if(this.jumpLimit>=distance){
            System.out.println("Horse jumps!");
        }
    }

    @Override
    public void run(float distance) {
        if(this.runLimit>=distance){
            System.out.println("Horse runs!");
        }
    }

    @Override
    public void swim(float distance) {
        if(this.swimLimit>=distance){
            System.out.println("Horse swim!");
        }
    }

}