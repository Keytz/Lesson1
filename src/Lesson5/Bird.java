package Lesson5;

public class Bird extends Animal {
    public Bird(){
        this.runLimit=5;
        this.jumpLimit= 0.2F;
        this.swimLimit=0;
    }

    @Override
    public void jump(float distance) {
        if(this.jumpLimit>=distance){
            System.out.println("Bird jumps!");
        }
    }

    @Override
    public void run(float distance) {
        if(this.runLimit>=distance){
            System.out.println("Bird runs!");
        }
    }

    @Override
    public void swim(float distance) {
        System.out.println("Bird can't swim!");
    }

}