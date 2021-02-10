package oop.workingwithInterfaces;

public class Room {

    ActivityInterface activityInterface = new Activity();

    public Room() {
    }

    public interface ActivityInterface {
        void playChess();
    }

    public void doSomethingInTheRoom() {
        activityInterface.playChess();
    }

}
