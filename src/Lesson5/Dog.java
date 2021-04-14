package Lesson5;

public class Dog extends Animal {
    public Dog(){
        this.runLimit=500;
        this.jumpLimit= 0.5F;
        this.swimLimit=10;
    }

    @Override
    public void jump(float distance) {
        if(this.jumpLimit>=distance){
            System.out.println("Dog jumps!");
        }
    }

    @Override
    public void run(float distance) {
        if(this.runLimit>=distance){
            System.out.println("Dog runs");
        }
    }

    @Override
    public void swim(float distance) {
        if(swimLimit>=distance){
            System.out.println("Dog swims");
        }
    }

}
